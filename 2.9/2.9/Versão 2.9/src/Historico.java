import java.util.ArrayList;

public class Historico {
    private Hotel hotel; 
    private PassagemAerea passagem;
    private double preco_quarto;
    private double preco_passagem;
    private String metodo_pagamento;
    private int quantcomprada_quarto;
    private int quantcomprada_passagem;
    private double preco_total;

    public double getPreco_total() {
        return preco_total;
    }
    public void setPreco_total(double preco_total) {
        this.preco_total = preco_total;
    }
    public Historico (int quantcomprada_passagem, PassagemAerea passagem, String metodo_pagamento) {
        setQuantcomprada_passagem(quantcomprada_passagem);
        setPassagem(passagem);
        setMetodo_pagamento(metodo_pagamento);
    }

    public double getPreco_quarto() {
        return preco_quarto;
    }
    public void setPreco_quarto(double preco_quarto) {
        if (preco_quarto > 0)
        this.preco_quarto = preco_quarto;
    }
    public int getQuantcomprada_quarto() {
        return quantcomprada_quarto;
    }
    public void setQuantcomprada_quarto(int quantcomprada_quarto) {
        if (quantcomprada_quarto > 0)
        this.quantcomprada_quarto = quantcomprada_quarto;
        else this.quantcomprada_quarto = 0;
    }
    public int getQuantcomprada_passagem() {
        return quantcomprada_passagem;
    }
    public void setQuantcomprada_passagem(int quantcomprada_passagem) {
        if (quantcomprada_passagem > 0)
        this.quantcomprada_passagem = quantcomprada_passagem;
        else 
        this.quantcomprada_passagem = 0;
    }
    public double getpreco_quarto() {
        return preco_quarto;
    }
    public void setpreco_quarto(double preco_quarto) {
        this.preco_quarto = preco_quarto;
    }
    public double getPreco_passagem() {
        return preco_passagem;
    }
    public void setPreco_passagem(double preco_passagem) {
        if (preco_passagem > 0)
        this.preco_passagem = preco_passagem;
        else 
        this.preco_passagem = 0; 
    }
    public Hotel getHotel() {
        return hotel;
    }
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
    public PassagemAerea getPassagem() {
        return passagem;
    }
    public void setPassagem(PassagemAerea passagem) {
        this.passagem = passagem;
    }
    public Historico (Hotel hotel, PassagemAerea passagem, double preco_passagem, double preco_quarto, String metodo_pagamento, int quantcomprada_passagem, int quantcomprada_quarto) {
        setHotel(hotel);
        setPassagem(passagem);
        setpreco_quarto(preco_quarto);
        setMetodo_pagamento(metodo_pagamento); 
        setQuantcomprada_passagem(quantcomprada_passagem);
        setQuantcomprada_quarto(quantcomprada_quarto);
    }


    public String getMetodo_pagamento() {
        return metodo_pagamento;
    }
    public void setMetodo_pagamento(String metodo_pagamento) {
        if (!metodo_pagamento.isBlank() || !metodo_pagamento.isEmpty())
            this.metodo_pagamento = metodo_pagamento;
    }

}