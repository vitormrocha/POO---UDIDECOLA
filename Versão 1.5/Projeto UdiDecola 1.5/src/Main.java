import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    // Teste com construtor:
        Data dataTeste = new Data(20,10,2003);
        Endereco enderecoTeste = new Endereco("acerola",5233,"-","Uberlandia","MG");
        Empresa empresaTeste = new Empresa("53.543.070/0001-52","Alibaba", "AB", dataTeste, enderecoTeste);
        CompanhiaAerea companhiaTeste = new CompanhiaAerea(empresaTeste, 10,"20/10/2003");

        System.out.println("Informações da Companhia Aérea:");
        System.out.println("Porcentagem Por Passagem: " + companhiaTeste.getPorcentagemPorPassagem());
        System.out.println("Data de Adesão ao UD: " + companhiaTeste.getDataDeAdesaoAoUD());
        System.out.println("Empresa:");
        System.out.println("- CNPJ: " + companhiaTeste.getCnpj());
        System.out.println("- Nome Oficial: " + companhiaTeste.getNomeOficial());
        System.out.println("- Nome Marketing: " + companhiaTeste.getNomeMarketing());
        companhiaTeste.getDataCriacao().exibeData();
        System.out.println("- Endereço:");
        System.out.println("  - Rua: " + companhiaTeste.getEndereco().getRua());
        System.out.println("  - Número: " + companhiaTeste.getEndereco().getNumero());
        System.out.println("  - Complemento: " + companhiaTeste.getEndereco().getComplemento());
        System.out.println("  - Cidade: " + companhiaTeste.getEndereco().getCidade());
        System.out.println("  - Estado: " + companhiaTeste.getEndereco().getEstado());

        // Teste com leitura vinda do usuario:
        // Adesão ao UdiDecola é feita no próprio construtor!



        /*

        System.out.println("\n>> Ola!\n- Informe os dados de atuacao da sua empresa: ");
        System.out.println("Digite a rua:");
        String rua = scanner.next();
        System.out.println("Digite o número:");
        int numero = scanner.nextInt();
        System.out.println("Digite o complemento:");
        String complemento = scanner.next();
        System.out.println("Digite a cidade:");
        String cidade = scanner.next();
        System.out.println("Digite o estado:");
        String estado = scanner.next();

        Endereco enderecoLido = new Endereco(rua, numero, complemento, cidade, estado);

        // Solicita e lê os dados da empresa do usuário
        System.out.println("\n>> Informacoes de reconhecimento da sua empresa:");
        System.out.println("Digite o CNPJ:");
        String cnpj = scanner.next();
        System.out.println("Digite o nome oficial:");
        String nomeOficial = scanner.next();
        scanner.nextLine(); // Limpa o buffer
        System.out.println("Digite o nome de marketing:");
        String nomeMarketing = scanner.next();
        System.out.println("\n>> Agora sobre a data criacao da sua empresa:");
        System.out.println("Digite o dia:");
        int dia = scanner.nextInt();
        System.out.println("Digite o mês:");
        int mes = scanner.nextInt();
        System.out.println("Digite o ano:");
        int ano = scanner.nextInt();
        Data data = new Data(dia, mes, ano);

        Empresa empresaLeitura = new Empresa(cnpj, nomeOficial, nomeMarketing, data, enderecoLido);

        System.out.println("\n>> Concluindo as informacoes de cadastro, vamos a informacao monetária: ");
        // Solicita e lê os dados da companhia aérea do usuário
        System.out.println("Digite a porcentagem por passagem:");
        double porcentagemPorPassagem = scanner.nextDouble();
        scanner.nextLine();

        // Cria uma instância de CompanhiaAerea com os dados fornecidos pelo usuário
        CompanhiaAerea companhiaLeitura = new CompanhiaAerea(empresaLeitura, porcentagemPorPassagem,"vai_att_pra_hoje");

        System.out.println("Cadastro concluído em: " + companhiaLeitura.getDataDeAdesaoAoUD());

        System.out.println("\n\n[ Informações da Companhia Aérea ]");
        System.out.println("Porcentagem Por Passagem: " + companhiaLeitura.getPorcentagemPorPassagem());
        System.out.println("Data de Adesão ao UD: " + companhiaLeitura.getDataDeAdesaoAoUD());
        System.out.println("\n[ Informacoes da Empresa ]");
        System.out.println("- CNPJ: " + companhiaLeitura.getCnpj());
        System.out.println("- Nome Oficial: " + companhiaLeitura.getNomeOficial());
        System.out.println("- Nome Marketing: " + companhiaLeitura.getNomeMarketing());
        System.out.print("- ");
        companhiaLeitura.getDataCriacao().exibeData();
        System.out.println("- Endereço:");
        System.out.println("  - Rua: " + companhiaLeitura.getEndereco().getRua());
        System.out.println("  - Número: " + companhiaLeitura.getEndereco().getNumero());
        System.out.println("  - Complemento: " + companhiaLeitura.getEndereco().getComplemento());
        System.out.println("  - Cidade: " + companhiaLeitura.getEndereco().getCidade());
        System.out.println("  - Estado: " + companhiaLeitura.getEndereco().getEstado());


         */
    }
}