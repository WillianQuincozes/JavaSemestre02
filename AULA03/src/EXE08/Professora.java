/*Crie uma classe Professor com atributos nome, disciplina, e salario. Adicione métodos para dar aula e corrigir provas.*/

package EXE08;

public class Professora {
    public String nome;
    public String diciplina;
    public double salario;

    public Professora(String nome, String diciplina, double salario) {
        this.nome = nome;
        this.diciplina = diciplina;
        this.salario = salario;
    }

    public void aula(){
        System.out.println("O(a) professor(a) "+nome +" esta dando aula agora de "+diciplina);
    }

    public void prova(){
        System.out.println("O(a) professor(a) "+nome +" esta corrigindo provas agora!");
    }
}
