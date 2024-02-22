import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CompanhiaAerea {

    private final Empresa empresaEmQuestao;
    private final double porcentagemPorPassagem;
    private final String dataDeAdesaoAoUD;

    // ================================= Forma de construir:
    public CompanhiaAerea(double porcentagemPorPassagem, String dataDeAdesaoAoUD, Empresa empresaEmQuestao) {
        this.porcentagemPorPassagem = porcentagemPorPassagem;
        this.empresaEmQuestao = empresaEmQuestao;

        LocalDate hoje = LocalDate.now();

        // Configura a data de adesão como a data de hoje
        this.dataDeAdesaoAoUD = hoje.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    
    // ================================= Getters e Setters:
    public Empresa getEmpresa() { return empresaEmQuestao; }
    public double getPorcentagemPorPassagem() { return porcentagemPorPassagem; }
    public String getDataDeAdesaoAoUD(){ return dataDeAdesaoAoUD; }
}
