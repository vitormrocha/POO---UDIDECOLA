import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CompanhiaAerea extends Empresa{
    // ================================= Atributos
    private final double porcentagemPorPassagem;
    private final String dataDeAdesaoAoUD;

    // ================================= Construtor
    public CompanhiaAerea(Empresa empresa, double porcentagemPorPassagem, String dataDeAdesaoAoUD) {
        super(empresa.getCnpj(), empresa.getNomeOficial(), empresa.getNomeMarketing(), empresa.getDataCriacao(), empresa.getEndereco());

        this.porcentagemPorPassagem = porcentagemPorPassagem;
        this.dataDeAdesaoAoUD = dataDeAdesaoAoUD;
    }

    public CompanhiaAerea(String cnpj,  String nomeOficial, String nomeMarketing, Data dataCriacao, Endereco endereco ,double porcentagemPorPassagem, String dataDeAdesaoAoUD) {
        super(cnpj, nomeOficial, nomeMarketing, dataCriacao, endereco);
        this.porcentagemPorPassagem = porcentagemPorPassagem;

        LocalDate hoje = LocalDate.now();

        // Configura a data de adesão como a data de hoje
        this.dataDeAdesaoAoUD = hoje.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    
    // ================================= Getters e Setters:
    public double getPorcentagemPorPassagem() {
        return porcentagemPorPassagem;
    }

    public String getDataDeAdesaoAoUD() {
        return dataDeAdesaoAoUD;
    }
}