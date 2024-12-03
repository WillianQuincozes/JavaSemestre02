package EXE10;

import java.util.Scanner;

public class TesteVeiculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tipo de veiculo: ");
        String tipo = sc.nextLine();
        System.out.println("Digite a placa do veiculo: ");
        String placa = sc.nextLine();
        System.out.println("Digite a cor do veiculo: ");
        String cor = sc.nextLine();

        Veiculo veiculo = new Veiculo(tipo, placa, cor);

        veiculo.lavar();
        veiculo.lavar();
        veiculo.abastecer();
        veiculo.abastecer();

        sc.nextLine();
    }
}
