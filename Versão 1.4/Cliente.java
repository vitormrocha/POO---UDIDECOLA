/*
    CLIENTE
    {
        - CPF
        - Nome : Verificação feita
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

    private Endereco endereco; // verificação feita. Necessita de codigo de erro mais expecifico

    private String email; // verificação feita. Necessita de codigo de erro mais expecifico

    private int numeroCompras; // ok. verificação feita.

    private VIP vip; // falta cálculo desconto

    private int codigo_ultcompra;

    public Contabancaria getContabancaria() {
        return contabancaria;
    }



    public void setContabancaria(Contabancaria contabancaria) {
        this.contabancaria = contabancaria;
    }

    private HistoricoPesquisa historico; 

    private Contabancaria contabancaria;

    public Cliente(){

    }

    

    // Pensar se teremos verificação de nome
    // Ou até colocar uma nova classe 'nome' e 'sobrenome'
    // Ambos verificados se existe caracter especial, por exemplo.

    
    private boolean verificarNome(String nome) {
        if (nome.length() == 0 || nome == " ") 
            return false;
        
        else {
            this.nome = nome;
            return true;
        }
    }
    public int getNumeroCompras() {
        return numeroCompras;
    }




    public void setNumeroCompras(int numeroCompras) {
        if (numeroCompras > 0)
            this.numeroCompras = numeroCompras;
        else 
            this.numeroCompras = 0;
    }
    


    public Endereco getEndereco() {
        return endereco;
    }



    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }



    public void setNome(String nome) {
        if (verificarNome(nome) == true)
            this.nome = nome;
        else 
            System.out.printf("\nERRO. NOME INVALIDO.\n"); 
    }

    public String getNome(){
        return nome;
    }

    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }

    private boolean verificarEmail(String email) {
        if (email.length() == 0 || email.contains("@") == false) 
            return false;
        else {
            this.email = email; 
            return true;
        }
    }
    

    public CPF getCpf() {
        return cpf;
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }



    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }



    public Data getDataCadastro() {
        return dataCadastro;
    }



    public void setDataCadastro(Data dataCadastro) {
        this.dataCadastro = dataCadastro;
    }



    public VIP getVip() {
        return vip;
    }



    public void setVip(VIP vip) {
        this.vip = vip;
    }



    // Pensar se teremos verificação de e-mail ou não
    public void setEmail(String email) {
        if (verificarEmail(email) == true)
            this.email = email;
        else 
            System.out.printf("\nERRO. EMAIL INVALIDO.\n");
    }

    public String getEmail() {
        return email;
    }

    public Cliente(String nom, CPF cpf1, Data nasci, Data datacadastro, Endereco endereco, String email, int num, VIP vip, Contabancaria contabancaria) {
        setCpf(cpf1);
        setEmail(email);
        setNome(nom);
        setNumeroCompras(num);
        setEndereco(endereco);
        setDataNascimento(nasci);
        setDataCadastro(datacadastro);
        setVip(vip);    
        codigo_ultcompra = -1;    
        this.contabancaria = contabancaria;
        this.historico = new HistoricoPesquisa();
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
        contabancaria.exibeSaldo();
    }



    public int getCodigo_ultcompra() {
        return codigo_ultcompra;
    }



    public void setCodigo_ultcompra(int codigo_ultcompra) {
        this.codigo_ultcompra = codigo_ultcompra;
    }



    public HistoricoPesquisa getHistorico() {
        return historico;
    }



    public void setHistorico(HistoricoPesquisa historico) {
        this.historico = historico;
    }

    public void ExibirHistoricoPesquisa() {
        historico.ExibirHistorico();
    }  

}
