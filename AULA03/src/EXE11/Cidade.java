/*Crie uma classe Cidade com atributos nome, populacao, e estado. Adicione métodos para aumentar e diminuir a população.*/

package EXE11;

import java.util.Scanner;

public class Cidade {
    public String nome;
    public String estado;
    public int pupulacao;

    public Cidade(String nome, String estado, int pupulacao) {
        this.nome = nome;
        this.estado = estado;
        this.pupulacao = pupulacao;
    }

    public void aumentarPupulacao() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o aumento que teve na pupulacao: ");
        int aumento = sc.nextInt();
        this.pupulacao = aumento + this.pupulacao;
        System.out.println("Pupulacao atual: " + this.pupulacao);
    }

    public void diminuirPupulacao() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o defeti que teve na pupulacao: ");
        int defeti = sc.nextInt();
        if (this.pupulacao >= defeti){
            this.pupulacao = this.pupulacao - defeti;
        }else{
            System.out.println("O numero de defeti de pessoas é maior que a população atual!");
        }
        System.out.println("Pupulacao atual: " + this.pupulacao);
    }
}
