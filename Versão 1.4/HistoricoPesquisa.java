public class HistoricoPesquisa {
    private Hotel hotel; //Info hotel
    private Cliente cliente; //Info cliente
    private Data data; //Sera usado para armazenar data da pesquisa
    private Horario horario; //Sera usado para armazenar horario da pesquisa
    private String nome_produto; //
    private double preco_produto; //
    private int quant_comprada; //

    public int getQuant_comprada() {
        return quant_comprada;
    }

    public void setQuant_comprada(int quant_comprada) {
        this.quant_comprada = quant_comprada;
    }

    public HistoricoPesquisa() {
        Data datefirst = new Data (1,1,2000);
        Horario hourfirst = new Horario(1,1);
        Endereco endfirst = new Endereco("Nada", 0, "nenhum", "nenhum", "mg");
        Hotel hot = new Hotel("nenhum","nenhum","nenhum",datefirst,endfirst,1,false,1,hourfirst,hourfirst,"nenhum","nenhum",1,1,1.0f,1.0f);
        hotel = hot;
        data = datefirst;
        nome_produto = "nenhum";
        preco_produto = 0;
        quant_comprada = 0;
        this.cliente = new Cliente();
        

    }

    public HistoricoPesquisa(Hotel hotel,ProdutosOferecidos produto, Cliente cliente, Data data, int quantcomprada, Horario horario) {
        this.hotel = hotel;
        nome_produto = produto.getNome_produto();
        preco_produto = produto.getPreco();
        this.horario = horario;
        this.cliente = cliente;
        this.quant_comprada = quantcomprada;

    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

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

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public double getPreco_produto() {
        return preco_produto;
    }

    public void setPreco_produto(double preco_produto) {
        this.preco_produto = preco_produto;
    }

    public void AddHistorico(String nome_produto, double preco, int quantidade_comparada) {
        this.nome_produto = nome_produto;
        preco_produto = preco;
        quant_comprada= quantidade_comparada; 
    }

    public void ExibirHistorico() {
        if (cliente.getNumeroCompras() > 0 )
            System.out.printf("\nHISTORICO DE PESQUISA: \nNOME PRODUTO: \t[%s]\nPRECO: \t[%2f]\nQUANTIDADE COMPRADA: \t[%d]\n", nome_produto, preco_produto, quant_comprada);
        else 
            System.out.printf("\nNAO EXISTE HISTORICO AINDA.");
    }

    

}
