package EXE11;

import java.util.Scanner;

public class TesteCidade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do cidade: ");
        String nome = sc.nextLine();
        System.out.println("Digite o estado: ");
        String estado = sc.nextLine();
        System.out.println("Digite o numero de população: ");
        int populacao = sc.nextInt();

        Cidade cidade = new Cidade(nome, estado, populacao);

        cidade.aumentarPupulacao();
        cidade.diminuirPupulacao();
        cidade.aumentarPupulacao();
    }
}
