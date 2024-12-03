package EXE14;

import java.util.Scanner;

public class Time {
    private String nome;
    private String tecnico;
    private int jogadores;

    public Time(String nome, String tecnico, int jogadores) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.jogadores = jogadores;
    }

    public void adicionar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de jogadores que deseja ADICIONAR: ");
        int quantidade = sc.nextInt();
        jogadores += quantidade;
        System.out.println("Número de jogadores atualizado: " + jogadores);
    }

    public void remover() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de jogadores que deseja REMOVER: ");
        int quantidade = sc.nextInt();

        if (jogadores >= quantidade) {
            jogadores -= quantidade;
        } else {
            System.out.println("Quantidade maior que o atual número de jogadores!!!");
        }
        System.out.println("Número de jogadores atualizado: " + jogadores);
    }
}
