public class DatasProcuradas {
    private Data data;
    private boolean eh_inicio;
    private int num_pesquisa;
    
    public Data getData() {
        return data;
    }
    public boolean isEh_inicio() {
        return eh_inicio;
    }
    public void setEh_inicio(boolean eh_inicio) {
        this.eh_inicio = eh_inicio;
    }
    public void setData(Data data) {
        this.data = data;
    }
    public int getNum_pesquisa() {
        return num_pesquisa;
    }
    public void setNum_pesquisa(int num_pesquisa) { 
        if (num_pesquisa > 0)
            this.num_pesquisa = num_pesquisa;
        else this.num_pesquisa = 0;
    }

    public DatasProcuradas(Data data, int num_pesquisa, boolean eh_inicio) {
        setData(data);
        setNum_pesquisa(num_pesquisa);
        this.eh_inicio = eh_inicio;
    }
    
}
