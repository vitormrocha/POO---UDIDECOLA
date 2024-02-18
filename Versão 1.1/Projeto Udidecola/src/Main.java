import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Data nascimento = new Data(19, 12, 2003);
        Data cadastro = new Data(10, 2, 2024);
        Endereco endereco = new Endereco("Juvenilia", 1395, "apto 302", "Udia", "MG");
        VIP vip = new VIP(true, 100, cadastro);
        CPF cpf = new CPF(38980558848L);


        Cliente cliente = new Cliente("Victor", cpf, nascimento, cadastro, endereco, "victor.bertolini@gmail.com", 10, vip);

        cliente.exibeCliente();
    }
}