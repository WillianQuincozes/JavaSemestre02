package EXE06;

import java.util.Scanner;

public class TesteComputador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o processador do computador: ");
        String processador = sc.nextLine();
        System.out.println("Informe a quantidade de RAM do computador: ");
        int ram = sc.nextInt();
        System.out.println("Informe a quantidade de ARMAZENAMENTO do computador: ");
        int armazenamento = sc.nextInt();

        Computador computador = new Computador(processador, ram, armazenamento);

        computador.ligar();
        computador.desligar();

        sc.close();
    }
}
