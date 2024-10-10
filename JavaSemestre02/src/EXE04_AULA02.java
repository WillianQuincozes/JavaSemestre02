/*Crie um programa que leia um número inteiro do usuário e verifique
se ele é par ou ímpar. Exiba uma mensagem correspondente no console.*/

import java.util.Scanner;

public class EXE04_AULA02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um numero inteiro: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("O numero é PAR!");
        }
        else {
            System.out.println("O numero é IMPAR!");
        }

        sc.close();
    }
}
