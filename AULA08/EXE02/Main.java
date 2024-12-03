package EXE02;

public class Main {
    public static void main(String[] args){
        Livro livro = new Livro("Diario de um Willian", "Willian");

        livro.adicionarPagina("Seja Bem vindo");
        livro.adicionarPagina("Era uma vez......");
        livro.adicionarPagina("....FIM");

        livro.listarPagina();
    }
}
