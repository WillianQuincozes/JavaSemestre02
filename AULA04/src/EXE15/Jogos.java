package EXE15;

public class Jogos {
    private String nome;
    private String genero;
    private double preco;
    private boolean situacao = false;

    public Jogos(String nome, String genero, double preco) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
    }

    public void iniciar() {
        if (!situacao) {
            System.out.println("Iniciando o jogo: " + nome);
            situacao = true;
        } else {
            System.out.println("Pare o jogo primeiro para poder iniciar!!!");
        }
    }

    public void parar() {
        if (situacao) {
            System.out.println("Parando o jogo: " + nome);
            situacao = false;
        } else {
            System.out.println("Inicie o jogo primeiro para poder parar!!!");
        }
    }
}
