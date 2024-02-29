
public class Data {

    // ================================= Atributos
    private int dia;
    private int mes;
    private int ano;

    // ================================= Construtores
    public Data(int dia, int mes, int ano) {
        validaData(dia, mes, ano);
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // ================================= Getters e Setters
    public void setDia(int dia) {
        validaData(dia, this.mes, this.ano);
        this.dia = dia;
    }

    public int getDia() {
        return dia;
    }

    public void setMes(int mes) {
        validaData(this.dia, mes, this.ano);
        this.mes = mes;
    }

    public int getMes() {
        return mes;
    }

    public void setAno(int ano) {
        validaData(this.dia, this.mes, ano);
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    // ================================= Outros Métodos
    public void validaData(int dia, int mes, int ano) {
        // Verificação se o ano é válido
        if (ano < 1900 || ano > 2024)
            throw new IllegalArgumentException("Ano inválido! Esteja entre 1900 e 2024\n");

        // Verificação se o mês é válido
        else if (mes < 1 || mes > 12)
            throw new IllegalArgumentException("Mês inválido! Esteja entre 1 e 12\n");

        // Verificação se o dia é válido (vista grossa para evitar verificar valores absurdos)
        else if (dia < 1 || dia > 31)
            throw new IllegalArgumentException("Dia inválido! Esteja entre 1 e 31");


        // Verificar a data pelo mês (verificação mais minuciosa)
        // Verifica os meses abril, junho, setembro e novembro (contêm 30 dias)
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            // Se a data dada com esses meses for 31 então há um erro;
            if (dia == 31)
                throw new IllegalArgumentException("Dia inválido! Esteja entre 1 e 30");
        }
        // Só vai verificar fevereiro se a data for maior que 28 (29, 30, 31 são datas problemáticas)
        else if (mes == 2 && dia > 28) {
            // Fevereiro não tem dia 30 / 31 então se forem eles, já pode descartar
            if (dia > 29)
                throw new IllegalArgumentException("Dia inválido! Esteja entre 1 e 29");

            // Calculando se é ano bissexto (se os 2 últimos dígitos são multiplos de 4)
            int ultimosDigitos = ano % 100;
            int resto = ultimosDigitos % 4;

            // Se não for bissexto e o dia for 29, então ele descarta;
            if (resto != 0)
                throw new IllegalArgumentException("Dia inválido! Este ano não é bissexto");
        }

        // Se chegar até aqui sem parar em nenhuma verificação, então o número é válido
    }

    public static int diaDaSemana(int ano, int mes, int dia) {
        if (mes < 3) {
            mes += 12;
            ano -= 1;
        }
        int K = dia;
        int M = mes;
        int C = ano / 100;
        int anoDoSeculo = ano % 100;
        int dia_semana = (K + (2 * M) + ((3 * (M + 1)) / 5) + anoDoSeculo + (anoDoSeculo / 4) + (C / 4) - (2 * C)) % 7;

        return dia_semana;
    }

    public int quantidadeDiasNoMes(int mes, int ano) {
        // Verifica se é fevereiro (mês 2) para tratar o ano bissexto
        if (mes == 2) {
            if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) {
                return 29; // Fevereiro tem 29 dias em anos bissextos
            } else {
                return 28; // Fevereiro tem 28 dias em anos não bissextos
            }
        }
        // Verifica se o mês tem 30 dias
        else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return 30;
        }
        // Se não é fevereiro, nem um dos meses com 30 dias, então é um dos meses com 31 dias
        else {
            return 31;
        }
    }

    public void exibeData() {
        System.out.println("Data: " + dia + "/" + mes + "/" + ano);
    }


}
