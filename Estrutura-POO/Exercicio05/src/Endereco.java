public class Endereco {
    //Crie uma classe Endereco com os atributos rua, cidade e estado.
    // Depois, crie uma classe Pessoa que possua um objeto do tipo Endereco como atributo.
    // Instancie um objeto Pessoa e associe um endereço a essa pessoa.

    String rua;
    String cidade;
    String estado;

    public void exibirEndereco() {
        System.out.println("Endereço: " + rua + "," + cidade + "," + estado);
    }
}