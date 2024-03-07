import java.util.ArrayList;

public class HistoricoPesquisa {
     private ArrayList <DatasProcuradas> datas_procuradas;
    private ArrayList <TrechosProcurados> trechos_procurados;
    private Data inicio_pesquisa;
    private Data fim_pesquisa;
    private 

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
    
    public boolean ExisteDatas(Data data) {
        for (DatasProcuradas aux : datas_procuradas) {
            if (aux.getData().equals(data))
                return true;

        }
        return false;
    }

    public boolean ExisteTrecho(Trecho trecho) {
        for (TrechosProcurados aux : trechos_procurados) {
            if (aux.getNome_destino().equals(trecho.getLocalSaida()))
                return true;
        }
        return false;
    }
    public HistoricoPesquisa () {
        datas_procuradas = new ArrayList<>();
        trechos_procurados = new ArrayList<>();
    }

    public HistoricoPesquisa
}
