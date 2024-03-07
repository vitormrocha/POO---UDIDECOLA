public class Aviao {
    // ================================= Atributos
    private int anoFabricacao;
    private String nome;
    private String paisOrigem;
    private String empresaFabricante;
    private int numeroAssentosPrimeiraClasse;
    private int numeroAssentosClasseExecutiva;
    private int numeroAssentosClasseEconomica;

    // ================================= Construtores
    public Aviao(String nome, String paisOrigem, int anoFabricacao, String empresaFabricante,
                 int numeroAssentosPrimeiraClasse, int numeroAssentosClasseExecutiva,
                 int numeroAssentosClasseEconomica) {
        this.nome = nome;
        this.paisOrigem = paisOrigem;
        this.anoFabricacao = anoFabricacao;
        this.empresaFabricante = empresaFabricante;
        this.numeroAssentosPrimeiraClasse = numeroAssentosPrimeiraClasse;
        this.numeroAssentosClasseExecutiva = numeroAssentosClasseExecutiva;
        this.numeroAssentosClasseEconomica = numeroAssentosClasseEconomica;
    }

    // ================================= Getters e Setters

    public String getNome() { return nome;}

    public void setNome(String nome) {
        Boolean validadeDaString = stringValida(nome);

        if (!validadeDaString)
            throw new IllegalArgumentException("Forneça um nome válido!\n");

        this.nome = nome;
    }

    public String getPaisOrigem() { return paisOrigem; }
    public void setPaisOrigem(String paisOrigem) {
        Boolean validadeDaString = stringValida(paisOrigem);

        if (!validadeDaString)
            throw new IllegalArgumentException("Forneça um nome válido!\n");

        this.paisOrigem = paisOrigem;
    }

    public int getAnoFabricacao() { return anoFabricacao; }
    public void setAnoFabricacao(int anoFabricacao) {
        if (anoFabricacao < 1900)
            throw new IllegalArgumentException("Velho de mais para voar!\n");
        else this.anoFabricacao = anoFabricacao;
    }

    public String getEmpresaFabricante() { return empresaFabricante; }
    public void setEmpresaFabricante(String empresaFabricante) {
        Boolean validadeDaString = stringValida(empresaFabricante);

        if (!validadeDaString)
            throw new IllegalArgumentException("Forneça um nome válido!\n");
        else this.empresaFabricante = empresaFabricante;
    }

    // Os setters abaixo utilizam a math.max, ess é uma função estática da classe Math.
    // Se numeroAssentos for negativo, a função retornará zero, caso contrário, retornará numeroAssentos dado.

    public int getNumeroAssentosPrimeiraClasse() { return numeroAssentosPrimeiraClasse; }
    public void setNumeroAssentosPrimeiraClasse(int numeroAssentosPrimeiraClasse) {
        this.numeroAssentosPrimeiraClasse = Math.max(numeroAssentosPrimeiraClasse, 0);
    }

    public int getNumeroAssentosClasseExecutiva() { return numeroAssentosClasseExecutiva;}
    public void setNumeroAssentosClasseExecutiva(int numeroAssentosClasseExecutiva) {
        this.numeroAssentosClasseExecutiva = Math.max(numeroAssentosClasseExecutiva,0);
    }

    public int getNumeroAssentosClasseEconomica() { return numeroAssentosClasseEconomica; }

    public void setNumeroAssentosClasseEconomica(int numeroAssentosClasseEconomica) {
        this.numeroAssentosClasseEconomica = Math.max(numeroAssentosClasseEconomica,0);
    }

    // ================================= Outros Métodos
    public Boolean stringValida(String s) {
        return s != null && !s.trim().isEmpty();   // s.isEmpty() vem do java.lang.String
    }

    public void exibirAviao(){
        System.out.println("\nInformações do Avião:");
        System.out.println("- Ano de Fabricação  : " + nome);
        System.out.println("- Ano de Fabricação  : " + paisOrigem);
        System.out.println("- Ano de Fabricação  : " + anoFabricacao);
        System.out.println("- Empresa Fabricante : " + empresaFabricante);
        System.out.println("- A aeronave conta com " + numeroAssentosPrimeiraClasse + " poltronas de primeira Classe. ");
        System.out.println("- A aeronave conta com " + numeroAssentosClasseExecutiva + " poltronas de primeira Classe.");
        System.out.println("- A aeronave conta com " + numeroAssentosClasseEconomica + " poltronas de primeira Classe.");
    }
}