public class Aviao extends Voo {
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
            super();
            this.nome = nome;
            this.paisOrigem = paisOrigem;
            this.anoFabricacao = anoFabricacao;
            this.empresaFabricante = empresaFabricante;
            this.numeroAssentosPrimeiraClasse = numeroAssentosPrimeiraClasse;
            this.numeroAssentosClasseExecutiva = numeroAssentosClasseExecutiva;
            this.numeroAssentosClasseEconomica = numeroAssentosClasseEconomica;
        }

    // ================================= Getters e Setters

        public int getNumeroAssentosPrimeiraClasse() { return numeroAssentosPrimeiraClasse; }

        public void setNumeroAssentosPrimeiraClasse(int numeroAssentosPrimeiraClasse) {
            this.numeroAssentosPrimeiraClasse = numeroAssentosPrimeiraClasse;
        }

        public int getNumeroAssentosClasseExecutiva() { return numeroAssentosClasseExecutiva;}
        public void setNumeroAssentosClasseExecutiva(int numeroAssentosClasseExecutiva) {
            this.numeroAssentosClasseExecutiva = numeroAssentosClasseExecutiva;
        }

        public int getNumeroAssentosClasseEconomica() { return numeroAssentosClasseEconomica; }

        public void setNumeroAssentosClasseEconomica(int numeroAssentosClasseEconomica) {
            this.numeroAssentosClasseEconomica = numeroAssentosClasseEconomica;
        }

    // ================================= Outros Métodos

        private int comprarAssentos(int quantidade, int quantidadeAtual) {
            if (quantidadeAtual - quantidade >= 0) {
                quantidadeAtual -= quantidade;

                return quantidadeAtual;
            } else return -1;
        }

        public int comprarAssentosPrimeiraClasse(int quantidade) {
            int retorno = comprarAssentos(quantidade, numeroAssentosPrimeiraClasse);

            if (retorno == -1) {
                System.out.println("Opa, não há poltronas o suficientes! Temos " + getNumeroAssentosPrimeiraClasse() + " poltronas de primeira classe");
            }  else setNumeroAssentosPrimeiraClasse(retorno);

            return getNumeroAssentosPrimeiraClasse();
        }

    public int comprarAssentosClasseExecutiva(int quantidade) {
        int retorno = comprarAssentos(quantidade, numeroAssentosClasseExecutiva);

        if (retorno == -1) {
            System.out.println("Opa, não há poltronas o suficientes! Temos " + getNumeroAssentosClasseExecutiva() + " poltronas na classe executiva ");
        } else setNumeroAssentosClasseExecutiva(retorno);

        return getNumeroAssentosClasseExecutiva();
    }

    public int comprarAssentosClasseEconomica(int quantidade) {
        int retorno = comprarAssentos(quantidade, numeroAssentosClasseEconomica);

        if (retorno == -1) {
            System.out.println("Opa, não há poltronas o suficientes! Temos " + getNumeroAssentosClasseEconomica() + " poltronas na classe econômica ");
        } else {
            setNumeroAssentosClasseEconomica(retorno);
        }
        return getNumeroAssentosClasseEconomica();
    }

    public void poltronasRestantes (int qtd) {
        System.out.println("Restaram : " + qtd);
    }

    public void exibirAviao(){
        System.out.println("\nInformações do Avião:");
        System.out.println("- Ano de Fabricação: " + nome);
        System.out.println("- Ano de Fabricação: " + paisOrigem);
        System.out.println("- Ano de Fabricação: " + anoFabricacao);
        System.out.println("- Empresa Fabricante: " + empresaFabricante);
        System.out.println("- Número de Assentos na Primeira Classe: " + numeroAssentosPrimeiraClasse);
        System.out.println("- Número de Assentos na Classe Executiva: " + numeroAssentosClasseExecutiva);
        System.out.println("- Número de Assentos na Classe Econômica: " + numeroAssentosClasseEconomica);
    }
}
