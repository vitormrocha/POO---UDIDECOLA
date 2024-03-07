public class Trecho{
    // ================================= Atributos
    private String codigoIdentificador;     // código desse trecho de viagem
    private String localSaida;              // local de origem
    private String nomeAeroportoSaida;      // Nome do aeroporto que está ofertando o trecho
    private String localChegada;            // local de destino
    private String nomeAeroportoChegada;    // Nome do aeroporto que está ofertando o trecho
    private float preco;                    // preco base do voo
    private float porcentagem;
    private Horario horarioSaida;           // horario que será mostrado no site
    private Horario horarioChegada;         // horario que será mostrado no site

    // ================================= Construtores
    public Trecho(String codigoIdentificador, String localSaida, String nomeAeroportoSaida, String localChegada,String nomeAeroportoChegada, float preco, float porcentagem, Data dataAdesao, Horario horarioSaida, Horario horarioChegada) {
        this.codigoIdentificador = codigoIdentificador;
        this.localSaida = localSaida;
        this.nomeAeroportoSaida= nomeAeroportoSaida;
        this.localChegada = localChegada;
        this.nomeAeroportoChegada = nomeAeroportoChegada;
        this.preco = preco;
        this.porcentagem= porcentagem;
        this.horarioSaida = horarioSaida;
        this.horarioChegada = horarioChegada;
    }

    public Trecho(String codigoIdentificador) {
        this.codigoIdentificador = getCodigoIdentificador();
    }

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

    public String getNomeAeroportoSaida() { return nomeAeroportoSaida; }
    public void setNomeAeroportoSaida(String nomeAeroportoSaida) {
        Boolean validadeDaString = stringValida(nomeAeroportoSaida);

        if (!validadeDaString)
            throw new IllegalArgumentException("Forneça um local válido!\n");

        this.nomeAeroportoSaida = nomeAeroportoSaida;
    }

    public String getNomeAeroportoChegada() { return nomeAeroportoChegada; }
    public void setNomeAeroportoChegada(String nomeAeroportoChegada) {
        Boolean validadeDaString = stringValida(nomeAeroportoChegada);

        if (!validadeDaString)
            throw new IllegalArgumentException("Forneça um local válido!\n");

        this.nomeAeroportoChegada = nomeAeroportoChegada;
    }

    public Horario getHorarioSaida() { return horarioSaida;}
    public void setHorarioSaida(Horario horarioSaida) {
        if ((horarioSaida.getHora() < 0) || (horarioSaida.getMinuto() < 0))
            throw new IllegalArgumentException("Horario invalido!");

        this.horarioSaida = horarioSaida;
    }

    public Horario getHorarioChegada() { return horarioChegada; }
    public void setHorarioChegada(Horario horarioChegada) {
        if ((horarioChegada.getHora() < 0) || (horarioChegada.getMinuto() < 0))
            throw new IllegalArgumentException("Horario invalido!");

        this.horarioChegada = horarioChegada;
    }

    public float getPreco() { return preco; }
    public void setPreco(float preco) {
        if (preco > 0)
            this.preco = preco;
        else throw new IllegalArgumentException("Forneça uma ocorrencia válido!\n");
    }

    public float getPorcentagem() { return porcentagem; }
    public void setPorcentagem(float porcentagem) {
        if ((porcentagem > 0) ||(porcentagem < 100) )
            this.preco = porcentagem;
        else throw new IllegalArgumentException("Forneça uma ocorrencia válido!\n");
    }

    // ================================= Outros Métodos
    public Boolean stringValida(String s) {
        return s != null && !s.trim().isEmpty();   // s.isEmpty() vem do java.lang.String
    }

    public void exibirTrecho(){
        System.out.println("\n> Informações do Trecho:");
        System.out.println("- ID do Trecho         : " + codigoIdentificador);
        System.out.println("- Local de partida     : " + localSaida);
        System.out.println("- Aeroporto de partida : " + nomeAeroportoSaida);
        System.out.println("- Local de chegada     : " + localChegada);
        System.out.println("- Aeroporto de chegada : " + nomeAeroportoChegada);
        System.out.println("- Preço                : " + preco);
        System.out.print("- Horario esperado da saida   : ");
        getHorarioSaida().exibeHorario();
        System.out.print("- Horario esperado de chegada : ");
        getHorarioChegada().exibeHorario();
    }
}