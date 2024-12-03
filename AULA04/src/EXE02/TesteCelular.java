package EXE02;

import java.util.Scanner;

public class TesteCelular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a marca do celular: ");
        String marca = sc.nextLine();
        System.out.println("Digite o modelo do celular: ");
        String modelo = sc.nextLine();
        System.out.println("Digite a capacidade da bateria do celular: ");
        int capacidadeBateria = sc.nextInt();

        Celular celular = new Celular(marca, modelo, capacidadeBateria);
        sc.close();

        celular.ligar();
        celular.ligar();
        celular.desligar();
        celular.desligar();
    }
}
