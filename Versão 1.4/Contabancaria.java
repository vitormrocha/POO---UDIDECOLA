public class Contabancaria  {
    private double saldo;
    
    

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        if (saldo > 0)
            this.saldo = saldo;
        else 
            this.saldo = 0;
    }
    public Contabancaria(double saldo) {
        setSaldo(saldo);
    }

    public void depositar (double valor) {
        saldo += valor;
    }
    
    public void sacar (double valor) {
        if (valor >= saldo)  {
            System.out.printf("\nSALDO INSUFICIENTE.\n");   
        }
            
        else {
            saldo -= valor;
        }
    }

    public void exibeSaldo() {
        System.out.printf("\nSALDO:\t%2f", saldo);
    }


    
}
