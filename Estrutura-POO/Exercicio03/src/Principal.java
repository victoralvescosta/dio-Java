import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria banco = new ContaBancaria();

        banco.nome = "João Victor";
        banco.numero = "1234-5";
        banco.saldo = 900.00;

        banco.depositar(200);
        banco.sacar(1100);

        banco.exibirInformacoes();
    }
}
