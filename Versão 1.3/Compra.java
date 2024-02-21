public class Compra {
    private Cliente cliente;
    private Hotel hotel;
    private Contabancaria conta;
    private boolean compra_sucesso;
    private Data data;
    private Horario horario;

    public Data getData() {
        return data;
    }
    public void setData(Data data) {
        this.data = data;
    }
    public Horario getHorario() {
        return horario;
    }
    public void setHorario(Horario horario) {
        this.horario = horario;
    }
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
    public Compra (Cliente cliente, Hotel hotel, Contabancaria conta, Data data, Horario horario) {
        this.cliente = cliente;
        this.hotel = hotel;
        this.conta = conta;
        compra_sucesso = false;
        this.data = data; 
        this.horario = horario;

    }
    private boolean saldo_suficiente (double preco) {
        if (conta.getSaldo() < preco) 
            return false;
        else 
            return true;
    }
    public void comprar(ProdutosOferecidos produto) {

        if (saldo_suficiente(produto.getPreco())) {
            conta.sacar(produto.getPreco());
            int aux = hotel.getQuant_passagens() - 1;
            hotel.setQuant_passagens(aux);
            compra_sucesso = true;
            HistoricoPesquisa hist = new HistoricoPesquisa(this.hotel, produto, this.cliente, this.data, produto.getQuant(), this.horario);
            cliente.setHistorico(hist);
            
            
        } else {
            compra_sucesso = false;
        }

        

       
    } 

    
    
}
