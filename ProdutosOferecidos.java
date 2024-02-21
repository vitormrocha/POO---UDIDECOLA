public class ProdutosOferecidos {
    private String nome_produto;
    private double preco;
    private int quant;

    public ProdutosOferecidos() {

    }
    
    public ProdutosOferecidos(String nome_produto, double preco, int quant) {
        this.nome_produto = nome_produto;
        this.preco = preco;  
        this.quant = quant;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }
    
    
}
