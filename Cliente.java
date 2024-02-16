/*
    CLIENTE
    {
        - CPF
        - Nome
        - Endereço completo
        - Data de Nascimento
        - Data de cadastro
        - E-mail
        - Número de compras
        - Se é VIP
        - Valor do desconto por ser VIP (decidido por nós)
        - Data em que se tornou VIP


        OBS: É necessário registrar as pesquisas feitas pelo cliente
        Seja a origem, destino, data de início e data de fim
        Para fazer pesquisas de destinos e datas mais procurados
        Armazenar também a data e hora que a pesquisa foi realizada
        OBS2: talvez seja interessante NÃO armazenar dentro da classe CLIENTE
    }
*/


public class Cliente {
    private String nome; // ok

    private CPF cpf; // Falta a validação dos dados

    private Data dataNascimento; // ok

    private Data dataCadastro; // ok

    private Endereco endereco; // ok

    private String email; // ok

    private int numeroCompras; // ok

    private VIP vip; // falta cálculo desconto

    public Cliente(){

    }

    public Cliente(String nome, CPF cpf, Data dataNascimento, Data dataCadastro, Endereco endereco, String email, VIP vip){
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.dataCadastro = dataCadastro;
        this.endereco = endereco;
        this.email = email;
        this.numeroCompras = 0;
        this.vip = vip;
    }

    // USADO PARA TESTES (contem 'númeroCompras' para ser colocado, será utilizado para testes, mas quando cria-se o cliente esse valor é 0)
    public Cliente(String nome, CPF cpf, Data dataNascimento, Data dataCadastro, Endereco endereco, String email, int numeroCompras, VIP vip){
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.dataCadastro = dataCadastro;
        this.endereco = endereco;
        this.email = email;
        this.numeroCompras = numeroCompras;
        this.vip = vip;
    }


    // Pensar se teremos verificação de nome
    // Ou até colocar uma nova classe 'nome' e 'sobrenome'
    // Ambos verificados se existe caracter especial, por exemplo.
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }

    // Pensar se teremos verificação de e-mail ou não
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void exibeCliente()
    {
        System.out.println("Nome: " + nome);
        cpf.exibeCPF();
        dataNascimento.exibeData();
        dataCadastro.exibeData();
        endereco.exibeEndereco();
        System.out.println("Email: " + email);
        System.out.println("Numero de compras: " + numeroCompras);
        vip.exibeVIP();
    }
}
