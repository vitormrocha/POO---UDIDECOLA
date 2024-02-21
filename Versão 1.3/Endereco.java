public class Endereco {
    private String rua; // verificado
    private int numero; //verificado
    private String complemento; //verificado
    private String cidade; //verificado
    private String estado; //verificado
 

    /* public Endereco(String rua, int numero, String complemento, String cidade, String estado)
    {
        this.rua = rua;
        if (numero > 0)
            this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
    } */ 

    private boolean verificarRua(String rua) {
        if (rua.length() == 0 && rua == " ") 
            return false;
        else
            return true;
    }

    public void setRua(String rua) {
        if (verificarRua(rua) == true)
            this.rua = rua;
        else 
            System.out.printf("\nERRO! RUA INVALIDA.\n");
    }

    public String getRua() {
        return rua;
    }

    public void setNumero(int numero) {

        // Não existe casa com número 0 ou negativo
        if (numero > 0)
            this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    private boolean verificarComplemento(String complemento) {
        if (complemento.length() == 0 || complemento == " ") 
            return false;
        else 
            return true;
    }
    public void setComplemento(String complemento) {
        if (verificarComplemento(complemento) == true)
            this.complemento = complemento;
        else 
            System.out.printf("\nERRO. COMPLEMENTO INVALIDO");
    }

    public String getComplemento() {
        return complemento;
    }

    private boolean verificarCidade (String cidade) {
        if (cidade.length() <= 0 || cidade == " " ) 
            return false;
        else 
            return true;
    }

    public void setCidade(String cidade) {
        if (verificarCidade(cidade) == true)
            this.cidade = cidade;
        else 
            System.out.printf("\nERRO. CIDADE INVALIDA.\n");
    }

    public String getCidade() {
        return cidade;
    }

    private boolean verificarEstado (String estado) {
        if (estado.length() <= 0 || estado == " ") 
            return false;
        else return true;
    }

    public void setEstado(String estado) {
        if (verificarEstado(estado) == true)
            this.estado = estado;
        else 
            System.out.printf("\nERRO.ESTADO INVALIDO!\n");
    }

    public String getEstado() {
        return estado;
    }

    public Endereco (String rua, int numero, String complemento, String cidade, String estado) {
        setRua(rua);
        setNumero(numero);
        setComplemento(complemento);
        setCidade(cidade);
        setEstado(estado);

    }

    public void exibeEndereco()
    {
        System.out.println("Rua: " + rua);
        System.out.println("Numero: " + numero);
        System.out.println("Complemento: " + complemento);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
    }

}
