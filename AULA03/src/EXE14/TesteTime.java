package EXE14;

import java.util.Scanner;

public class TesteTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nomde do time: ");
        String nome = sc.nextLine();
        System.out.println("Informe o tecnico do time: ");
        String tecnico = sc.nextLine();
        System.out.println("Informe quantidade de jogadores do time: ");
        int jogadores = sc.nextInt();

        Time time = new Time(nome, tecnico, jogadores);

        time.adicionar();
        time.adicionar();
        time.remover();

        sc.close();
    }
}
