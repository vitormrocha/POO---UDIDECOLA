public class Trecho extends CompanhiaAerea{
    // ================================= Atributos
    private String codigoIdentificador;
    private String localSaida;
    private String localChegada;
    private float preco;
    private CompanhiaAerea companhiaAerea;
    private Horario horarioSaida;
    private Horario horarioChegada;

    // ================================= Construtores
    public Trecho(String codigoIdentificador, String localSaida, String localChegada, float preco, double porcentagem, String dataAdesao, Horario horarioSaida, Horario horarioChegada) {
        super(porcentagem, dataAdesao);
        this.codigoIdentificador = codigoIdentificador;
        this.localSaida = localSaida;
        this.localChegada = localChegada;
        this.preco = preco;
        this.horarioSaida = horarioSaida;
        this.horarioChegada = horarioChegada;
    }

    public Trecho() { super(); }

    // ================================= Getters e Setters

    public String getCodigoIdentificador() { return codigoIdentificador; }
    public void setCodigoIdentificador(String codigoIdentificador) {
        // Primeira verificacao. Tem que ter tamanho oitcho:
        if (codigoIdentificador.length() != 8) {
            throw new IllegalArgumentException("O código identificador deve ter 3 letras seguidas de 5 números.");
        }

        // Segunda verificacao! Foi feita a criacao de duas strings de apoio. Uma para receber as letras, pegamos de 0 até 3, depois de 3 até 8
        String letras = codigoIdentificador.substring(0, 3);
        String numeros = codigoIdentificador.substring(3, 8);

        // Agora, foi utilizada o método ".matches". Dado um parametro a esquerda, damos o escopo da verificacao à direita;

        // E o funcionamento dos if é: true se a string atual corresponder; caso contrário, retorna false:
        if (!letras.matches("[A-Za-z]+")) {
            throw new IllegalArgumentException("As três primeiras posições do código identificador devem ser letras.");
        }
        if (!numeros.matches("[0-9]+")) {
            throw new IllegalArgumentException("As cinco últimas posições do código identificador devem ser números.");
        }

        // Se o código chegar até aqui, sinal verde. Podeemos dar set.
        this.codigoIdentificador = codigoIdentificador;
    }

    public String getLocalSaida() { return localSaida; }
    public void setLocalSaida(String localSaida) {
        Boolean validadeDaString = stringValida(localSaida);

        if (!validadeDaString)
            throw new IllegalArgumentException("Forneça um local válido!\n");

        this.localSaida = localSaida;
    }

    public String getLocalChegada() { return localChegada; }
    public void setLocalChegada(String localChegada) {
        Boolean validadeDaString = stringValida(localChegada);

        if (!validadeDaString)
            throw new IllegalArgumentException("Forneça um local válido!\n");

        this.localChegada = localChegada;
    }

    public Horario getHorarioSaida() { return horarioSaida;}
    public void setHorarioSaida(Horario horarioSaida) {
        this.horarioSaida = horarioSaida;
    }

    public Horario getHorarioChegada() { return horarioChegada; }
    public void setHorarioChegada(Horario horarioChegada) {
        this.horarioChegada = horarioChegada;
    }

    // ================================= Outros Métodos
    public Boolean stringValida(String s) {
        return s != null && !s.trim().isEmpty();   // s.isEmpty() vem do java.lang.String
    }

    public void exibirTrecho(){
        System.out.println("\n> Informações do Trecho:");
        System.out.println("- ID do Trecho    : " + codigoIdentificador);
        System.out.println("- Local de partida: " + localSaida);
        System.out.println("- Local de chegada: " + localChegada);
        System.out.println("- Preço           : " + preco);
        System.out.println("- Horario esperado da saida   : " + horarioSaida);
        System.out.println("- Horario esperado de chegada : " + horarioChegada);
    }
}