public class ContaBancaria {
        /*Crie uma classe ContaBancaria com os atributos numero, saldo e titular.
        Implemente os métodos depositar e sacar,
        que alteram o saldo da conta bancária de acordo com os valores recebidos.
        Crie uma conta bancária e realize operações de depósito e saque.*/

    String numero;
    double saldo;
    String nome;

    public void depositar (int valor) {
        saldo += valor;

        System.out.println("O valor de R$ " + valor + " foi depositado com sucesso");
    }

    public void sacar (int valor) {
        if (valor <= saldo) {
            saldo -= valor;

            System.out.println("O saque de R$ " + valor + "foi realizado com sucesso");
        } else {
            System.out.println("O valor para o saque é insuficiente");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Número da conta: " + numero);
        System.out.println("Saldo da conta: " + saldo);
        System.out.println("Nome do titular: " + nome);
    }
}