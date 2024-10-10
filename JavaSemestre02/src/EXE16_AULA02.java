/*Desenvolva um programa que converta temperaturas entre Celsius e Fahrenheit.
O usuário deve escolher qual conversão deseja realizar e inserir o valor da temperatura a ser convertida.*/

import java.util.Scanner;

public class EXE16_AULA02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá!!! Qual conversão deseja fazer: ");
        System.out.println("Celsius para Fahrenheit: (1)");
        System.out.println("Fahrenheit para Celsius: (2)");
        int escolha = sc.nextInt();
        double fahrenheit;
        double celsius;
        
        if (escolha == 1) {
            System.out.print("Informe a temperatura em graus Celsius: ");
            celsius = sc.nextDouble();
            fahrenheit = (celsius * 9/5) + 32;
            System.out.println("Fahrenheit: " + fahrenheit);
        }
        else if (escolha == 2) {
            System.out.print("Informe a temperatura em graus Fahrenheit: ");
            fahrenheit = sc.nextDouble();
            celsius = (fahrenheit - 32) * 5/9;
            System.out.println("Celsius: " + celsius);
        }
        sc.nextLine();
    }
}
