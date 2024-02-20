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

    public Hotel(){

    }

    public Hotel(String cpnj, String nomeOficial, String nomeCriacao, Data dataCriacao, Endereco endereco, int numeroEstrelas, boolean aceitaPets, int numeroQuartos, Horario check_in, Horario check_out, String fraseDivulgacao, String descricaoHotel, int remuneracaoPagaPorDiaria) {
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
}
