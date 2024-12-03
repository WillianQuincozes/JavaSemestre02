package EXE07;

import java.util.Scanner;

public class TesteAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.println("Informe o curso do aluno: ");
        String curso = sc.nextLine();
        System.out.println("Informe o numero da matricula do aluno: ");
        int matricula = sc.nextInt();


        Aluno aluno = new Aluno(nome, matricula, curso);

        aluno.media();

        sc.close();
    }
}
