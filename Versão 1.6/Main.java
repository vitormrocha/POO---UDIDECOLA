import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Horario horarioC = new Horario (13, 45);
        Horario horarioS = new Horario (20, 45);
        Endereco testeEnd = new Endereco("Laranja",240,"Cond","Uber","MG");
        Data testeData = new Data (20,10,2003);
        Empresa testeE = new Empresa ("123","MagaLu", "ML", testeData,testeEnd);
        CompanhiaAerea testeComp = new CompanhiaAerea(testeE, 15, "0");

        //Trecho testeTrecho = new Trecho ("aaa22222","SP", "RJ", 250, testeComp,horarioC,horarioS);
        Voo testeVoo = new Voo ("aaa11111", "SP","RJ",250,testeComp,horarioS,horarioC,horarioS,horarioC,1,1,1,2,testeData);

        /* Opcoes pro usuario:
            setIndiceMes        : 1 a 12, de janeiro até dezembro respectivamente:
            setDiaSemana        : 1 a 7. Domingo até sabado respectivamente por padrao, mas podem oscilar dpendenddo do setOcorrenciaMensal
            setOcorrenciaMensal : ele pode reservar o voo para acontecer: Diariamente (0), Uma vez por mes (1), Duas vezes Por Mes (2), Quatro vezes por Mess (4).
            setModalidadeMensal : valores de 0 a 2 que influenciam situcoes:

              Todos respondem ao mes definido em setIndiceMes:

              // Reservas diariass
              setOcorrenciaMensal = 0, setDiaSemana e setModalidadeMensal não importam

              // UMA reserva no mês:
              setOcorrenciaMensal = 1, setModalidadeMensal não importa, setDiaSemana influencia                                 -> se for 1 será domingo, 2 segunda, e ressspectivamente

              // DUAS reservas no mes:
              setOcorrenciaMensal = 2, setModalidadeMensal = 1, setDiaSemana influencia                                         -> A primeira aparicao e ultima aparicao do dia da semana definido em setDiaSemana
              setOcorrenciaMensal = 2, setModalidadeMensal = 2, (setDiaSemana = 1) || (setDiaSemana = 2) || (setDiaSemana = 3 ) -> Se for 1 = primeira sexta-sabado, 2 = segunda sexta-sabado, 3 = ultima sexta-sabado
              setOcorrenciaMensal = 2, setModalidadeMensal = 3, setDiaSemana influencia                                         -> Se for 1 = domingo/segunda, 2= segunda/terca, 3= terca/quarta, e por aí vai. Até sabado

              // QUATRO reserva no mes:
              setOcorrenciaMensal = 4, setModalidadeMensal = 1, setDiaSemana influencia                                         -> Reservas para as quatro primeirass aparicoes do setDiaSemana nesse mes
              setOcorrenciaMensal = 4, setModalidadeMensal = 2, setDiaSemana não influencia                                     -> primeira ocorrencia de sexta/sabado do mes, pula uma semana, reserva a sexta/segunda
         */

        // Input artificial:
        testeVoo.setIndiceMes(2);           // 1 a 12 para os meses
        testeVoo.setDiaSemana(1);           // 1 = terça, 2 = quarta, 3 = quinta, 4 = sexta, 5 = sabado, 6 = domingo, 7 segunda. SE FOR setOcorrenciaMensal = 2, isso é diferente
        testeVoo.setOcorrenciaMensal(4);    // 0 = Diariamente, 1 = Uma vez por mes, 2 = Duas vezes por mes, 4 = 4 vezes por mes
        testeVoo.setModalidadeMensal(1);    // Cada mês tem uma modalidade, essa variavel ajuda nisso

        int opcao = testeVoo.getOcorrenciaMensal();                      // Escolher onde você está entrando no switch.

        // Essas chamadas são para alocar no mês pedido, a quantidade de ocorrencias:
        switch (opcao) {
            case 0:
                testeVoo.cadastrarVooDiarioNoMes();
                break;
            case 1:
                testeVoo.cadastrarVooUmaVezPorMes();
                break;
            case 2:
                testeVoo.cadastrarVooDuasVezesPorMes();
                break;
            case 4:
                testeVoo.cadastrarVooQuatroVezesPorMes();
                break;
            default:
                System.out.println("Opção inválida!");
        }

        testeVoo.exibirVoo();

    scanner.close();
    }
}
