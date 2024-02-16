/*

PRECISA FAZER A VERIFICAÇÃO DE CPF

 */

public class CPF
{
    private int cpf;

    public CPF(int cpf)
    {
        this.cpf = cpf;
    }

    public void setCpf(int cpf)
    {
        this.cpf = cpf;
    }

    public int getCpf()
    {
        return cpf;
    }

    public void exibeCPF()
    {
        System.out.println("CPF: " + cpf);
    }
}
