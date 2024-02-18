public class VIP {
    private boolean eh_VIP;
    private int desconto; // Repensar se o cálculo será feito por valores ou porcentagem
    private Data dataVIP;

    public VIP()
    {
        eh_VIP = false;
        desconto = 0;
        dataVIP = null;
    }

    public VIP(boolean eh_VIP, int desconto, Data dataVIP)
    {
        this.eh_VIP = eh_VIP;
        this.desconto = desconto;
        this.dataVIP = dataVIP;
    }
    public void setEh_VIP(boolean eh_VIP) {
        this.eh_VIP = eh_VIP;
    }

    public boolean getEh_VIP() {
        return eh_VIP;
    }
    /*
    Repensar a forma que será usada e modificar essa função posteriormente
    Formas:
        Valor fixo de desconto Ex: 100 reais de desconto
        Porcentagem Ex: 10% de desconto

        (talvez porcentagem seja mais fácil e interessante de trabalhar
     */

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDataVIP(Data dataVIP) {
        this.dataVIP = dataVIP;
    }

    public Data getDataVIP() {
        return dataVIP;
    }


    public void exibeVIP()
    {
        System.out.println("Eh VIP: " + eh_VIP + "\nDesconto: " + desconto);
        System.out.println("Data VIP: " + dataVIP.getDia() + "/" + dataVIP.getMes() + "/" + dataVIP.getAno());
    }
}
