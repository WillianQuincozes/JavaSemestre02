package EXE20;

import java.util.Scanner;

public class TesteBicicleta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a marca da bicicleta: ");
        String marca = sc.nextLine();
        System.out.print("Digite o modelo da bicicleta: ");
        String modelo = sc.nextLine();
        System.out.print("Digite o tamanho da roda (em polegadas): ");
        int tamanhoRoda = sc.nextInt();

        Bicicleta bicicleta = new Bicicleta(marca, modelo, tamanhoRoda);

        bicicleta.pedalar();
        bicicleta.pedalar();
        bicicleta.frear();
        bicicleta.frear();

        sc.close();
    }
}
