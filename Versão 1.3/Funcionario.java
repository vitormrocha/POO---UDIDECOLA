/*
FUNCIONÁRIOS
{
    CLIENTE (Os funcionários também são clientes)

    - Número da carteira de trabalho
    - Quantos hotéis funcionário cadastrou
    - Tipo de funcionário (função que ele exerce)
    - Salário
    {
        Se ele for um funcionário que adiciona hotéis
            Salário = Salário fixo + porcentagem para novo hotel que ele adiciona
    }
}
*/

public class Funcionario{
    private int numeroCarteiraTrabalho;
    private int qnt_HoteisCadastrados;
    private String funcaoFuncionario;
    private boolean cadastraHotel; // Saber se ele faz a função de cadastrar hotéis
    private double salario;
    private static double porcentagemSalario; // Static pois assim todos os funcionários conseguem acessar a porcentagem

    public Funcionario() {

    }

    /* 
    public Funcionario(int numeroCarteiraTrabalho, int qnt_HoteisCadastrados, String funcaoFuncionario, double salario) {
        this.numeroCarteiraTrabalho = numeroCarteiraTrabalho;
        this.qnt_HoteisCadastrados = qnt_HoteisCadastrados;
        this.funcaoFuncionario = funcaoFuncionario;

        if (funcaoFuncionario.equals("Cadastra Hotel"))
            cadastraHotel = true;

        // Fazer o Cálculo do salário caso o funcionário cadastre hotéis
        if (cadastraHotel)
            this.salario = salario + (salario * porcentagemSalario);
        else
            this.salario = salario;
    }*/ 


    public int getNumeroCarteiraTrabalho() {
        return numeroCarteiraTrabalho;
    }

    public void setNumeroCarteiraTrabalho(int numeroCarteiraTrabalho) {
        if (numeroCarteiraTrabalho > 0)
            this.numeroCarteiraTrabalho = numeroCarteiraTrabalho;
        else 
            this.numeroCarteiraTrabalho = (numeroCarteiraTrabalho) * (-1);
    }

    public int getQnt_HoteisCadastrados() {
        return qnt_HoteisCadastrados;
    }

    public void setQnt_HoteisCadastrados(int qnt_HoteisCadastrados) {
        if (qnt_HoteisCadastrados > 0)
            this.qnt_HoteisCadastrados = qnt_HoteisCadastrados;
        else 
            this.qnt_HoteisCadastrados = 0;
    }

    public String getFuncaoFuncionario() {
        return funcaoFuncionario;
    }

    public void setFuncaoFuncionario(String funcaoFuncionario) {
        this.funcaoFuncionario = funcaoFuncionario;

        if (funcaoFuncionario.equals("Cadastra Hotel"))
            cadastraHotel = true;

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (cadastraHotel)
            this.salario = salario + (salario * porcentagemSalario);
        else
            this.salario = salario;
    }

    public static double getPorcentagemSalario() {
        return porcentagemSalario;
    }

    public static void setPorcentagemSalario(double porcentagemSalario) {
        Funcionario.porcentagemSalario = porcentagemSalario;
    }

    public boolean isCadastraHotel() {
        return cadastraHotel;
    }

    public void setCadastraHotel(boolean cadastraHotel) {
        this.cadastraHotel = cadastraHotel;
    }
    public Funcionario(int numeroCarteiraTrabalho, int qnt_HoteisCadastrados, String funcaoFuncionario, double salario) {
        setNumeroCarteiraTrabalho(numeroCarteiraTrabalho);
        setQnt_HoteisCadastrados(qnt_HoteisCadastrados);
        setFuncaoFuncionario(funcaoFuncionario);

        if (funcaoFuncionario.equals("Cadastra Hotel"))
            cadastraHotel = true;
    
        setSalario(salario);
    }
}
