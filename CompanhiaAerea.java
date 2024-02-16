/*
    COMPANHIA AÉREA
    {
        - CNPJ
        - Nome oficial
        - Nome de Divulgação
        - Data de criação
        - Quanto paga para UdiDecola por passagem vendida
    }
*/
public class CompanhiaAerea {
    private String cpnj;
    private String nomeOficial;
    private String nomeCriacao;
    private double porcentagemPorPassagem;

    public CompanhiaAerea(String cpnj, String nomeOficial, String nomeCriacao, double porcentagemPorPassagem) {
        this.cpnj = cpnj;
        this.nomeOficial = nomeOficial;
        this.nomeCriacao = nomeCriacao;
        this.porcentagemPorPassagem = porcentagemPorPassagem;
    }

    public String getCpnj() {
        return cpnj;
    }

    public void setCpnj(String cpnj) {
        this.cpnj = cpnj;
    }

    public String getNomeOficial() {
        return nomeOficial;
    }

    public void setNomeOficial(String nomeOficial) {
        this.nomeOficial = nomeOficial;
    }

    public String getNomeCriacao() {
        return nomeCriacao;
    }

    public void setNomeCriacao(String nomeCriacao) {
        this.nomeCriacao = nomeCriacao;
    }

    public double getPorcentagemPorPassagem() {
        return porcentagemPorPassagem;
    }

    public void setPorcentagemPorPassagem(double porcentagemPorPassagem) {
        this.porcentagemPorPassagem = porcentagemPorPassagem;
    }
}
