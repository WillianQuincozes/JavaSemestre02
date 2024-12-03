/*Defina uma classe Cachorro com atributos nome, raca, e idade. Adicione métodos para latir e correr.*/

package EXE05;

public class Cachorro {
    public String nome;
    public String raca;
    public int idade;

    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public void latir() {
        System.out.println("AuAuAu");
        System.out.println("O Cachorro " + nome + ", com "+ idade + " anos, esta LATINDO!");
    }

    public void correr(){
        System.out.println("Correndo");
        System.out.println("O Cachorro " + nome + ", com "+ idade + " anos, esta CORRENDO!");
    }
}
