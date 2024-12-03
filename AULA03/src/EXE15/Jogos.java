/*Crie uma classe Jogo com atributos nome, genero, e preco. Adicione métodos para iniciar e pausar o jogo.*/

package EXE15;

public class Jogos {
    public String nome;
    public String genero;
    public double preco;
    public boolean situacao = false;

    public Jogos(String nome, String genero, double preco) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
    }

    public void iniciar() {
        if (situacao == false) {
            System.out.println("Iniciando o jogo: "+ nome);
            situacao = true;
        }else{
            System.out.println("Pare o jogo primeiro para poder iniciar!!!");
        }
    }

    public void parar() {
        if (situacao == true) {
            System.out.println("Parando o jogo: "+ nome);
            situacao = false;
        }else{
            System.out.println("Inicie o jogo primeiro para poder parar!!!");
        }
    }
}
