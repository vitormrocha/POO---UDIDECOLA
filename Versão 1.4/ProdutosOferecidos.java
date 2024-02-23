public class ProdutosOferecidos {
    private String nome_produto;
    private double preco;
    private int quant;
    private int val_comprado;

    public ProdutosOferecidos() {

    }
    
    public ProdutosOferecidos(String nome_produto, double preco, int quant) {
        setNome_produto(nome_produto);
        setPreco(preco);
        setQuant(quant);
        val_comprado = 0;
    }

    public int getVal_comprado() {
        return val_comprado;
    }

    public void setVal_comprado(int val_comprado) {
        this.val_comprado = val_comprado;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        if (nome_produto.isBlank() == false && nome_produto.isEmpty() == false)
            this.nome_produto = nome_produto;
        else 
            System.out.printf("\nNOME DE PRODUTO INVALIDO.\n");
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0)
            this.preco = preco;
        else 
            this.preco = 1.0;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        if (quant > 0)
            this.quant = quant;
        else 
            this.quant = 0;
    }

    public void teste_valcomprado() {
        System.out.printf("\nTESTE VAL COMPRADO:\t[%d]", val_comprado);
    }
    
    
}
