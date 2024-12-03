package EXE20;

public class Bicicleta {
    private String marca;
    private String modelo;
    private int tamanhoRoda; // Tamanho da roda em polegadas
    private boolean emMovimento;

    public Bicicleta(String marca, String modelo, int tamanhoRoda) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoRoda = tamanhoRoda;
        this.emMovimento = false;
    }

    public void pedalar() {
        if (!emMovimento) {
            emMovimento = true;
            System.out.println("Você começou a pedalar a bicicleta " + marca + " " + modelo + ".");
        } else {
            System.out.println("Você já está pedalando a bicicleta " + marca + " " + modelo + ".");
        }
    }

    public void frear() {
        if (emMovimento) {
            emMovimento = false;
            System.out.println("Você parou de pedalar a bicicleta " + marca + " " + modelo + ".");
        } else {
            System.out.println("A bicicleta " + marca + " " + modelo + " já está parada.");
        }
    }
}
