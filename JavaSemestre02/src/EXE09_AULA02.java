/*Crie um programa que funcione como uma calculadora simples. Ele deve oferecer ao usuário opções para
somar, subtrair, multiplicar ou dividir dois números. Use uma estrutura switch para selecionar a operação.*/

import java.util.Scanner;

public class EXE09_AULA02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        int num1 = sc.nextInt();
        System.out.print("Informe um numero: ");
        int num2 = sc.nextInt();
        System.out.print("Informe a operação que deseja(+,-,*,/): ");
        char opcao = sc.next().charAt(0);

        System.out.print("Resultado: ");

        switch (opcao) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Opção invalida!!!");
                break;
        }
        sc.nextLine();
    }
}
