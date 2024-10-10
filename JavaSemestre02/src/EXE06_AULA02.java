/*Crie um programa que declare um array de inteiros com 5 elementos,
inicialize-o com valores e imprima todos os valores do array no console.*/

import java.util.Scanner;

public class EXE06_AULA02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Informe um numero inteiro para adicionar no VETOR["+i+"]: ");
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        sc.close();
    }
}