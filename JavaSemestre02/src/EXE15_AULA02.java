/*Crie um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 Utilize tanto a versão iterativa quanto a versão recursiva.*/

import java.util.Scanner;

public class EXE15_AULA02 {
    public static long fatorialIterativo(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static long fatorialRecursivo(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fatorialRecursivo(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        double resultadoIterativo = fatorialIterativo(numero);
        System.out.println("Fatorial (iterativo) de " + numero + " é: " + resultadoIterativo);

        double resultadoRecursivo = fatorialRecursivo(numero);
        System.out.println("Fatorial (recursivo) de " + numero + " é: " + resultadoRecursivo);

        sc.close();
    }
}
