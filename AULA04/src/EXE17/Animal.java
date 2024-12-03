package EXE17;

public class Animal {
    private String especie;
    private int idade;
    private double peso;
    private boolean comeu = false;
    private boolean dormiu = false;

    public Animal(String especie, int idade, double peso) {
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }

    public void alimentar() {
        if (!comeu) {
            System.out.println("Alimentando o animal da espécie: " + especie + "...");
            comeu = true;
        } else {
            System.out.println("O animal da espécie: " + especie + " já está alimentado.");
        }
    }

    public void dormir() {
        if (!dormiu) {
            System.out.println("O animal da espécie: " + especie + " está dormindo...");
            dormiu = true;
        } else {
            System.out.println("O animal da espécie: " + especie + " já está dormindo.");
        }
    }
}
