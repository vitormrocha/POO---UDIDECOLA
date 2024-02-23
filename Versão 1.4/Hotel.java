import java.util.ArrayList;

/*
HOTÉIS
{
    - CNPJ
            - Nome oficial
        - Nome de divulgação
    - Endereço completo
        - Ano de criação
    - Número de estrelas
    - Se aceita pets
    - Número de quartos
    - Horário do Check-in e Check-out
        - Frase de divulgação
    - Descrição do Hotel
        - Cidade do Hotel
        - Quanto paga para UdiDecola por diária vendida

    - Para cada data mostrar o número de quartos disponíveis
    {
        Para quartos standard:
    {
        Existem quartos:
        {
                * Single
                * Duplos
                * Triplos
        }


        - Valor da diária de cada quarto
        {
                * Sem desconto
                * Valor do desconto
                * Valor com desconto
        }
    }

        Para quartos de luxo:
        {
            - Valor da diária do quarto
            {
                * Sem desconto
                * Valor do desconto
                    * Valor com desconto
            }
        }

    }

    - A depender da data escolhida o hotel deve ter a liberdade de aceitar ou não o cancelamento
}
*/

import java.util.ArrayList;

public class Hotel extends Empresa{
    private Endereco endereco;
    private int numeroEstrelas;
    private boolean aceitaPets;
    private int numeroQuartos;
    private Horario check_in;
    private Horario check_out;
    private String fraseDivulgacao;
    private String descricaoHotel;
    private int remuneracaoPagaPorDiaria;
    private double preco_buffet;
    private double preco_passagem;
    private int quant_passagens;
    private ArrayList <ProdutosOferecidos> produtos; 
    private int getQuantcompras_vip;
    private int quantcompras_vip;

    public ArrayList<ProdutosOferecidos> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<ProdutosOferecidos> produtos) {
        this.produtos = produtos;
    }

    public int getGetQuantcompras_vip() {
        return getQuantcompras_vip;
    }

    public void setGetQuantcompras_vip(int getQuantcompras_vip) {
        this.getQuantcompras_vip = getQuantcompras_vip;
    }

    public int getQuantcompras_vip() {
        return quantcompras_vip;
    }

    public void setQuantcompras_vip(int quantcompras_vip) {
        if (quantcompras_vip > 0)
            this.quantcompras_vip = quantcompras_vip;
        else 
            this.quant_passagens = 0;
    }

    public int getQuant_passagens() {
        return quant_passagens;
    }

    public void setQuant_passagens(int quant_passagens) {
        this.quant_passagens = quant_passagens;
    }


    public void AdicionarProduto(String nome_produto, double preco, int quant) {
        if (nome_produto.isEmpty() == false && preco > 0 && quant > 0) {
            ProdutosOferecidos product = new ProdutosOferecidos(nome_produto, preco, quant);
            produtos.add(product);
        }
        else 
            System.out.printf("\nPRODUTO INVALIDO.\n");
    }


    public Hotel(String cpnj, String nomeOficial, String nomeCriacao, Data dataCriacao, Endereco endereco, int numeroEstrelas, boolean aceitaPets, int numeroQuartos, Horario check_in, Horario check_out, String fraseDivulgacao, String descricaoHotel, int remuneracaoPagaPorDiaria, int quant_passagens, double preco_buffet, double preco_passagem, int quantcompras_vip) {
        super(cpnj, nomeOficial, nomeCriacao, dataCriacao, endereco);
        this.endereco = endereco;
        this.numeroEstrelas = numeroEstrelas;
        this.aceitaPets = aceitaPets;
        this.numeroQuartos = numeroQuartos;
        this.check_in = check_in;
        this.check_out = check_out;
        this.fraseDivulgacao = fraseDivulgacao;
        setDescricaoHotel(descricaoHotel);
        this.remuneracaoPagaPorDiaria = remuneracaoPagaPorDiaria;
        this.quant_passagens = quant_passagens;
        this.preco_buffet = preco_buffet;
        this.preco_passagem = preco_passagem; 
        this.produtos = new ArrayList<>();
        AdicionarProduto("Buffet", preco_buffet, 500);
        AdicionarProduto("Passagem", preco_passagem, quant_passagens);
        setQuantcompras_vip(quantcompras_vip);
    }

    public double getPreco_buffet() {
        return preco_buffet;
    }

    public void setPreco_buffet(double preco_buffet) {
        this.preco_buffet = preco_buffet;
    }

    public double getPreco_passagem() {
        return preco_passagem;
    }

    public void setPreco_passagem(double preco_passagem) {
        this.preco_passagem = preco_passagem;
    }


    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getNumeroEstrelas() {
        return numeroEstrelas;
    }

    public void setNumeroEstrelas(int numeroEstrelas) {
        this.numeroEstrelas = numeroEstrelas;
    }

    public boolean isAceitaPets() {
        return aceitaPets;
    }

    public void setAceitaPets(boolean aceitaPets) {
        this.aceitaPets = aceitaPets;
    }

    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    public Horario getCheck_in() {
        return check_in;
    }

    public void setCheck_in(Horario check_in) {
        this.check_in = check_in;
    }

    public Horario getCheck_out() {
        return check_out;
    }

    public void setCheck_out(Horario check_out) {
        this.check_out = check_out;
    }

    public String getFraseDivulgacao() {
        return fraseDivulgacao;
    }

    public void setFraseDivulgacao(String fraseDivulgacao) {
        this.fraseDivulgacao = fraseDivulgacao;
    }

    public String getDescricaoHotel() {
        return descricaoHotel;
    }

    public void setDescricaoHotel(String descricaoHotel) {
        if (descricaoHotel.isBlank() == false && descricaoHotel.isEmpty() == false)
            this.descricaoHotel = descricaoHotel;
        else 
            System.out.printf("\nDESCRICAO INVALIDA.\n");
    }

    public int getRemuneracaoPagaPorDiaria() {
        return remuneracaoPagaPorDiaria;
    }

    public void setRemuneracaoPagaPorDiaria(int remuneracaoPagaPorDiaria) {
        this.remuneracaoPagaPorDiaria = remuneracaoPagaPorDiaria;
    }

    public void exibir_opcoesCompra() {
        System.out.printf("\nOPCOES DE COMPRA: \n1: PASSAGEM POR \t[%2f].\n2 - BUFFET POR \t[%2f].\n", preco_passagem, preco_buffet);
    }

    public void exibir_maispesquisado() { //Ainda vou testar
        int aux = produtos.get(0).getVal_comprado();
        int i;
        for (i = 1; i < produtos.size(); i++) {
            int aux2 = produtos.get(i).getVal_comprado();
            if (aux2 > aux ) 
                    aux = aux2;
        }
        i--; //O metodo get tem uma exceção que da erro caso o valor dado nela seja maior ou igual ao size do arraylist. 

        System.out.printf("\nPRODUTO MAIS BUSCADO: \t[%s]\nCOM [%d] COMPRAS\n", produtos.get(i).getNome_produto(), produtos.get(i).getVal_comprado());
    }

    public void intro() {
        System.out.printf("\nBEM VINDE AO %s,ONDE NOSSO LEMA E:\n", super.getNomeOficial());
        System.out.printf("\t%s", fraseDivulgacao);
        System.out.printf("\n\nComo podemos lhe ajudar hoje?\n");
    }

    public void menu () {
        for (int i = 0; i < produtos.size(); i++) 
            System.out.printf("\nNOME PRODUTO:\t%s\nPRECO:\t%2f\nQUANTIA DISPONIVEL:\t%d", produtos.get(i).getNome_produto(), produtos.get(i).getPreco(), produtos.get(i).getQuant());
    }

    public boolean realizar_compra (int opcao, int num, Cliente cliente) {
        if (opcao > produtos.size() || opcao < 0 || num > produtos.get(opcao).getQuant() || num <= 0) 
            return false;
        else if (cliente.getContabancaria().getSaldo() < produtos.get(opcao).getPreco()) {
            System.out.printf("\nSALDO INSUFICIENTE.\n");
            return false;
        }
        else {
            cliente.getContabancaria().sacar(produtos.get(opcao).getPreco());
            HistoricoPesquisa hist = new HistoricoPesquisa(this, produtos.get(opcao), cliente, this.getDataCriacao(), num, this.getCheck_in());
            cliente.setHistorico(hist); // atualiza o historico
            int aux = produtos.get(opcao).getQuant();
            produtos.get(opcao).setQuant(aux - num);
            int aux2 = cliente.getNumeroCompras() + 1;
            cliente.setNumeroCompras(aux2);
            int temp = produtos.get(opcao).getVal_comprado() + num;
            produtos.get(opcao).setVal_comprado(temp);
            return true;
        }
    }
    /* 
    public boolean cliente_vip (Cliente cliente) {
        if (cliente.getNumeroCompras() >= quantcompras_vip) 
            return true;
        else 
            return false;
    }*/

   
}
