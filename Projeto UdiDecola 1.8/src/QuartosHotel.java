/*
- Para cada data mostrar o número de quartos disponíveis
    {
        Para quartos standard:
        {
            Existem quartos:
            {
                * Single
                * Duplos
                * Triplos
            }


            - Valor da diária de cada quarto
            {
                * Sem desconto
                * Valor do desconto
                * Valor com desconto
            }
        }

        Para quartos de luxo:
        {
            - Valor da diária do quarto
            {
                * Sem desconto
                * Valor do desconto
                * Valor com desconto
            }
        }

    }
 */

import java.util.ArrayList;

public class QuartosHotel {
    // ================================= Atributos

    public enum TipoQuarto {
        SINGLE,
        DUPLO,
        TRIPLO,
        LUXO
    }
    private int qntQuartosSingle;
    private int qntQuartosDuplos;
    private int qntQuartosTriplos;
    private int qntQuartosLuxo;

    private double precoQuartoSingle;
    private double precoQuartoDuplo;
    private double precoQuartoTriplo;
    private double precoQuartoLuxo;

    private double desconto;

    private final ArrayList<Quarto> quartos = new ArrayList<>();

    private final ArrayList<Data> datasNaoCancela = new ArrayList<>(); // Lista de datas em que não se cancela a hospedagem

    // ================================= Construtores

    public QuartosHotel(){

    }

    public QuartosHotel(int qntQuartosSingle, int qntQuartosDuplos, int qntQuartosTriplos, int qntQuartosLuxo, double precoQuartoSingle, double precoQuartoDuplo, double precoQuartoTriplo, double precoQuartoLuxo, double desconto) {
        this.qntQuartosSingle = qntQuartosSingle;
        this.qntQuartosDuplos = qntQuartosDuplos;
        this.qntQuartosTriplos = qntQuartosTriplos;
        this.qntQuartosLuxo = qntQuartosLuxo;
        this.precoQuartoSingle = precoQuartoSingle;
        this.precoQuartoDuplo = precoQuartoDuplo;
        this.precoQuartoTriplo = precoQuartoTriplo;
        this.precoQuartoLuxo = precoQuartoLuxo;
        this.desconto = desconto;
    }


    // ================================= Getters e Setters

    public int getQntQuartosSingle() {
        return qntQuartosSingle;
    }

    public void setQntQuartosSingle(int qntQuartosSingle) {
        this.qntQuartosSingle = qntQuartosSingle;
    }

    public int getQntQuartosDuplos() {
        return qntQuartosDuplos;
    }

    public void setQntQuartosDuplos(int qntQuartosDuplos) {
        this.qntQuartosDuplos = qntQuartosDuplos;
    }

    public int getQntQuartosTriplos() {
        return qntQuartosTriplos;
    }

    public void setQntQuartosTriplos(int qntQuartosTriplos) {
        this.qntQuartosTriplos = qntQuartosTriplos;
    }

    public int getQntQuartosLuxo() {
        return qntQuartosLuxo;
    }

    public void setQntQuartosLuxo(int qntQuartosLuxo) {
        this.qntQuartosLuxo = qntQuartosLuxo;
    }

    public double getPrecoQuartoSingle() {
        return precoQuartoSingle;
    }

    public void setPrecoQuartoSingle(double precoQuartoSingle) {
        this.precoQuartoSingle = precoQuartoSingle;
    }

    public double getPrecoQuartoDuplo() {
        return precoQuartoDuplo;
    }

    public void setPrecoQuartoDuplo(double precoQuartoDuplo) {
        this.precoQuartoDuplo = precoQuartoDuplo;
    }

    public double getPrecoQuartoTriplo() {
        return precoQuartoTriplo;
    }

    public void setPrecoQuartoTriplo(double precoQuartoTriplo) {
        this.precoQuartoTriplo = precoQuartoTriplo;
    }

    public double getPrecoQuartoLuxo() {
        return precoQuartoLuxo;
    }

    public void setPrecoQuartoLuxo(double precoQuartoLuxo) {
        this.precoQuartoLuxo = precoQuartoLuxo;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public ArrayList<Quarto> getQuartos() {
        return quartos;
    }

// ================================= Outros Métodos

    public void adicionarQuarto(Quarto quarto) {

        switch (quarto.getTipoQuarto()) {
            case SINGLE:
                quartos.add(new QuartosSingle(quarto.getData(), quarto.getQntQuartosDisponiveis(), TipoQuarto.SINGLE));
                break;

            case DUPLO:
                quartos.add(new QuartosDuplos(quarto.getData(), quarto.getQntQuartosDisponiveis(), TipoQuarto.DUPLO));
                break;

            case TRIPLO:
                quartos.add(new QuartosTriplos(quarto.getData(), quarto.getQntQuartosDisponiveis(), TipoQuarto.TRIPLO));
                break;

            case LUXO:
                quartos.add(new QuartosLuxo(quarto.getData(), quarto.getQntQuartosDisponiveis(), TipoQuarto.LUXO));
                break;
        }
    }

    public void adicionarQuarto(Data data, int qntQuartosDisponiveis, TipoQuarto tipoQuarto) {

        switch (tipoQuarto) {
            case SINGLE:
                quartos.add(new QuartosSingle(data, qntQuartosDisponiveis, TipoQuarto.SINGLE));
                break;

            case DUPLO:
                quartos.add(new QuartosDuplos(data, qntQuartosDisponiveis, TipoQuarto.DUPLO));
                break;

            case TRIPLO:
                quartos.add(new QuartosTriplos(data, qntQuartosDisponiveis, TipoQuarto.TRIPLO));
                break;

            case LUXO:
                quartos.add(new QuartosLuxo(data, qntQuartosDisponiveis, TipoQuarto.LUXO));
                break;
        }
    }

    public void mostrarArrayQuartos() {

        int i = 0;
        for (Quarto quarto : quartos) {
            System.out.println("Tipo: " + quarto.getTipoQuarto() + "  Data: " + quarto.getData().getDia() + "/" + quarto.getData().getMes()+ "/" + quarto.getData().getAno() + "  QuartosDisponíveis: " + quarto.getQntQuartosDisponiveis());
        }
    }

    public void mostrarQuarto(int index) {
        System.out.println("Tipo: " + quartos.get(index).getTipoQuarto() + "  Data: " + quartos.get(index).getData().getDia() + "/" + quartos.get(index).getData().getMes()+ "/" + quartos.get(index).getData().getAno() + "  QuartosDisponíveis: " + quartos.get(index).getQntQuartosDisponiveis());
    }



    public boolean hospedarDia(Data data, int qntQuartos, QuartosHotel.TipoQuarto tipoQuarto) {
        // Se a data já existir
        // Vai pesquisar no vetor de quartos se a data e o tipo de quarto existe
        for (Quarto quarto : quartos) {
            if (quarto.getData().dataIgual(data) && quarto.getTipoQuarto() == tipoQuarto) {
                // Se existir e a quantidade de quartos disponíveis puder ser hospedada
                if (qntQuartos <= quarto.getQntQuartosDisponiveis()) {
                    // Hospeda a quantidade de quartos
                    quarto.ocupandoQuartos(qntQuartos);
                    return true;
                } else {
                    // Se a quantidade requerida for maior, então retorna falso
                    return false;
                }
            }
        }

        // Recebe a quantidade de quartos totais para alocar um novo dia e precisa da quantidade de quartos totais que cada tipo possui
        int qntDisponivel = switch (tipoQuarto) {
            case SINGLE -> qntQuartosSingle;
            case DUPLO -> qntQuartosDuplos;
            case TRIPLO -> qntQuartosTriplos;
            case LUXO -> qntQuartosLuxo;
            default -> 0;
        };

        // Recebe em aux um novo objeto de um tipo específico de quarto
        Quarto aux = switch (tipoQuarto) {
            case SINGLE -> new QuartosSingle(data, qntDisponivel, tipoQuarto);
            case DUPLO -> new QuartosDuplos(data, qntDisponivel, tipoQuarto);
            case TRIPLO -> new QuartosTriplos(data, qntDisponivel, tipoQuarto);
            case LUXO -> new QuartosLuxo(data, qntDisponivel, tipoQuarto);
            default -> null;
        };

        // Adiciona aux (a data e quantidade de quartos) no banco de dados
        adicionarQuarto(aux);

        // Tenta hospedar novamente agora que possui um lugar para aquele dia e tipo no ArrayList
        hospedarDia(data, qntQuartos, tipoQuarto);
        return true;
    }

    // Função para chamar 'hospedarDia' de check_in até check_out
    public boolean hospedar(Data check_in, Data check_out, int qntQuartos, QuartosHotel.TipoQuarto tipoQuarto) {
        check_out.somaUmDia();  // Incluindo o último dia para iteração correta

        // Enquanto check_in não é igual a check_out
        while (!check_in.dataIgual(check_out)) {
            // Tenta hospedar e verifica se dataValida == true ou false
            boolean dataValida = hospedarDia(check_in, qntQuartos, tipoQuarto);

            if (!dataValida) {
                return false;
            }

            // move um dia em Check_in para poder hospedar o cliente no dia seguinte
            // Mova a adição de um dia para o final do loop
            check_in.somaUmDia();
        }
        return true;
    }
}


