public class Endereco {
    private String rua;
    private int numero;
    private String complemento;
    private String cidade;
    private String estado;


    public Endereco(String rua, int numero, String complemento, String cidade, String estado)
    {
        this.rua = rua;
        if (numero > 0)
            this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
    }

    public void setRua(String rua) {
        this.rua = rua;
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

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
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
