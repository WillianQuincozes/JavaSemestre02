/*Crie um programa que verifique se uma palavra fornecida pelo usuário
é um palíndromo (palavra que se lê da mesma forma de trás para frente).*/

import java.util.Scanner;

public class EXE11_AULA02 {
    public static boolean palindromo(String palavra){
        for (int i = 0; i < palavra.length() / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt((palavra.length()) - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe uma palavra: ");
        String palavra = sc.nextLine();

        boolean resultado = palindromo(palavra);

        if (resultado) {
            System.out.println("A palavra " + palavra + " é um palíndromo!");
        }
        else {
            System.out.println("A palavra " + palavra + " não é um palíndromo!");
        }
        sc.nextLine();
    }
}
