/*Desenvolva um jogo de adivinhação onde o computador escolhe um número aleatório entre
1 e 100, e o usuário deve adivinhar qual é o número. O programa deve fornecer dicas ao
usuário se o palpite for muito alto ou muito baixo e contar o número de tentativas até o acerto.*/

import java.util.Random;
import java.util.Scanner;

public class EXE13_AULA02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        int numeroSorteado = random.nextInt(100) + 1;

        int contador = 0;
        int numero;

        while (true){
            System.out.print("Digite um numero entre 1 e 100: ");
            numero = sc.nextInt();
            contador++;
            if (numero == numeroSorteado){
                System.out.println("Parabens acertou!!!");
                System.out.println("O numero sorteado é: " + numeroSorteado);
                System.out.println("Você acertou na " +contador+ "º tentativa!!!");
                break;
            }
            else if (numero > numeroSorteado){
                System.out.println("O numero sorteado é MENOR");
            }
            else{
                System.out.println("O numero sorteado é MAIOR");
            }
        }
        sc.close();
    }
}
