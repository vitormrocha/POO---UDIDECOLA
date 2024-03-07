import java.util.ArrayList;

public class UdiDecola {
    // ================================= Atributos
    private ArrayList<Aviao>        avioes;
    private ArrayList<Trecho>       trechos;
    private ArrayList<Funcionario>  funcionarios;
    private ArrayList<Cliente>      clientes;
    //private ArrayList<Historico>  historicos;
    private ArrayList<Hotel>        hoteis;

    // ================================= Construtor
    public UdiDecola() {
        this.avioes             = new ArrayList<>();
        this.trechos            = new ArrayList<>();
        this.funcionarios       = new ArrayList<>();
        this.clientes           = new ArrayList<>();
        //this.historicos         = new ArrayList<>();
        this.hoteis             = new ArrayList<>();
    }

    // ================================= Getters e Setters:

    public ArrayList<Aviao> getAvioes() { return avioes; }

    // ex da main: Trecho trecho = udi.getTrechos().get(2);
    public ArrayList<Trecho> getTrechos() { return trechos; }

    public ArrayList<Funcionario> getFuncionarios() { return funcionarios; }

    public ArrayList<Cliente> getClientes() { return clientes; }

    public ArrayList<Hotel> getHoteis() { return hoteis; }
    
    // ================================= Outros Métodos
    public void instanciarUdi(){

        criarAvioes();
        criarTrechos();
        criarFuncionarios();
        criarClientes();
        criarHotel();

        mostrarAvioes(avioes);
        mostrarTrechos(trechos);
        mostrarFuncionarios(funcionarios);
        mostrarClientes(clientes);
        mostrarHotel(hoteis);
    }


    public void     criarAvioes(){
        Aviao aviao1 = new Aviao("Boeing 747", "Estados Unidos", 1969, "Boeing",
                10, 50, 400);
        Aviao aviao2 = new Aviao("Airbus A380", "França", 2005, "Airbus",
                12, 76, 500);
        Aviao aviao3 = new Aviao("Boeing 787 Dreamliner", "Estados Unidos", 2011, "Boeing",
                8, 42, 210);
        Aviao aviao4 = new Aviao("Airbus A320", "França", 1988, "Airbus",
                6, 36, 120);
        Aviao aviao5 = new Aviao("Embraer E195-E2", "Brasil", 2019, "Embraer",
                4, 24, 118);

        this.avioes.add(aviao1);
        this.avioes.add(aviao2);
        this.avioes.add(aviao3);
        this.avioes.add(aviao4);
        this.avioes.add(aviao5);
    }
    public void     criarTrechos(){
        Trecho trecho1 = new Trecho("UDI12345", "São Paulo", "Aeroporto de Congonhas",  "Rio de Janeiro", "Aeroporto Santos Dumont", 250, 15, new Data (12,3,2024), new Horario(8, 0), new Horario(10, 0));
        Trecho trecho2 = new Trecho("UDI45678", "Rio de Janeiro", "Aeroporto Santos Dumont", "Brasília", "Aeroporto Internacional de Brasília", 300, 20, new Data (15,3,2024),new Horario(12, 0), new Horario(14, 30));
        Trecho trecho3 = new Trecho("UDI78999", "Brasília", "Aeroporto Internacional de Brasília", "Salvador", "Aeroporto Internacional de Salvador", 400,35, new Data (20,3,2024), new Horario(16, 30), new Horario(19, 0));
        Trecho trecho4 = new Trecho("UDI101", "Salvador", "Aeroporto Internacional de Salvador", "Fortaleza", "Aeroporto Internacional de Fortaleza", 350,40, new Data (7,3,2024), new Horario(9, 0), new Horario(11, 30));
        Trecho trecho5 = new Trecho("UDI202", "Fortaleza", "Aeroporto Internacional de Fortaleza", "Recife", "Aeroporto Internacional do Recife", 200, 45, new Data (11,3,2024),new Horario(14, 0), new Horario(15, 30));

        this.trechos.add(trecho1);
        this.trechos.add(trecho2);
        this.trechos.add(trecho3);
        this.trechos.add(trecho4);
        this.trechos.add(trecho5);
    }
    public void     criarFuncionarios(){
        Funcionario funcionario1 = new Funcionario("João Silva", new CPF(12345678900L), new Data(1, 1, 1980), new Data(1, 1, 2020), new Endereco("Rua A", 123, "Ap 101", "Cidade", "UF"), "joao@example.com", 10, new VIP(false, 0, new Data(1, 1, 2020)), 123456, 5, "Recepcionista", 2000.00);
        Funcionario funcionario2 = new Funcionario("Maria Oliveira", new CPF(98765432100L), new Data(1, 1, 1985), new Data(1, 1, 2022), new Endereco("Rua B", 456, "Ap 202", "Cidade", "UF"), "maria@example.com", 15, new VIP(true, 10, new Data(1, 1, 2022)), 789012, 8, "Gerente de Vendas", 3000.00);
        Funcionario funcionario3 = new Funcionario("Pedro Santos", new CPF(45678912300L), new Data(1, 1, 1990), new Data(1, 1, 2021), new Endereco("Rua C", 789, "Ap 303", "Cidade", "UF"), "pedro@example.com", 20, new VIP(true, 5, new Data(1, 1, 2021)), 345678, 10, "Cadastra Hotel", 2500.00);
        Funcionario funcionario4 = new Funcionario("Ana Pereira", new CPF(32165498700L), new Data(1, 1, 1983), new Data(1, 1, 2019), new Endereco("Rua D", 1011, "Ap 404", "Cidade", "UF"), "ana@example.com", 8, new VIP(false, 0, new Data(1, 1, 2019)), 901234, 3, "Atendente de Reservas", 1800.00);
        Funcionario funcionario5 = new Funcionario("Lucas Oliveira", new CPF(15975345600L), new Data(1, 1, 1987), new Data(1, 1, 2018), new Endereco("Rua E", 1213, "Ap 505", "Cidade", "UF"), "lucas@example.com", 12, new VIP(true, 15, new Data(1, 1, 2018)), 567890, 7, "Cadastra Hotel", 2700.00);

        this.funcionarios.add(funcionario1);
        this.funcionarios.add(funcionario2);
        this.funcionarios.add(funcionario3);
        this.funcionarios.add(funcionario4);
        this.funcionarios.add(funcionario5);
    }
    public void     criarClientes(){
        Cliente cliente1 = new Cliente("João", new CPF(38980558848L), new Data(15, 5, 1990), new Data(6, 3, 2024),
                new Endereco("Rua A", 123, "Complemento 1", "Cidade X", "Estado A"), "joao@email.com", 5, new VIP(true, 0.1, new Data(6, 3, 2024)));

        Cliente cliente2 = new Cliente("Maria", new CPF(38980558848L), new Data(20, 8, 1985), new Data(6, 3, 2024),
                new Endereco("Rua B", 456, "Complemento 2", "Cidade Y", "Estado B"), "maria@email.com", 10, new VIP(true, 0.5, new Data(6, 3, 2024)));

        Cliente cliente3 = new Cliente("Carlos", new CPF(38980558848L), new Data(10, 2, 1978), new Data(6, 3, 2024),
                new Endereco("Rua C", 789, "Complemento 3", "Cidade Z", "Estado C"), "carlos@email.com", 3, new VIP(false, 0.0, new Data(6, 3, 2024)));

        Cliente cliente4 = new Cliente("Ana", new CPF(38980558848L), new Data(25, 11, 1995), new Data(6, 3, 2024),
                new Endereco("Rua D", 321, "Complemento 4", "Cidade W", "Estado D"), "ana@email.com", 0, new VIP(true, 0.2, new Data(6, 3, 2024)));

        Cliente cliente5 = new Cliente("Pedro", new CPF(38980558848L), new Data(5, 7, 1980), new Data(6, 3, 2024),
                new Endereco("Rua E", 654, "Complemento 5", "Cidade V", "Estado E"), "pedro@email.com", 8, new VIP(true, 0.0, new Data(6, 3, 2024)));

        Cliente cliente6 = new Cliente("Lúcia", new CPF(38980558848L), new Data(12, 9, 1972), new Data(1, 1, 2022),
                new Endereco("Rua F", 987, "Complemento 6", "Cidade U", "Estado F"), "lucia@email.com", 7, new VIP(true, 0.3, new Data(6, 3, 2024)));

        Cliente cliente7 = new Cliente("Rafael", new CPF(38980558848L), new Data(8, 4, 1988), new Data(6, 3, 2024),
                new Endereco("Rua G", 123, "Complemento 7", "Cidade T", "Estado G"), "rafael@email.com", 4, new VIP(true, 0.15, new Data(6, 3, 2024)));

        Cliente cliente8 = new Cliente("Lucas", new CPF(38980558848L), new Data(18, 6, 1983), new Data(6, 3, 2024),
                new Endereco("Rua H", 456, "Complemento 8", "Cidade S", "Estado H"), "lucas@email.com", 9, new VIP(true, -0.1, new Data(6, 3, 2024)));

        Cliente cliente9 = new Cliente("Gilberto", new CPF(38980558848L), new Data(2, 4, 1997), new Data(6, 3, 2024),
                new Endereco("Rua I", 789, "Complemento 9", "Cidade R", "Estado I"), "cliente10@email.com", 2, new VIP(false,0.0,new Data(6, 3, 2024)));

        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        clientes.add(cliente5);
        clientes.add(cliente6);
        clientes.add(cliente7);
        clientes.add(cliente8);
        clientes.add(cliente9);
    }
    public void     criarHotel(){
        Hotel hotel1 =
                new Hotel("CNPJ1",
                        "Hotel A",
                        "Marketing A",
                        new Data(1, 1, 2022),
                        new Endereco("Rua A", 123, "Complemento 1", "Cidade X", "Estado A"),
                        3,
                        true,
                        new QuartosHotel(10, 10, 5, 3, 150.0, 200.0, 250.0, 300.0, 0.1),
                        new Horario(12, 0),
                        new Horario(14, 0),
                        "Frase de Divulgação A",
                        "Descrição do Hotel A",
                        100);

        Hotel hotel2 =
                new Hotel("CNPJ2",
                        "Hotel B",
                        "Marketing B",
                        new Data(2, 2, 2022),
                        new Endereco("Rua B", 456, "Complemento 2", "Cidade Y", "Estado B"),
                        4,
                        false,
                        new QuartosHotel(8, 12, 6, 4, 120.0, 180.0, 220.0, 280.0, 0.15),
                        new Horario(14, 0),
                        new Horario(16, 0),
                        "Frase de Divulgação B",
                        "Descrição do Hotel B", 120);

        Hotel hotel3 =
                new Hotel(
                        "CNPJ3",
                        "Hotel C",
                        "Marketing C",
                        new Data(3, 3, 2022),
                        new Endereco("Rua C", 789, "Complemento 3", "Cidade Z", "Estado C"),
                        5,
                        true,
                        new QuartosHotel(15, 8, 4, 2, 180.0, 250.0, 300.0, 350.0, 0.2),
                        new Horario(10, 0),
                        new Horario(12, 0),
                        "Frase de Divulgação C",
                        "Descrição do Hotel C", 150);

        Hotel hotel4 =
                new Hotel(
                        "CNPJ14",
                        "Hotel 14",
                        "Hotel Marketing 14",
                        new Data(1, 1, 2022),
                        new Endereco("Rua do Hotel 14", 1400, "Apto 14", "Cidade 14", "Estado 14"),
                        4,  // Número de estrelas
                        true,  // Aceita Pets
                        new QuartosHotel(14, 14, 14, 14, 100.0, 150.0, 200.0, 250.0, 0.1),
                        new Horario(12, 0),  // Check-in às 12:00
                        new Horario(14, 0),  // Check-out às 14:00
                        "Frase de Divulgação 14",
                        "Descrição do Hotel 14",
                        1400);  // Remuneração por Diária

        Hotel hotel5 =
                new Hotel(
                        "CNPJ15",
                        "Hotel 15",
                        "Hotel Marketing 15",
                        new Data(1, 1, 2022),
                        new Endereco("Rua do Hotel 15", 1500, "Apto 15", "Cidade 15", "Estado 15"),
                        3,  // Número de estrelas
                        false,  // Não aceita Pets
                        new QuartosHotel(15, 15, 15, 15, 120.0, 180.0, 240.0, 300.0, 0.15),
                        new Horario(13, 0),  // Check-in às 13:00
                        new Horario(15, 0),  // Check-out às 15:00
                        "Frase de Divulgação 15",
                        "Descrição do Hotel 15",
                        1500);  // Remuneração por Diária

        Hotel hotel6 =
                new Hotel(
                        "CNPJ16",
                        "Hotel 16",
                        "Hotel Marketing 16",
                        new Data(1, 1, 2022),
                        new Endereco("Rua do Hotel 16", 1600, "Apto 16", "Cidade 16", "Estado 16"),
                        5,  // Número de estrelas
                        true,  // Aceita Pets
                        new QuartosHotel(16, 16, 16, 16, 150.0, 200.0, 250.0, 300.0, 0.2),
                        new Horario(14, 0),  // Check-in às 14:00
                        new Horario(16, 0),  // Check-out às 16:00
                        "Frase de Divulgação 16",
                        "Descrição do Hotel 16",
                        1600);  // Remuneração por Diária


            hoteis.add(hotel1);
            hoteis.add(hotel2);
            hoteis.add(hotel3);
            hoteis.add(hotel4);
            hoteis.add(hotel5);
            hoteis.add(hotel6);
        }


    private void    mostrarClientes(ArrayList<Cliente> clientes) {
        int contador = 1;

        for (Cliente cliente : clientes) {
            System.out.print("[ " + contador + " ]");

            cliente.exibeCliente();

            System.out.print("\n\n");

            contador++;
        }
    }
    public void     mostrarAvioes(ArrayList<Aviao> avioes) {
        int contador = 1;
        for (Aviao aviao : avioes) {
            System.out.print("[ " + contador + " ]");
            aviao.exibirAviao();
            contador++;
            System.out.print("\n\n");
        }
    }
    public void     mostrarTrechos(ArrayList<Trecho> trechos) {
        int contador = 1;

        for (Trecho trecho : trechos) {
            System.out.print("[ " + contador + " ]");

            trecho.exibirTrecho();

            contador++;
            System.out.print("\n\n");
        }
    }
    public void     mostrarFuncionarios(ArrayList<Funcionario> funcionarios) {
        int contador = 1;
        for (Funcionario funcionario : funcionarios) {
            System.out.print("[ " + contador + " ]");

            System.out.println("Nome           : " + funcionario.getNome());
            System.out.println("CPF                 : " + funcionario.getCpf());
            System.out.println("Data de Nascimento  : " + funcionario.getDataNascimento());
            System.out.println("Data de Cadastro    : " + funcionario.getDataCadastro());

            Endereco endereco = funcionario.getEndereco();
            if (endereco != null) {
                System.out.println("Endereço            : " + endereco.getRua() + ", " + endereco.getNumero() +
                        ", " + endereco.getComplemento() + ", " + endereco.getCidade() + ", " +
                        endereco.getEstado());
            } else {
                System.out.println("Endereço: N/A");
            }

            System.out.println("Email               : " + funcionario.getEmail());
            System.out.println("Número de Compras   : " + funcionario.getNumeroCompras());

            VIP vip = funcionario.getVip();
            if (vip != null) {
                vip.exibeVIP();
            } else {
                System.out.println("Cliente VIP     : N/A");
            }

            System.out.println("N de Carteira de Trabalho  : " + funcionario.getNumeroCarteiraTrabalho());
            System.out.println("Qntd de Hotéis Cadastrados : " + funcionario.getQnt_HoteisCadastrados());
            System.out.println("Função do Funcionário      : " + funcionario.getFuncaoFuncionario());
            System.out.println("Salário                    : " + funcionario.getSalario());
            System.out.println("------");
            contador++;
            System.out.print("\n\n");
        }
    }
    public void     mostrarHotel(ArrayList<Hotel> hoteis){
        int contador = 1;

        for (Hotel hotel : hoteis) {
            System.out.print("[ " + contador + " ]");
            hotel.exibirHotel();
            contador++;
            System.out.print("\n\n");
        }
    }

}

