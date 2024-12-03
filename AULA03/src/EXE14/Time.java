/*Defina uma classe Time com atributos como nome, tecnico, e numeroDeJogadores. Adicione métodos para adicionar e remover jogadores.*/

package EXE14;

import java.util.Scanner;

public class Time {
    public String nome;
    public String tecnico;
    public int jogadores;

    public Time(String nome, String tecnico, int jogadores) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.jogadores = jogadores;
    }

    public void adicionar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de jogador que deseja ADICIONAR: ");
        int quantidade = sc.nextInt();
        jogadores += quantidade;
        System.out.println("Numero de jogadores atualizado: " + jogadores);
    }

    public void remover(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de jogador que deseja REMOVER: ");
        int quantidade = sc.nextInt();

        if(jogadores >= quantidade){
            jogadores -= quantidade;
        }else{
            System.out.println("Quantiade maior que o atual numero de jogadores!!!");
        }
        System.out.println("Numero de jogadores atualizado: " + jogadores);
    }
}
