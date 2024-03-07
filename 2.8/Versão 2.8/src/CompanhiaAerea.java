import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CompanhiaAerea extends Empresa{
    // ================================= Atributos
    private double porcentagemPorPassagem;
    private Data dataDeAdesaoAoUD;

    // ================================= Construtor
    public CompanhiaAerea(Empresa empresa, double porcentagemPorPassagem, Data dataDeAdesaoAoUD) {
        super(empresa.getCnpj(), empresa.getNomeOficial(), empresa.getNomeMarketing(), empresa.getDataCriacao(), empresa.getEndereco());
        this.porcentagemPorPassagem = porcentagemPorPassagem;
        this.dataDeAdesaoAoUD = dataDeAdesaoAoUD;
    }

    public CompanhiaAerea(double porcentagemPorPassagem, Data dataDeAdesaoAoUD) {
        super();
        this.porcentagemPorPassagem = porcentagemPorPassagem;
        this.dataDeAdesaoAoUD = dataDeAdesaoAoUD;
    }

    // ================================= Getters e Setters:
    public double getPorcentagemPorPassagem() { return porcentagemPorPassagem; }
    public void setPorcentagemPorPassagem(double porcentagemPorPassagem){
        if ((porcentagemPorPassagem <= 0 )|| (porcentagemPorPassagem>99))
            throw new IllegalArgumentException("Porcentagem invalida! Oferte uma porcentagem por passagem maior que 0 e menor que 100!");

        this.porcentagemPorPassagem = porcentagemPorPassagem;
    }

    public Data getDataDeAdesaoAoUD() {return dataDeAdesaoAoUD; }
    public void setDataDeAdesaoAoUD(Data dataDeAdesaoAoUD){
        dataDeAdesaoAoUD.validaData(dataDeAdesaoAoUD.getDia(),dataDeAdesaoAoUD.getMes(), dataDeAdesaoAoUD.getAno());

        // se não travar acima, tá liberado!
        this.dataDeAdesaoAoUD = dataDeAdesaoAoUD;
    }

    // ================================= Outros Métodos
    public void exibeCompanhia()
    {
        System.out.println("\n> Informações da Companhia Aérea:");
        System.out.println("Porcentagem Por Passagem: " + porcentagemPorPassagem);
        System.out.print("- Data criacao   : ");
        getDataDeAdesaoAoUD().exibeData();
    }
}