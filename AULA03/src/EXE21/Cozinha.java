/*Implemente uma classe Cozinha com atributos tipo, quantidadePessoas, e cor. Adicione métodos para cozinhar e limpar.*/

package EXE21;

public class Cozinha {
    public String tipo;
    public int quantidadePessoas;
    public String cor;

    public Cozinha(String tipo, int quantidadePessoas, String cor) {
        this.tipo = tipo;
        this.quantidadePessoas = quantidadePessoas;
        this.cor = cor;
    }

    public void cozinhar() {
        System.out.println("A cozinha " + tipo + " está cozinhando para " + quantidadePessoas + " pessoas.");
    }

    public void limpar() {
        System.out.println("A cozinha " + tipo + " de cor " + cor + " está sendo limpa.");
    }
}