/*Escreva um programa que contenha um método chamado soma que receba dois números inteiros
como parâmetros e retorne a soma deles. Chame esse método a partir do método main e exiba o resultado.*/

import java.util.Scanner;

public class EXE07_AULA02 {
    public static int soma(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um numero inteiro: ");
        int a = sc.nextInt();
        System.out.print("Informe um numero inteiro: ");
        int b = sc.nextInt();

        int resultado = soma(a, b);

        System.out.println("A soma entre os numeros: " + resultado);

        sc.nextLine();
    }
}
