/*Escreva um programa que leia dois números do usuário e exiba a soma, subtração, multiplicação e divisão desses números.*/

import java.util.Scanner;

public class EXE03_AULA02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        double num1 = sc.nextDouble();
        System.out.print("Informe um numero: ");
        double num2 = sc.nextDouble();

        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num1 / num2;

        System.out.println("A soma entres o numero é: " + soma);
        System.out.println("A subtração entre os numero é: " + subtracao);
        System.out.println("A multiplicação entre os numeros: " + multiplicacao);
        System.out.println("A divisão entre os numeros: " + divisao);

        sc.close();
    }
}
