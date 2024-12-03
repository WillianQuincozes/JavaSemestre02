/*Implemente uma classe Pessoa com atributos nome, idade, e altura.
Adicione um métod que imprime uma apresentação da pessoa*/

package EXE03;

public class Pessoa {
    public String nome;
    public int idade;
    public double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void apresentacao(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
    }
}
