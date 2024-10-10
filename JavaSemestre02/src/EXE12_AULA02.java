/*Implemente um programa que leia 5 números inteiros do usuário,
armazene-os em um array e os imprima em ordem crescente.*/

import java.util.Arrays;
import java.util.Scanner;

public class EXE12_AULA02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[5];
        for (int i=0; i<5; i++){
            System.out.print("Informe um numero inteiro para adicionar no VETOR["+i+"]: ");
            vetor[i] = sc.nextInt();
        }
        Arrays.sort(vetor);

        for (int i=0; i<5; i++){
            System.out.println(vetor[i]);
        }
        sc.nextLine();
    }
}
