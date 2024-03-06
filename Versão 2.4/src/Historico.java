import java.util.ArrayList;

public class Historico {
    private ArrayList <DatasProcuradas> datas_procuradas;
    private ArrayList <TrechosProcurados> trechos_procurados;

    public Historico () {
        datas_procuradas = new ArrayList<>();
        trechos_procurados = new ArrayList<>();
    }
    public ArrayList<DatasProcuradas> getDatas_procuradas() {
        return datas_procuradas;
    }
    public void setDatas_procuradas(ArrayList<DatasProcuradas> datas_procuradas) {
        this.datas_procuradas = datas_procuradas;
    }
    public ArrayList<TrechosProcurados> getTrechos_procurados() {
        return trechos_procurados;
    }
    public void setTrechos_procurados(ArrayList<TrechosProcurados> trechos_procurados) {
        this.trechos_procurados = trechos_procurados;
    }

    public void AddDatas(DatasProcuradas date) {
        datas_procuradas.add(date);
    }
    public void AddTrecho(TrechosProcurados trecho) {
        trechos_procurados.add(trecho);
    }
    public void AddHistorico(DatasProcuradas date, TrechosProcurados trecho) {
        AddDatas(date);
        AddTrecho(trecho);
    }
    
}
