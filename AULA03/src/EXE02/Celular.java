/*Defina uma classe Celular com atributos como marca, modelo, e capacidadeBateria.
Adicione métodos para ligar e desligar o celular.*/

package EXE02;

public class Celular {
    public String marca;
    public String modelo;
    public int capacidaBateria;
    public boolean status;

    public Celular(String marca, String modelo, int capacidaBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidaBateria = capacidaBateria;
        this.status = false;
    }

    public void ligar() {
        if (status == true) {
            System.out.println("Celular ja esta ligado!");
        }else {
            System.out.println("Ligando celular!");
            status = true;
        }
    }

    public void desligar() {
        if (status == false) {
            System.out.println("Celular ja esta desligado!");
        }else {
            System.out.println("Desligando celular!");
            status = false;
        }
    }
}
