public class Aviao {
    // ================================= Atributos
    private final int anoFabricacao;
    private String nome;
    private String paisOrigem;
    private final String empresaFabricante;
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

    public void exibirAviao(){
        System.out.println("\nInformações do Avião:");
        System.out.println("- Ano de Fabricação: " + nome);
        System.out.println("- Ano de Fabricação: " + paisOrigem);
        System.out.println("- Ano de Fabricação: " + anoFabricacao);
        System.out.println("- Empresa Fabricante: " + empresaFabricante);
        System.out.println("- A aeronave conta com " + numeroAssentosPrimeiraClasse + " poltronas de primeira Classe. ");
        System.out.println("- A aeronave conta com " + numeroAssentosClasseExecutiva + " poltronas de primeira Classe.");
        System.out.println("- A aeronave conta com " + numeroAssentosClasseEconomica + " poltronas de primeira Classe.");
    }
}