package EXE11;

import java.util.Scanner;

public class TesteCidade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome da cidade: ");
        String nome = sc.nextLine();
        System.out.println("Digite o estado da cidade: ");
        String estado = sc.nextLine();
        System.out.println("Digite a população da cidade: ");
        int populacao = sc.nextInt();

        Cidade cidade = new Cidade(nome, estado, populacao);
        cidade.aumentarPopulacao();
        cidade.diminuirPopulacao();

        sc.close();
    }
}
