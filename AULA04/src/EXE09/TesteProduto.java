package EXE09;

import java.util.Scanner;

public class TesteProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nome = sc.nextLine();
        System.out.println("Digite a quantidade do produto: ");
        int estoque = sc.nextInt();
        System.out.println("Digite o valor do produto: ");
        double valor = sc.nextDouble();

        Produto produto = new Produto(nome, valor, estoque);
        produto.aumentar();
        produto.diminuir();

        sc.close();
    }
}
