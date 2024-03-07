public class Empresa {
    // ================================= Atributos
    private String cnpj;                        // CNPJ fornecido no cadastro
    private String nomeOficial;                 // nome oficial da empresa, nome juridico
    private String nomeMarketing;               // nome escolhido para o marketing da empresa
    private Data dataCriacao;                   // data da criacao
    private Endereco endereco;                  // eendereco comercial

    // ================================= Construtor:
    public Empresa(Data dataCriacao, Endereco endereco){
        this.dataCriacao = dataCriacao;
        this.endereco = endereco;
    }

    public Empresa(String cnpj, String nomeOficial, String nomeMarketing, Data dataCriacao, Endereco endereco) {
        this.cnpj = cnpj;
        this.nomeOficial = nomeOficial;
        this.nomeMarketing = nomeMarketing;
        this.dataCriacao = dataCriacao;
        this.endereco = endereco;
    }

    public Empresa() {}

    // ================================= Getters e Setters:
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        Boolean validadeDaString = stringValida(cnpj);

        if (!validadeDaString)
            throw new IllegalArgumentException("Forneça um CNPJ válido!\n");

        this.cnpj = cnpj;
    }

    public String getNomeOficial() {
        return nomeOficial;
    }

    public void setNomeOficial(String nomeOficial) {
        Boolean validadeDaString = stringValida(nomeOficial);

        if (!validadeDaString)
            throw new IllegalArgumentException("Forneça um nome!\n");

        this.nomeOficial = nomeOficial;
    }

    public String getNomeMarketing() {
        return nomeMarketing;
    }

    public void setNomeMarketing(String nomeMarketing) {
        Boolean validadeDaString = stringValida(nomeMarketing);

        if (!validadeDaString)
            throw new IllegalArgumentException("Forneça um nome válido!\n");

        this.nomeMarketing = nomeMarketing;
    }

    // Essas duas são usadas na classe companhiaAerea, não são redundantes ou inuteis:
    public Data getDataCriacao() { return dataCriacao; }
    public Endereco getEndereco () { return endereco; }

    // ================================= Outros Métodos
    // Retorna true se a string for vazia, e false caso contrário
    public Boolean stringValida(String s) {
        return s != null && !s.trim().isEmpty();   // s.isEmpty() vem do java.lang.String
    }

    public void exibirEmpresa(){
        System.out.println("\n> Empresa:");
        System.out.println("- CNPJ          : " + cnpj);
        System.out.println("- Nome Oficial  : " + nomeOficial);
        System.out.println("- Nome Marketing: " + nomeMarketing);
        System.out.print("- Data de Criacao: ");
        dataCriacao.exibeData();
        System.out.print("\n");
        System.out.print("\n- Endereco da sede: ");
        endereco.exibeEndereco();
    }
}