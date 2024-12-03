package EXE19;

public class LivroDigital {
    private String titulo;
    private String autor;
    private double tamanhoArquivo; // Tamanho do arquivo em MB
    private int paginaAtual;
    private boolean aberto;

    public LivroDigital(String titulo, String autor, double tamanhoArquivo) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamanhoArquivo = tamanhoArquivo;
        this.paginaAtual = 0;
        this.aberto = false;
    }

    public void abrirLivro() {
        if (!aberto) {
            aberto = true;
            paginaAtual = 1;
            System.out.println("O livro digital \"" + titulo + "\" foi aberto. Inicie a leitura na página " + paginaAtual);
        } else {
            System.out.println("O livro digital \"" + titulo + "\" já está aberto!");
        }
    }

    public void fecharLivro() {
        if (aberto) {
            aberto = false;
            System.out.println("O livro digital \"" + titulo + "\" foi fechado.");
        } else {
            System.out.println("O livro digital \"" + titulo + "\" já está fechado!");
        }
    }
}
