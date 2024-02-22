import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    // Teste com construtor:
        Data dataTeste = new Data(20,10,2003);
        Endereco enderecoTeste = new Endereco("acerola",5233,"-","Uberlandia","MG");
        Empresa empresaTeste = new Empresa("53.543.070/0001-52","Alibaba", "AB", dataTeste, enderecoTeste);
        CompanhiaAerea companhiaTeste = new CompanhiaAerea(10,"20/10/2003",empresaTeste);

        System.out.println("Informações da Companhia Aérea:");
        System.out.println("Porcentagem Por Passagem: " + companhiaTeste.getPorcentagemPorPassagem());
        System.out.println("Data de Adesão ao UD: " + companhiaTeste.getDataDeAdesaoAoUD());
        System.out.println("Empresa:");
        System.out.println("- CNPJ: " + companhiaTeste.getEmpresa().getCnpj());
        System.out.println("- Nome Oficial: " + companhiaTeste.getEmpresa().getNomeOficial());
        System.out.println("- Nome Marketing: " + companhiaTeste.getEmpresa().getNomeMarketing());
        companhiaTeste.getEmpresa().getDataCriacao().exibeData();
        System.out.println("- Endereço:");
        System.out.println("  - Rua: " + companhiaTeste.getEmpresa().getEndereco().getRua());
        System.out.println("  - Número: " + companhiaTeste.getEmpresa().getEndereco().getNumero());
        System.out.println("  - Complemento: " + companhiaTeste.getEmpresa().getEndereco().getComplemento());
        System.out.println("  - Cidade: " + companhiaTeste.getEmpresa().getEndereco().getCidade());
        System.out.println("  - Estado: " + companhiaTeste.getEmpresa().getEndereco().getEstado());

    // Teste com leitura vinda do usuario:
        // Adesão ao UdiDecola é feita no próprio construtor!

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
        CompanhiaAerea companhiaLeitura = new CompanhiaAerea(porcentagemPorPassagem,"vai_att_pra_hoje", empresaLeitura);

        System.out.println("Cadastro concluído em: " + companhiaLeitura.getDataDeAdesaoAoUD());

        System.out.println("\n\n[ Informações da Companhia Aérea ]");
        System.out.println("Porcentagem Por Passagem: " + companhiaLeitura.getPorcentagemPorPassagem());
        System.out.println("Data de Adesão ao UD: " + companhiaLeitura.getDataDeAdesaoAoUD());
        System.out.println("\n[ Informacoes da Empresa ]");
        System.out.println("- CNPJ: " + companhiaLeitura.getEmpresa().getCnpj());
        System.out.println("- Nome Oficial: " + companhiaLeitura.getEmpresa().getNomeOficial());
        System.out.println("- Nome Marketing: " + companhiaLeitura.getEmpresa().getNomeMarketing());
        System.out.print("- ");companhiaLeitura.getEmpresa().getDataCriacao().exibeData();
        System.out.println("- Endereço:");
        System.out.println("  - Rua: " + companhiaLeitura.getEmpresa().getEndereco().getRua());
        System.out.println("  - Número: " + companhiaLeitura.getEmpresa().getEndereco().getNumero());
        System.out.println("  - Complemento: " + companhiaLeitura.getEmpresa().getEndereco().getComplemento());
        System.out.println("  - Cidade: " + companhiaLeitura.getEmpresa().getEndereco().getCidade());
        System.out.println("  - Estado: " + companhiaLeitura.getEmpresa().getEndereco().getEstado());
    }
}