package EXE21;

import java.util.Scanner;

public class TesteCozinha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tipo da cozinha (ex: Industrial, Residencial): ");
        String tipo = sc.nextLine();
        System.out.print("Digite a quantidade de pessoas que a cozinha pode acomodar: ");
        int quantidadePessoas = sc.nextInt();
        sc.nextLine(); // Consumir a linha pendente
        System.out.print("Digite a cor da cozinha: ");
        String cor = sc.nextLine();

        Cozinha cozinha = new Cozinha(tipo, quantidadePessoas, cor);

        cozinha.cozinhar();
        cozinha.limpar();

        sc.close();
    }
}
