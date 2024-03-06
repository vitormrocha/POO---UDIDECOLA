public class TrechosProcurados {
    private int num_pesquisa;
    private String nome_destino;
    private String destino;

    public TrechosProcurados(int num_pesquisa, String nome, String destino) {
        setNum_pesquisa(num_pesquisa);
        setNome_destino(nome);
        setDestino(destino);
    }
    
    public int getNum_pesquisa() {
        return num_pesquisa;
    }
    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        if (!destino.isBlank() || !destino.isEmpty())
            this.destino = destino;
    }

    public void setNum_pesquisa(int num_pesquisa) {
        if (num_pesquisa > 0)
            this.num_pesquisa = num_pesquisa;
        else 
            this.num_pesquisa = 0;
    }
    public String getNome_destino() {
        return nome_destino;
    }
    public void setNome_destino(String nome_destino) {
        if (!nome_destino.isBlank() || !nome_destino.isEmpty())
            this.nome_destino = nome_destino;
    }

    
}
