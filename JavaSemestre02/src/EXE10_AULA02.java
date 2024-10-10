/*Escreva um programa que determine se um número fornecido pelo usuário é
primo. Um número primo é aquele que só é divisível por 1 e por ele mesmo.*/

import java.util.Scanner;

public class EXE10_AULA02 {
    public static boolean primo(int numero) {
        // Números menores ou iguais a 1 não são primos
        if (numero <= 1) {
            return false;
        }

        // 2 e 3 são primos
        if (numero == 2 || numero == 3) {
            return true;
        }

        // Números pares maiores que 2 não são primos
        if (numero % 2 == 0) {
            return false;
        }

        // Verifica se o número é divisível por algum número ímpar de 3 até a raiz quadrada do número
        for (int i = 3; i <= Math.sqrt(numero); i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }

        // Se passar todas as verificações, o número é primo
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um numero inteiro: ");
        int num = sc.nextInt();

        // Verifica se o número é primo
        boolean resultado = primo(num);

        // Exibe o resultado
        if (resultado) {
            System.out.println(num + " é um número primo.");
        } else {
            System.out.println(num + " não é um número primo.");
        }

        sc.nextLine();
    }
}
