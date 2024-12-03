package EXE17;

import java.util.Scanner;

public class TesteAnimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a espécie do animal: ");
        String especie = sc.nextLine();
        System.out.print("Digite a idade do animal: ");
        int idade = sc.nextInt();
        System.out.print("Digite o peso do animal: ");
        double peso = sc.nextDouble();

        Animal animal = new Animal(especie, idade, peso);

        animal.alimentar();
        animal.alimentar();
        animal.dormir();
        animal.dormir();

        sc.close();
    }
}
