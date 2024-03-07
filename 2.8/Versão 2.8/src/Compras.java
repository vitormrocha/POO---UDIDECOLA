import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Compras {

    private Cliente cliente;
    private Data hora_busca;
    private Data hora_compra;
    private Historico historica_compra;

    public Compras(Cliente cliente, Data hora_busca, Data hora_compra, Historico historica_compra) {
        setCliente(cliente);
        setHora_busca(hora_busca);
        setHora_compra(hora_compra);
        this.historica_compra = historica_compra;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Historico gethistorica_compra() {
        return historica_compra;
    }
    public void sethistorica_compra(Historico historica_compra) {
        this.historica_compra = historica_compra;
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

    public DatasProcuradas returnM_Datas() {
        DatasProcuradas retorno = null;
        int num = 0;

            for (DatasProcuradas data : historica_compra.getDatas_procuradas()) {
                if (data.getNum_pesquisa() > num ) {
                    num = data.getNum_pesquisa();
                    retorno = data;
                }
            }

        return retorno;
    }

    public TrechosProcurados returnM_Trechos() {
        TrechosProcurados retorno = null;
        int num = 0;

            for (TrechosProcurados trecho : historica_compra.getTrechos_procurados()) {
                if (trecho.getNum_pesquisa() > num) {
                    num = trecho.getNum_pesquisa();
                    retorno = trecho;
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


   /* public boolean comprar_passagem(Trecho trecho, Data hora_compra, int quantCompradas_Pass) {
        int temp_aux = 0; // feito para pegar a quantidade certa de pesquisas e adicionar no historica_compra

        if (!cliente.getVip().getEh_VIP()) {

            if (trecho.getPreco() * quantCompradas_Pass < cliente.getSaldo()) {
                for (historica_compra hist : historica_compra) {
                    // Verificar se o trecho já existe no histórico
                    if (hist.ExisteTrecho(trecho)) {
                        // Se existe, adiciona a compra ao trecho existente
                        for (TrechosProcurados trechoProcurado : hist.getTrechos_procurados()) { //vai ate a posicao do trecho e adiciona
                            if (trechoProcurado.getNome_destino().equals(trecho.getLocalSaida())) {
                                int novoNumPesquisa = trechoProcurado.getNum_pesquisa() + 1;
                                trechoProcurado.setNum_pesquisa(novoNumPesquisa);
                                temp_aux = trechoProcurado.getNum_pesquisa();
                            }
                        }
                    } else {
                        // Se não existe, cria um novo trecho no histórico
                        TrechosProcurados novoTrecho = new TrechosProcurados(1, trecho.getLocalSaida());
                        hist.AddTrecho(novoTrecho);
                        temp_aux = novoTrecho.getNum_pesquisa();
                    }
                }

                // Atualizar o saldo do cliente após a compra
                cliente.AddCompra();
                double novoSaldo = cliente.getSaldo() - trecho.getPreco();
                cliente.setSaldo((float) novoSaldo);

                // Adicionar a compra ao histórico geral
                historica_compra novaCompra = new historica_compra();
                DatasProcuradas novaData = new DatasProcuradas(hora_compra, temp_aux);
                novaCompra.AddDatas(novaData);
                novaCompra.AddTrecho(new TrechosProcurados(temp_aux, trecho.getLocalSaida()));
                historica_compra.add(novaCompra);
                return true;

            }
            else {
                return false;
            }
        }

        else
        { //Cliente é vip
            if (cliente.getSaldo() > (trecho.getPreco() * quantCompradas_Pass) * cliente.getVip().getDesconto() ) {
                for (historica_compra hist : historica_compra) {

                    if (hist.ExisteTrecho(trecho)) {

                        if (hist.ExisteTrecho(trecho)) {
                            for (TrechosProcurados trecho1 : hist.getTrechos_procurados()) { //mesma coisa de cima
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
                        hist.AddTrecho(novo);
                    }


                }

                //atualizar compra
                cliente.AddCompra();
                double novo2 = cliente.getSaldo() - (cliente.getVip().getDesconto() *(trecho.getPreco() * quantCompradas_Pass) );
                cliente.setSaldo((float) novo2);
                historica_compra novohistorica_compra = new historica_compra(new DatasProcuradas(hora_compra, temp_aux), new TrechosProcurados(temp_aux,trecho.getLocalSaida()));
                historica_compra.add(novohistorica_compra);
                return true;
                //atualizar historica_compra

            }
            else {
                return false;
            }
        }
    }*/

    private double Comprar_Passagem(Trecho trecho, Data Hora_Compra, int QuantCompras) {
        double retorno = 0;
    
        if (!cliente.getVip().getEh_VIP()) { // Cliente não é VIP
            if (cliente.getSaldo() >= trecho.getPreco() * QuantCompras) {
                // Cliente tem saldo suficiente para a compra
                double precoTotal = trecho.getPreco() * QuantCompras;
                retorno = precoTotal;
    
                // Atualizar o saldo do cliente
                double novoSaldo = cliente.getSaldo() - precoTotal;
                cliente.setSaldo(novoSaldo);
    
                // Atualizar o histórico de compras
                int temp_aux = 0;
                for (TrechosProcurados trechoHist : historica_compra.getTrechos_procurados()) {
                    if (historica_compra.ExisteTrecho(trecho) && historica_compra.getTrechos_procurados().equals(trechoHist)) {
                        temp_aux = trechoHist.getNum_pesquisa() + 1;
                        trechoHist.setNum_pesquisa(temp_aux);
                        break;
                    }
                }
    
                // Adicionar a compra ao histórico geral
                DatasProcuradas novaData = new DatasProcuradas(Hora_Compra, temp_aux);
                TrechosProcurados novoTrecho = new TrechosProcurados(temp_aux, trecho.getLocalSaida());
                //historica_compra.AddDatas(novaData);
                //historica_compra.AddTrecho(novoTrecho);

            }
            // Se o cliente não tem saldo suficiente, o retorno permanece 0
        } else { // Cliente é VIP
            double precoDesconto = trecho.getPreco() * QuantCompras * cliente.getVip().getDesconto();
            if (cliente.getSaldo() >= precoDesconto) {
                // Cliente tem saldo suficiente com o desconto
                retorno = precoDesconto;
    
                // Atualizar o saldo do cliente
                double novoSaldo = cliente.getSaldo() - precoDesconto;
                cliente.setSaldo(novoSaldo);
    
                // Atualizar o histórico de compras
                int temp_aux = 0;
                for (TrechosProcurados trechoHist : historica_compra.getTrechos_procurados()) {
                    if (historica_compra.ExisteTrecho(trecho) && historica_compra.getTrechos_procurados().equals(trechoHist)) {
                        temp_aux = trechoHist.getNum_pesquisa() + 1;
                        trechoHist.setNum_pesquisa(temp_aux);
                        break;
                    }
                }
    
                // Adicionar a compra ao histórico geral
                /* 
                DatasProcuradas novaData = new DatasProcuradas(Hora_Compra, temp_aux);
                TrechosProcurados novoTrecho = new TrechosProcurados(temp_aux, trecho.getLocalSaida());
                historica_compra.AddDatas(novaData);
                historica_compra.AddTrecho(novoTrecho); */ 
    
                // Atualizar método de pagamento e quantidade comprada no histórico
                //historica_compra.setMetodo_pagamento(metodo_pagamento);
                //historica_compra.setQuantcomprada_passagem(QuantCompras);
            }
            // Se o cliente não tem saldo suficiente com o desconto, o retorno permanece 0
        }
    
        return retorno;
    }

    private boolean Tem_Suficiente(double n1, double n2) {
        if (n1 > n2) 
            return true;
        else 
            return false;
    }
    private void UpdateSaldo(double valor) {
        cliente.setSaldo(cliente.getSaldo() - valor); 
    }

    private double Comprar_Quarto(Hotel hotel, int QuantCompras, int indice) {
        double retorno = 0;
        double preco1 = hotel.getQuartosHotel().getPrecoQuartoSingle() * QuantCompras;
        double preco2 = hotel.getQuartosHotel().getQntQuartosDuplos() * QuantCompras;
        double preco3 = hotel.getQuartosHotel().getPrecoQuartoTriplo() * QuantCompras;
        double luxo = hotel.getQuartosHotel().getPrecoQuartoLuxo() * QuantCompras;
        double saldoc = cliente.getSaldo();

        if (!cliente.getVip().getEh_VIP()) {
            switch (indice) {
                    case 1: if (Tem_Suficiente(saldoc, preco1)) {

                    }
            }   
        }
        else { //ele e vip

        }




        return retorno; 
    }

    


}


