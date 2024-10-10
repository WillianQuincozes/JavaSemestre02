/*Crie um programa que declare variáveis de diferentes tipos (int, double, boolean, char) e
as inicialize com valores apropriados. Em seguida, imprima esses valores no console*/

import java.util.Scanner;

public class EXE02_AULA02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero inteiro: ");
        int num = scanner.nextInt();
        System.out.print("Informe um numero quebrado: ");
        double quebrado = scanner.nextDouble();
        boolean valorBooleano = true;
        System.out.print("Informe uma letra: ");
        char letra = scanner.next().charAt(0);

        System.out.println("Valor do inteiro: " + num);
        System.out.println("Valor do double: " + quebrado);
        System.out.println("Valor do boolean: " + valorBooleano);
        System.out.println("Valor do char: " + letra);

        scanner.close();
    }
}
