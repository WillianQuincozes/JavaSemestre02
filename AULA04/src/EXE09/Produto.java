package EXE09;

import java.util.Scanner;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void aumentar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade que deseja AUMENTAR no estoque do produto " + nome + ": ");
        int quantidade = sc.nextInt();
        this.estoque += quantidade;
        System.out.println("Estoque atualizado com sucesso!");
        System.out.println("Quantidade atual: " + estoque);
    }

    public void diminuir() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade que deseja DIMINUIR no estoque do produto " + nome + ": ");
        int quantidade = sc.nextInt();
        if (quantidade <= estoque) {
            this.estoque -= quantidade;
            System.out.println("Estoque atualizado com sucesso!");
            System.out.println("Quantidade atual: " + estoque);
        } else {
            System.out.println("Estoque insuficiente para realizar a diminuição.");
        }
    }
}
