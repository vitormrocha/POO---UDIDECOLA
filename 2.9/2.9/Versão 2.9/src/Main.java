import java.util.ArrayList;

public class Main {
    Data data = new Data(3,9,2003);
    Data data2 = new Data(4,5,2006);
    Data data3 = new Data(1,2,2001);
    Data data4 = new Data(2,5,2009);

    Endereco e1 = new Endereco("Mangabeiras", 2343, "www", "Belo Horizonte", "MG");
    Endereco e2 = new Endereco("Santa", 324,"eee","Joao pessoa","Bras");

    Horario h1 = new Horario(4, 34);
    Horario h2 = new Horario(6,10);
    Horario h6 = new Horario(19, 32);


    Trecho trecho1 = new Trecho("UDI12345", "São Paulo", "Aeroporto de Congonhas",  "Rio de Janeiro", "Aeroporto Santos Dumont", 250, 15, new Data (12,3,2024), new Horario(8, 0), new Horario(10, 0));

    Cliente cliente1 = new Cliente("João", new CPF(38980558848L), new Data(15, 5, 1990), new Data(6, 3, 2024),
                new Endereco("Rua A", 123, "Complemento 1", "Cidade X", "Estado A"), "joao@email.com", 5, new VIP(true, 0.1, new Data(6, 3, 2024)));

    HistoricoPesquisa historicoPesquisa = new HistoricoPesquisa();
    

    CompanhiaAerea comp = new CompanhiaAerea(3.2, data2);
    

    Hotel hot1 = new Hotel("DHSDB", "COMP", "COMP2", data4, e1, 5, false, null, h2, h1, null, null, 0)
}

