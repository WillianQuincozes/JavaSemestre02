package EXE12;

import java.util.Scanner;

public class TesteFilme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do filme: ");
        String nome = sc.nextLine();
        System.out.print("Digite o nome do diretor do filme: ");
        String diretor = sc.nextLine();
        System.out.print("Digite a duração do filme: ");
        Double duracao = sc.nextDouble();

        Filme f = new Filme(nome, diretor, duracao);

        f.iniciar();
        f.iniciar();
        f.parar();
        f.parar();

        sc.close();
    }
}
