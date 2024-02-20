/*
- Nome oficial
    - Nome de divulgação
    - Endereço completo
    - Ano de criação
*/

public class Empresa {
    private String cpnj;
    private String nomeOficial;
    private String nomeCriacao;
    private Data dataCriacao;

    public Empresa(){

    }

    public Empresa(String cpnj, String nomeOficial, String nomeCriacao, Data dataCriacao) {
        this.cpnj = cpnj;
        this.nomeOficial = nomeOficial;
        this.nomeCriacao = nomeCriacao;
        this.dataCriacao = dataCriacao;
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

    public void setDataCriacao(Data dataCriacao){
        this.dataCriacao = dataCriacao;
    }

    public Data getDataCriacao() {
        return dataCriacao;
    }
}
