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
public class CompanhiaAerea extends Empresa{
    private double porcentagemPorPassagem;

    public CompanhiaAerea(String cpnj, String nomeOficial, String nomeCriacao, Data dataCriacao, double porcentagemPorPassagem) {
        super(cpnj, nomeOficial, nomeCriacao, dataCriacao); // Construir classe Empresa
        this.porcentagemPorPassagem = porcentagemPorPassagem;
    }

    public double getPorcentagemPorPassagem() {
        return porcentagemPorPassagem;
    }

    public void setPorcentagemPorPassagem(double porcentagemPorPassagem) {
        this.porcentagemPorPassagem = porcentagemPorPassagem;
    }
}
