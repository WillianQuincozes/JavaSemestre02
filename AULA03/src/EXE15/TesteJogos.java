package EXE15;

import java.util.Scanner;

public class TesteJogos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do jogo: ");
        String nome = sc.nextLine();
        System.out.print("Digite o genero do jogo: ");
        String genero = sc.nextLine();
        System.out.print("Digite o valor do jogo: ");
        double preco = sc.nextDouble();

        Jogos jogo = new Jogos(nome, genero, preco);

        jogo.iniciar();
        jogo.iniciar();
        jogo.parar();
        jogo.parar();

        sc.close();
    }
}
