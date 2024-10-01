public class Main {
    public static void main(String[] args) {
        /*Crie uma classe Animal com os atributos nome e idade. Adicione um método emitirSom().
        Depois, crie duas subclasses: Cachorro e Gato,
        que sobrescrevem o método emitirSom para exibir sons específicos de cada animal.
        Instancie objetos de cada subclasse e invoque o método emitirSom.*/

        Cachorro cachorro = new Cachorro();
        cachorro.nome = "Zeus";
        cachorro.idade = 1;

        Gato gato = new Gato();
        gato.nome = "Frajola";
        gato.idade = 5;

        System.out.println("Nome: " + gato.nome);
        System.out.println("Idade: " + gato.idade);
        gato.emitirSom();

        System.out.println("Nome: " + cachorro.nome);
        System.out.println("Idade: " + cachorro.idade);
        cachorro.emitirSom();
    }
}