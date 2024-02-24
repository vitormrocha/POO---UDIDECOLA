public class Empresa {
    // ================================= Atributos
    private String cnpj;
    private String nomeOficial;
    private String nomeMarketing;
    private final Data dataCriacao;
    private final Endereco endereco;

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

        public Data getDataCriacao() {
            return dataCriacao;
        }

        public Endereco getEndereco () {
            return endereco;
        }

    // ================================= Outros Métodos
    // Retorna true se a string for vazia, e false caso contrário
    public Boolean stringValida(String s) {
        return s != null && !s.trim().isEmpty();   // s.isEmpty() vem do java.lang.String
    }



}
