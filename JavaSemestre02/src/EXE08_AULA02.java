/*Escreva um programa que leia o nome e a idade de uma pessoa a partir
do teclado e imprima uma mensagem no console com essas informações.*/

import java.util.Scanner;

public class EXE08_AULA02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Informe sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Olá, " + nome + ", você tem " + idade + " anos!");

        sc.nextLine();
    }
}
