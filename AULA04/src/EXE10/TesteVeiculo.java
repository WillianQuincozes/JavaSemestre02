package EXE10;

import java.util.Scanner;

public class TesteVeiculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tipo de veículo: ");
        String tipo = sc.nextLine();
        System.out.println("Digite a placa do veículo: ");
        String placa = sc.nextLine();
        System.out.println("Digite a cor do veículo: ");
        String cor = sc.nextLine();

        Veiculo veiculo = new Veiculo(tipo, placa, cor);
        veiculo.lavar();
        veiculo.lavar();
        veiculo.abastecer();
        veiculo.abastecer();

        sc.close();
    }
}
