/*Implemente uma classe Aluno com atributos nome, matricula, e curso.
Adicione um métodos para calcular a média de notas.*/

package EXE07;

import java.util.Scanner;

public class Aluno {
    public String nome;
    public int matricula;
    public String curso;

    public Aluno(String nome, int matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public void media(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o numero de notas: ");
        int n = sc.nextInt();
        double[] notas = new double[n];
        double soma = 0;

        for(int i = 0; i < n; i++){
            System.out.println("Informe a "+ (i+1)+ " nota do aluno: ");
            notas[i] = sc.nextDouble();
            soma = soma + notas[i];
        }
        double media = soma / n;

        System.out.println("A media das notas foi: "+media);
        System.out.println("Aluno: "+nome);
        System.out.println("Curso: "+curso);
        System.out.println("Matricula: "+matricula);
    }
}
