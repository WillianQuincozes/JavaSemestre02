package EXE11;

import java.util.Scanner;

public class Cidade {
    private String nome;
    private String estado;
    private int populacao;

    public Cidade(String nome, String estado, int populacao) {
        this.nome = nome;
        this.estado = estado;
        this.populacao = populacao;
    }

    public void aumentarPopulacao() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o aumento que teve na população: ");
        int aumento = sc.nextInt();
        this.populacao += aumento;
        System.out.println("População atual: " + this.populacao);
    }

    public void diminuirPopulacao() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de pessoas que saiu: ");
        int defeitos = sc.nextInt();
        if (this.populacao >= defeitos) {
            this.populacao -= defeitos;
        } else {
            System.out.println("O número de pessoas que saiu é maior que a população atual!");
        }
        System.out.println("População atual: " + this.populacao);
    }
}
