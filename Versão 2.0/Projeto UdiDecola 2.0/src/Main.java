public class Main {
    public static void main(String[] args)
    {
        Data dataCriacao = new Data(1, 1, 2024);
        Endereco endereco = new Endereco("Das oliveiras", 1395, "apto 302", "Udia", "MG");
        QuartosHotel quartosHotel = new QuartosHotel(100, 200, 300, 50, 50, 100, 150, 200, 3);
        Horario Check_in = new Horario(2, 0);
        Horario Check_out = new Horario(10, 0);
        String divulgacao = "Hotel lindu demais!";
        Hotel hotel = new Hotel("123", "NOME OFICIAL", "NOME CRIACAO", dataCriacao, endereco, 5, true, quartosHotel, Check_in, Check_out, divulgacao,"Hotel BAUM demais", 10);



        //QuartosHotel quarto = hotel.getQuartosHotel();

        // mostrarQuartos(quarto, new Data(19, 12, 2003));
//        hotel.getQuartosHotel().hospedarSingle(new Data(19, 12, 2003), 5);
//
//        hotel.getQuartosHotel().hospedarSingle(new Data(19, 12, 2003), 3);
//
//        hotel.getQuartosHotel().hospedarSingle(new Data(5, 12, 2003), 4);
//
//        hotel.getQuartosHotel().hospedarSingle(new Data(5, 12, 2003), 6);
//
//        hotel.getQuartosHotel().hospedarSingle(new Data(6, 12, 2003), 10);
//
//        hotel.getQuartosHotel().hospedarSingle(new Data(19, 12, 2003), 16);

        Data checkIn = new Data(20, 1, 2024);
        Data checkOut = new Data(3, 2, 2024);
//        QuartosSingle single1 = new QuartosSingle(checkOut, 25, QuartosHotel.TipoQuarto.SINGLE);
//        QuartosDuplos duplo1 = new QuartosDuplos(checkIn, 60, QuartosHotel.TipoQuarto.DUPLO);
//        QuartosTriplos triplo1 = new QuartosTriplos(checkOut, 30, QuartosHotel.TipoQuarto.TRIPLO);
//
//        hotel.getQuartosHotel().adicionarQuarto(single1);
//        hotel.getQuartosHotel().adicionarQuarto(duplo1);
//        hotel.getQuartosHotel().adicionarQuarto(triplo1);

//        single1.setData(checkIn);
//        single1.setQntQuartosDisponiveis(76);

//        hotel.getQuartosHotel().adicionarQuarto(single1);

        //hotel.getQuartosHotel().mostrarArrayQuartos();


//        hotel.getQuartosHotel().hospedarDia(new Data(19, 12, 2003), 34, QuartosHotel.TipoQuarto.LUXO);

        boolean aux;

        aux = hotel.getQuartosHotel().hospedar(new Data(25, 1, 2024), new Data(3, 2, 2024), 50, QuartosHotel.TipoQuarto.SINGLE);
        System.out.println(aux);

        aux = hotel.getQuartosHotel().hospedar(new Data(29, 1, 2024), new Data(7, 2, 2024), 30, QuartosHotel.TipoQuarto.SINGLE);
        System.out.println(aux);

        //aux = hotel.getQuartosHotel().hospedar(new Data(10, 7, 2024), new Data(17, 7, 2024), 2, QuartosHotel.TipoQuarto.LUXO);

        aux = hotel.getQuartosHotel().hospedar(new Data(29, 1, 2024), new Data(7, 2, 2024), 30, QuartosHotel.TipoQuarto.SINGLE);
        System.out.println(aux);

//        hotel.getQuartosHotel().mostrarQuarto(4);
        hotel.getQuartosHotel().mostrarArrayQuartos();

        // Mostra a quantidade de objetos que existem na ArrayList
        System.out.println(hotel.getQuartosHotel().getQuartos().size());
    }
}