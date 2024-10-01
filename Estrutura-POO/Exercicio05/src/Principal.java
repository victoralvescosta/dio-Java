public class Principal {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();

        endereco.rua = "Rua Roma";
        endereco.cidade = "Fortaleza";
        endereco.estado = "Ceará";

        Pessoa pessoa = new Pessoa();

        pessoa.nome = "João";
        pessoa.endereco = endereco;


        pessoa.exibirInfo();
    }
}
