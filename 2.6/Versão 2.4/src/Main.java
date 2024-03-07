import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        // Instanciando todos os ob jetos
        Hotel           hotelMain               = hotelTeste();
        QuartosHotel    quartosMain             = quartosHotelTeste();
        Empresa         empresaMain             = empresaTesteParaComp();
        CompanhiaAerea  companhiaAereaMain      = companhiaAereaTeste();
        Aviao           aviaoMainA              = aviaoTesteA();
        Aviao           aviaoMainB              = aviaoTesteB();
        Voo             vooMainA                 = vooTesteA();
        Voo             vooMainB                 = vooTesteB();
        PassagemAerea   passagemAereaMainA       = passagemAereaTesteA();
        PassagemAerea   passagemAereaMainB       = passagemAereaTesteB();


        //====================================================== Colocando voosA no sistema:
        vooMainA.setIndiceMes(2);           // 1 a 12 para os meses
        vooMainA.setDiaSemana(1);           // 1 = terça, 2 = quarta, 3 = quinta, 4 = sexta, 5 = sabado, 6 = domingo, 7 segunda. SE FOR setOcorrenciaMensal = 2, isso é diferente
        vooMainA.setOcorrenciaMensal(4);    // 0 = Diariamente, 1 = Uma vez por mes, 2 = Duas vezes por mes, 4 = 4 vezes por mes
        vooMainA.setModalidadeMensal(1);    // Cada mês tem uma modalidade, essa variavel ajuda nisso

        int opcaoA = vooMainA.getOcorrenciaMensal();                      // Escolher onde você está entrando no switch.

        // Essas chamadas são para alocar no mês pedido, a quantidade de ocorrencias:
        switch (opcaoA) {
            case 0:
                vooMainA.cadastrarVooDiarioNoMes();
                break;
            case 1:
                vooMainA.cadastrarVooUmaVezPorMes();
                break;
            case 2:
                vooMainA.cadastrarVooDuasVezesPorMes();
                break;
            case 4:
                vooMainA.cadastrarVooQuatroVezesPorMes();
                break;
            default:
                System.out.println("Opção inválida!");
        }
        vooMainA.exibirVoo();

        //====================================================== Colocando voosA no sistema:
        vooMainB.setIndiceMes(2);           // 1 a 12 para os meses
        vooMainB.setDiaSemana(2);           // 1 = terça, 2 = quarta, 3 = quinta, 4 = sexta, 5 = sabado, 6 = domingo, 7 segunda. SE FOR setOcorrenciaMensal = 2, isso é diferente
        vooMainB.setOcorrenciaMensal(2);    // 0 = Diariamente, 1 = Uma vez por mes, 2 = Duas vezes por mes, 4 = 4 vezes por mes
        vooMainB.setModalidadeMensal(2);    // Cada mês tem uma modalidade, essa variavel ajuda nisso

        int opcaoB = vooMainB.getOcorrenciaMensal();                      // Escolher onde você está entrando no switch.

        // Essas chamadas são para alocar no mês pedido, a quantidade de ocorrencias:
        switch (opcaoB) {
            case 0:
                vooMainB.cadastrarVooDiarioNoMes();
                break;
            case 1:
                vooMainB.cadastrarVooUmaVezPorMes();
                break;
            case 2:
                vooMainB.cadastrarVooDuasVezesPorMes();
                break;
            case 4:
                vooMainB.cadastrarVooQuatroVezesPorMes();
                break;
            default:
                System.out.println("Opção inválida!");
        }
        vooMainB.exibirVoo();

        System.out.println("\n=========================== TESTE DE TRECHO ");

        ArrayList<Trecho> trechos = new ArrayList<>();

        trechos.add(vooMainA);
        trechos.add(vooMainB);

        for (Trecho trecho : trechos) {
            if (trecho instanceof Voo) {
                ((Voo) trecho).exibirVoo(); // Exibe os detalhes do Voo
            }
        }

        System.out.println("\n=========================== TESTE DE TRECHO FIM ");

        //====================================================== Exibições finais:
        System.out.println("\n====================================================== Exibicoees finais de todas as informacoes do sistema: ");
        hotelMain.exibirHotel();
        quartosMain.mostrarArrayQuartos();
        empresaMain.exibirEmpresa();
        companhiaAereaMain.exibeCompanhia();
        aviaoMainA.exibirAviao();
        aviaoMainB.exibirAviao();
        vooMainA.exibirVoo();
        vooMainB.exibirVoo();

        System.out.print("\n\n- Passagens restantes em A: ");
        passagemAereaMainA.exibirPassagemAerea();

        System.out.print("\n\n- Passagens restantes em B: ");
        passagemAereaMainB.exibirPassagemAerea();
    }

    // Hotel genérico pra teste
    private static Hotel hotelTeste() {
        Data dataCriacao            = dataCriacao();
        Endereco endereco           = endereco();
        QuartosHotel quartosHotel   = quartosHotelTeste();
        Horario Check_in            = Check_inTeste();
        Horario Check_out           = Check_outTeste();

        String nomeOficial          = "NOME OFICIAL";
        String nomeMarketing        = "NOME CRIACAO";
        String divulgacao           = "Hotel lindu demais!";
        String descricao            = "Hotel BAUM demais";

        return new Hotel("123", nomeOficial, nomeMarketing, dataCriacao, endereco,5,true, quartosHotel, Check_in, Check_out, divulgacao, descricao, 10);
    }

    // Endereco generico pra teste
    private static Endereco endereco(){ return new Endereco("Das oliveiras", 1395, "apto 302", "Udia", "MG"); }

    // Data genérica pra criacao das coisas
    private static Data dataCriacao(){ return new Data(1, 1, 2024); }

    // Criacao dos quartos:
    private static QuartosHotel quartosHotelTeste(){
        return new QuartosHotel(100, 200, 300, 50, 50, 100, 150, 200, 3);
    }

    // Horario de check_in e check_out
    private static Horario Check_inTeste(){ return new Horario(2, 0); }
    private static Horario Check_outTeste(){ return new Horario(2, 0); }

    // Empresa generica pra empresa da companhia:
    private static Empresa empresaTesteParaComp(){ return new Empresa("123456678","Voa Voa","Voabao",dataCriacao(),endereco()); }

    // A companhia aerea:
    private static CompanhiaAerea companhiaAereaTeste(){ return new CompanhiaAerea(empresaTesteParaComp(),15,dataCriacao()); }

    // Vip de test:
    private static VIP vipTeste (){ return new VIP(true,18,dataCriacao()); }

    // Avião que iremos ofertar o trecho de voo:
    private static Aviao aviaoTesteA(){ return new Aviao("Aviao AA", "Aaaaaa",1980,"Cha da tarde", 50,50,100); }

    private static Aviao aviaoTesteB(){ return new Aviao("Aviao BB", "Bbbbbbb",1990,"Cha da manha", 30,70,80); }

    // Criacao individual de um trecho:
    private static Trecho trechoTeste(){
        Data dataCriacao = dataCriacao();
        Horario horarioPartida = horarioGenericoPartida();
        Horario horarioChegada = horarioGenericoChegada();

        return new Trecho("aaa11111","SP","RJ",250,15,dataCriacao,horarioPartida,horarioChegada);
    }

    // E dado um trecho, criamos o voo:
    private static Voo vooTesteA(){
        Horario horarioPartida = horarioGenericoPartida();
        Horario horarioChegada = horarioGenericoChegada();

        return new Voo(trechoTeste().getCodigoIdentificador(),aviaoTesteA(),horarioPartida,horarioChegada,3,1,1,1);
    }

    private static Voo vooTesteB(){
        Horario horarioPartida = horarioGenericoPartida();
        Horario horarioChegada = horarioGenericoChegada();

        return new Voo(trechoTeste().getCodigoIdentificador(),aviaoTesteB(),horarioPartida,horarioChegada,3,1,1,1);
    }

    // Horarios genericos usados no trecho e no voo:
    private static Horario horarioGenericoPartida(){ return new Horario(10,0); }
    private static Horario horarioGenericoChegada(){ return new Horario(20,0); }

    private static PassagemAerea passagemAereaTesteA(){ return new PassagemAerea(companhiaAereaTeste(),vooTesteA(),vipTeste(),20,15,20,25); }

    private static PassagemAerea passagemAereaTesteB(){ return new PassagemAerea(companhiaAereaTeste(),vooTesteB(),vipTeste(),5,5,10,10); }
}