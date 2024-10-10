/*Escreva um programa que imprima todos os números de 1 a 10 usando um loop for.*/

import java.util.Scanner;

public class EXE05_AULA02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i=1; i<=10; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}
