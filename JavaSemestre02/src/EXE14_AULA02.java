/*Escreva um programa que conte o número de vogais em uma string fornecida pelo usuário.*/

import java.util.Scanner;

public class EXE14_AULA02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe uma palavra: ");
        String palavra = sc.nextLine();
        palavra = palavra.toLowerCase();
        int vogais = 0;

        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == 'a' || palavra.charAt(i) == 'e' || palavra.charAt(i) == 'i' || palavra.charAt(i) == 'o' || palavra.charAt(i) == 'u') {
                vogais++;
            }
        }

        System.out.println("Quantidade de vogais: " + vogais + ", na palavra: " + palavra);
        sc.nextLine();
    }
}
