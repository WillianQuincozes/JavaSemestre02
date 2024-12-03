package EXE07;

import java.util.Scanner;

public class Aluno {
    private String nome;
    private int matricula;
    private String curso;

    public Aluno(String nome, int matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void media() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o número de notas: ");
        int n = sc.nextInt();
        double[] notas = new double[n];
        double soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Informe a " + (i + 1) + "ª nota do aluno: ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }
        double media = soma / n;

        System.out.println("A média das notas foi: " + media);
        System.out.println("Aluno: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("Matrícula: " + matricula);
    }
}
