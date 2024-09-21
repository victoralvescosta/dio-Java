public class Principal {
    public static void main(String[] args) {
        //Crie uma classe chamada Aluno com os atributos: nome, matricula e curso.
        // Em seguida, crie um objeto dessa classe,
        // inicialize os atributos e exiba as informações do aluno.

        Aluno aluno = new Aluno();

        aluno.nome = "João";
        aluno.curso = "Análise e desenvolvimento de sistema";
        aluno.matricula = 1236445;

        System.out.println("Nome do aluno: " + aluno.nome);
        System.out.println("Curso: " + aluno.curso);
        System.out.println("Matricula: " + aluno.matricula);

        Aluno alunoDois = new Aluno();

        alunoDois.nome = "Lidia";
        alunoDois.curso = "Engenharia Ambiental";
        alunoDois.matricula = 15668796;

        System.out.println("Nome do aluno: " + alunoDois.nome);
        System.out.println("Curso: " + alunoDois.curso);
        System.out.println("Matricula: " + alunoDois.matricula);

    }
}
