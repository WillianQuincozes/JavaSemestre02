/*Defina uma classe Produto com atributos como nome, preco, e quantidadeEstoque. Adicione métodos para aumentar e diminuir o estoque.*/

package EXE09;

import java.util.Scanner;

public class Produto {
    public String nome;
    public double preco;
    public int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void aumentar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade que deseja AUMENTAR no estoque do produto "+ nome+ ": ");
        int quantidade = sc.nextInt();
        this.estoque += quantidade;
        System.out.println("Estoque atualizado com sucesso!");
        System.out.println("Quantidade atual: " + estoque);
    }

    public void diminuir(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade que deseja DIMINUIR no estoque do produto "+ nome+ ": ");
        int quantidade = sc.nextInt();
        this.estoque -= quantidade;
        System.out.println("Estoque atualizado com sucesso!");
        System.out.println("Quantidade atual: " + estoque);
    }

}
