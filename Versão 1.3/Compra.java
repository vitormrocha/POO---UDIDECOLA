public class Compra {
    private Cliente cliente;
    private Hotel hotel;
    private Contabancaria conta;
    private boolean compra_sucesso;

    public boolean isCompra_sucesso() {
        return compra_sucesso;
    }
    public void setCompra_sucesso(boolean compra_sucesso) {
        this.compra_sucesso = compra_sucesso;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public Contabancaria getConta() {
        return conta;
    }
    public void setConta(Contabancaria conta) {
        this.conta = conta;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Hotel getHotel() {
        return hotel;
    }
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
    public Compra (Cliente cliente, Hotel hotel, Contabancaria conta) {
        this.cliente = cliente;
        this.hotel = hotel;
        this.conta = conta;
        compra_sucesso = false;
    }
    private boolean saldo_suficiente (double preco) {
        if (conta.getSaldo() < preco) 
            return false;
        else 
            return true;
    }
    public void comprar(int opcao, double preco) {

        if (saldo_suficiente(preco)) {
            conta.sacar(preco);
            int aux = hotel.getQuant_passagens() - 1;
            hotel.setQuant_passagens(aux);
            compra_sucesso = true;
            cliente.setCodigo_ultcompra(opcao);
            
        } else {
            compra_sucesso = false;
        }

       
    } 

    
    
}
