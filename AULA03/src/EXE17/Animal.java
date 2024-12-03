/*Implemente uma classe Animal com atributos especie, idade, e peso. Adicione métodos para alimentar e dormir.*/

package EXE17;

public class Animal {
    public String especie;
    public int age;
    public double peso;
    public boolean comeu = false;
    public boolean dormiu = false;

    public Animal(String especie, int age, double peso) {
        this.especie = especie;
        this.age = age;
        this.peso = peso;
    }

    public void alimentar() {
        if (comeu == false) {
            System.out.println("Alimentando o animal de especie: " + especie+"...");
            comeu = true;
        }else{
            System.out.println("O animal de especie: " + especie+ " já esta alimentado");
        }
    }

    public void dormir() {
        if (dormiu == false) {
            System.out.println("Dormindo o animal de especie: " + especie+"...");
            dormiu = true;
        }else{
            System.out.println("O animal de especie: " + especie+ " já esta dormindo");
        }
    }
}
