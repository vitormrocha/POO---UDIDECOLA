public class Contabancaria  {
    private String nome;
    private double saldo;
    private CPF cpf;
    private String email;
    private Cliente cliente;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public CPF getCpf() {
        return cpf;
    }
    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Contabancaria(Cliente cliente, double saldo) {
        setCliente(cliente);
        this.cpf = cliente.getCpf();
        this.email = cliente.getEmail();
        this.nome = cliente.getNome();
        this.saldo = saldo;
        this.email = cliente.getEmail();
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

    
}
