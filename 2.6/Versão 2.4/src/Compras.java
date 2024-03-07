import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Compras {
    private Cliente cliente; 
    private Data hora_busca;
    private Data hora_compra;
    private ArrayList <Historico> historico;

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public ArrayList<Historico> getHistorico() {
        return historico;
    }
    public void setHistorico(ArrayList<Historico> historico) {
        this.historico = historico;
    }
    public Data getHora_busca() {
        return hora_busca;
    }
    public void setHora_busca(Data hora_busca) {
        this.hora_busca = hora_busca;
    }
    public Data getHora_compra() {
        return hora_compra;
    }
    public void setHora_compra(Data hora_compra) {
        this.hora_compra = hora_compra;
    }

    public void AddEndereco (Historico historico) {
        this.historico.add(historico);
    }

    public Compras(Cliente cliente, Data hora_busca, Data hora_compra) {
        setCliente(cliente);
        setHora_busca(hora_busca);
        setHora_compra(hora_compra);
        historico = new ArrayList<>();
    } 

    public DatasProcuradas returnM_Datas() { //metodo que retorna maior data 
        DatasProcuradas retorno = null;
        int Num = 0;
        if (!historico.isEmpty()) {
            // Percorre cada histórico na lista
            for (int i = 0; i < historico.size(); i++) {
                Historico histAux = historico.get(i);
    
                if (histAux.getDatas_procuradas() != null && !histAux.getDatas_procuradas().isEmpty()) {
                    // Percorre cada data procurada no histórico
                    for (int j = 0; j < histAux.getDatas_procuradas().size(); j++) {
                        DatasProcuradas data = histAux.getDatas_procuradas().get(j);
    
                        // Verifica se a quantidade de pesquisas é maior que a atual máxima
                        if (data.getNum_pesquisa() > Num) {
                            // Atualiza a máxima quantidade de pesquisas e a data correspondente
                            Num = data.getNum_pesquisa();
                            retorno = data;
                        }
                    }
                }
            }
        }
    
        // Retorna a DatasProcuradas com o maior número de pesquisas
        return retorno;
    }

    public TrechosProcurados returnM_Trechos() {
        TrechosProcurados retorno = null;
        int num = 0;

        if (!historico.isEmpty()) {
            for (int i = 0; i < historico.size(); i++) {
                Historico histaux = historico.get(i);

                if (histaux.getDatas_procuradas() != null && !histaux.getDatas_procuradas().isEmpty()) {
                    for (int j = 0; j < histaux.getTrechos_procurados().size(); j++) {
                        TrechosProcurados trechoaux = histaux.getTrechos_procurados().get(j);
                        if (trechoaux.getNum_pesquisa() > num) {
                            num = trechoaux.getNum_pesquisa();
                            retorno = trechoaux;
                        }
                    }
                }
            }
        }
        return retorno;
    }

    public void MostrarM_Data () {
        DatasProcuradas d = returnM_Datas();
        System.out.printf("\nData mais pesquisada:\t %d / %d / %d\n", d.getData().getDia(), d.getData().getMes(), d.getData().getAno());

    }

    public void MostrarM_Trecho() {
        TrechosProcurados t = returnM_Trechos();
        System.out.printf("\nTrecho mais pesquisado:\t %s\n",t.getNome_destino());
    }

    public void MostraM_Pesquisa() {
        MostrarM_Data();
        MostrarM_Trecho();
    }
    
    
    public boolean comprar_passagem(Trecho trecho, Data hora_compra, int quantCompradas) {
        int temp_aux = 0; // feito para pegar a quantidade certa de pesquisas e adicionar no historico

        if (!cliente.getVip().getEh_VIP()) {

                    if (trecho.getPreco() * quantCompradas < cliente.getSaldo()) {
                        for (Historico historicoCompra : historico) {
                            // Verificar se o trecho já existe no histórico
                            if (historicoCompra.ExisteTrecho(trecho)) {
                                // Se existe, adiciona a compra ao trecho existente
                                for (TrechosProcurados trechoProcurado : historicoCompra.getTrechos_procurados()) { //vai ate a posicao do trecho e adiciona
                                    if (trechoProcurado.getNome_destino().equals(trecho.getLocalSaida())) {
                                        int novoNumPesquisa = trechoProcurado.getNum_pesquisa() + 1;
                                        trechoProcurado.setNum_pesquisa(novoNumPesquisa);
                                        temp_aux = trechoProcurado.getNum_pesquisa();
                                    }
                                }
                            } else {
                                // Se não existe, cria um novo trecho no histórico
                                TrechosProcurados novoTrecho = new TrechosProcurados(1, trecho.getLocalSaida());
                                historicoCompra.AddTrecho(novoTrecho);
                                temp_aux = novoTrecho.getNum_pesquisa();
                            }
                        }
            
                        // Atualizar o saldo do cliente após a compra
                        cliente.AddCompra();
                        double novoSaldo = cliente.getSaldo() - trecho.getPreco();
                        cliente.setSaldo(novoSaldo);
            
                        // Adicionar a compra ao histórico geral
                        Historico novaCompra = new Historico();
                        DatasProcuradas novaData = new DatasProcuradas(hora_compra, temp_aux);
                        novaCompra.AddDatas(novaData);
                        novaCompra.AddTrecho(new TrechosProcurados(temp_aux, trecho.getLocalSaida()));
                        historico.add(novaCompra);
                        return true;
                        
            }
            else {
                return false;
            }
        }

        else 
        { //Cliente é vip
            if (cliente.getSaldo() > (trecho.getPreco() * quantCompradas) * cliente.getVip().getDesconto() ) {
                for (Historico historicocompra : historico) {

                    if (historicocompra.ExisteTrecho(trecho)) {

                            if (historicocompra.ExisteTrecho(trecho)) {
                                for (TrechosProcurados trecho1 : historicocompra.getTrechos_procurados()) { //mesma coisa de cima
                                    if (trecho1.getNome_destino().equals(trecho.getLocalSaida())) {

                                        int temp = trecho1.getNum_pesquisa() + 1;
                                        trecho1.setNum_pesquisa(temp);
                                        temp_aux = trecho1.getNum_pesquisa();
                                    }
                                }
                            }

                    }
                    else { //trecho nao existe
                        TrechosProcurados novo = new TrechosProcurados(1, trecho.getLocalSaida());
                        historicocompra.AddTrecho(novo);
                        }   


                }

                //atualizar compra
                cliente.AddCompra();
                double novo2 = cliente.getSaldo() - (cliente.getVip().getDesconto() *(trecho.getPreco() * quantCompradas) );
                cliente.setSaldo(novo2);
                Historico novoHistorico = new Historico(new DatasProcuradas(hora_compra, temp_aux), new TrechosProcurados(temp_aux,trecho.getLocalSaida()));
                historico.add(novoHistorico);
                return true;
                //atualizar historico

            }
            else {
                return false;
            }
        }
    }

    
    

    
}

