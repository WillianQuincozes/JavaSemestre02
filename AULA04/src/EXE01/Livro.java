package EXE01;

public class Livro {
    private String livro;
    private String autor;
    private int numeroPaginas;
    private int paginaAtual;
    private boolean aberto;

    public Livro(String livro, String autor, int numeroPaginas) {
        this.livro = livro;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.paginaAtual = 0;
        this.aberto = false;
    }

    public String getLivro() {
        return livro;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setLivro(String livro) {
        if (livro != null && !livro.isEmpty()) {
            this.livro = livro;
        } else {
            System.out.println("Nome do livro inválido!");
        }
    }

    public void setAutor(String autor) {
        if (autor != null && !autor.isEmpty()) {
            this.autor = autor;
        } else {
            System.out.println("Nome do autor inválido!");
        }
    }

    public void setNumeroPaginas(int numeroPaginas) {
        if (numeroPaginas > 0) {
            this.numeroPaginas = numeroPaginas;
        } else {
            System.out.println("Número de páginas inválido!");
        }
    }

    public void abrirLivro() {
        if (!aberto) {
            aberto = true;
            paginaAtual = 1;
            System.out.println("O livro " + livro + " foi aberto, comece a leitura na página " + paginaAtual);
        } else {
            System.out.println("O livro " + livro + " já foi aberto!");
        }
    }

    public void lerPagina() {
        if (aberto) {
            if (paginaAtual <= numeroPaginas) {
                System.out.println("Lendo página " + paginaAtual + " de " + numeroPaginas);
                paginaAtual++;
            } else {
                System.out.println("O livro " + livro + " já foi terminado!");
            }
        } else {
            System.out.println("O livro " + livro + " ainda não foi aberto! Abra o livro antes de ler!");
        }
    }
}
