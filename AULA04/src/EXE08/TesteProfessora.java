package EXE08;

import java.util.Scanner;

public class TesteProfessora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do(a) professor(a): ");
        String nome = sc.nextLine();
        System.out.println("Digite a disciplina do(a) professor(a): ");
        String disciplina = sc.nextLine();
        System.out.println("Digite o salário do(a) professor(a): ");
        double salario = sc.nextDouble();

        Professora professora = new Professora(nome, disciplina, salario);
        professora.aula();
        professora.prova();

        sc.close();
    }
}
