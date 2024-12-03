package EXE05;

import java.util.Scanner;

public class TesteCachorro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do cachorro: ");
        String nome = sc.nextLine();
        System.out.println("Digite a raça do cachorro: ");
        String raca = sc.nextLine();
        System.out.println("Digite a idade do cachorro: ");
        int idade = sc.nextInt();

        Cachorro c = new Cachorro(nome, raca, idade);

        c.correr();
        c.latir();

        sc.close();
    }
}
