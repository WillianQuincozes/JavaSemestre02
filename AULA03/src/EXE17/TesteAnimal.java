package EXE17;

import java.util.Scanner;

public class TesteAnimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a especie do animal: ");
        String especie = sc.nextLine();
        System.out.println("Informe a idade do animal: ");
        int age = sc.nextInt();
        System.out.println("Informe o peso do animal: ");
        double peso = sc.nextDouble();

        Animal a = new Animal(especie, age, peso);

        a.alimentar();
        a.alimentar();
        a.dormir();
        a.dormir();

        sc.close();
    }
}
