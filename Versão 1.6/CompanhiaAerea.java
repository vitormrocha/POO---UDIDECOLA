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

        LocalDate hoje = LocalDate.now(); // Configura a data de adesão como a data de hoje
        this.dataDeAdesaoAoUD = hoje.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    
    // ================================= Getters e Setters:
    public double getPorcentagemPorPassagem() {
        return porcentagemPorPassagem;
    }

    public String getDataDeAdesaoAoUD() {
        return dataDeAdesaoAoUD;
    }

    // ================================= Outros Métodos

    public void exibeCompanhia()
    {
        System.out.println("\n> Informações da Companhia Aérea:");
        System.out.println("Porcentagem Por Passagem: " + porcentagemPorPassagem);
        System.out.println("Data de Adesão ao UD: " + dataDeAdesaoAoUD);
        exibirEmpresa();
    }
}