
public class Main {
    public static void main(String[] args) {
        // Criando uma instância de Empresa
        Empresa empresa = new Empresa("123456789", "Minha Empresa", "Empresa XYZ",
                new Data(1, 1, 2000), new Endereco("Rua Principal", 123, "Complemento", "Cidade", "Estado"));

        // Criando uma instância de CompanhiaAerea
        CompanhiaAerea companhiaAerea = new CompanhiaAerea(empresa, 10.0, "01/01/2022");

        // Criando uma instância de Trecho
        Trecho trecho = new Trecho("ABC12345", "São Paulo", "Rio de Janeiro", 150,
                10.0, "01/01/2022", new Horario(8, 0), new Horario(10, 0));

        // Criando uma instância de Voo
        Voo voo = new Voo(new Horario(8, 0), new Horario(10, 0), 3, 1, 1, 1,
                new Data(1, 3, 2024));
        voo.cadastrarVooDiarioNoMes();

        // Criando uma instância de Aviao
        Aviao aviao = new Aviao("Avião X", "Empresa XYZ", 2010, "Fabricante ABC",
                10, 20, 150);

        // Exibindo informações
        empresa.exibirEmpresa();
        companhiaAerea.exibeCompanhia();
        trecho.exibirTrecho();
        voo.exibirVoo();

        System.out.println("\n========= Agora, testes de compras =========\n");

        int retornosDePoltronas;

        for (int quantidade = 2; quantidade < 200; ){

            aviao.exibirAviao();

            System.out.println("\nAgora iremos comprar " + quantidade + " em cada classe.\n");

            retornosDePoltronas = aviao.comprarAssentosPrimeiraClasse(quantidade);
            aviao.poltronasRestantes(retornosDePoltronas);

            retornosDePoltronas = aviao.comprarAssentosClasseExecutiva(quantidade);
            aviao.poltronasRestantes(retornosDePoltronas);

            retornosDePoltronas = aviao.comprarAssentosClasseEconomica(quantidade);
            aviao.poltronasRestantes(retornosDePoltronas);

            quantidade = quantidade *2;

            System.out.println("\n======================================================");
        }
    }
}
