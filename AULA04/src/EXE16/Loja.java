package EXE16;

public class Loja {
    private String nome;
    private String endereco;
    private String telefone;
    private boolean status = false;

    public Loja(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void abrir() {
        if (!status) {
            System.out.println("Abrindo a loja " + nome + "...");
            status = true;
        } else {
            System.out.println("A loja " + nome + " já está aberta!");
        }
    }

    public void fechar() {
        if (status) {
            System.out.println("Fechando a loja " + nome + "...");
            status = false;
        } else {
            System.out.println("A loja " + nome + " já está fechada!");
        }
    }
}
