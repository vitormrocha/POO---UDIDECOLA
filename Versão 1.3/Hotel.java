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

    public int getQuant_passagens() {
        return quant_passagens;
    }

    public void setQuant_passagens(int quant_passagens) {
        this.quant_passagens = quant_passagens;
    }

    public Hotel(){

    }

    public void AdicionarProduto(String nome_produto, double preco, int quant) {
        if (nome_produto.isEmpty() == false && preco > 0 && quant > 0) {
            ProdutosOferecidos product = new ProdutosOferecidos(nome_produto, preco, quant);
            produtos.add(product);
        }
        else 
            System.out.printf("\nPRODUTO INVALIDO.\n");
    }

    public Hotel(String cpnj, String nomeOficial, String nomeCriacao, Data dataCriacao, Endereco endereco, int numeroEstrelas, boolean aceitaPets, int numeroQuartos, Horario check_in, Horario check_out, String fraseDivulgacao, String descricaoHotel, int remuneracaoPagaPorDiaria, int quant_passagens, double preco_buffet, double preco_passagem) {
        super(cpnj, nomeOficial, nomeCriacao, dataCriacao);
        this.endereco = endereco;
        this.numeroEstrelas = numeroEstrelas;
        this.aceitaPets = aceitaPets;
        this.numeroQuartos = numeroQuartos;
        this.check_in = check_in;
        this.check_out = check_out;
        this.fraseDivulgacao = fraseDivulgacao;
        this.descricaoHotel = descricaoHotel;
        this.remuneracaoPagaPorDiaria = remuneracaoPagaPorDiaria;
        this.quant_passagens = quant_passagens;
        this.preco_buffet = preco_buffet;
        this.preco_passagem = preco_passagem; 
        AdicionarProduto("Buffet", preco_buffet, 100);
        AdicionarProduto("Passagem", preco_passagem, quant_passagens);
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
        this.descricaoHotel = descricaoHotel;
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
        ProdutosOferecidos aux = new ProdutosOferecidos();
        aux = produtos.get(0);
        for (int i = 1; i < produtos.size(); i++) {
            ProdutosOferecidos aux2 = new ProdutosOferecidos();
            aux2 = produtos.get(i);
            if (aux2.getQuant() > aux.getQuant() ) 
                    aux = aux2;
        }
        System.out.printf("\nPRODUTO MAIS BUSCADO: \t[%s]\n", aux.getNome_produto() );
    }

   
}
