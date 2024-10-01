public class Pessoa {

    String nome;
    Endereco endereco;

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        endereco.exibirEndereco();
    }

}
