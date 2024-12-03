package EXE01;

import java.util.Scanner;

public class Livro {
    public String livro;
    public String autor;
    public int numeroPaginas;
    public int paginaAtual;
    public boolean aberto;

    public Livro(String livro, String autor, int numeroPaginas) {
        this.livro = livro;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        paginaAtual = 0;
        aberto = false;
    }

    public void abrirLivro() {
        if(aberto == false) {
            aberto = true;
            paginaAtual = 1;
            System.out.println("O livro "+ livro+ " foi aberto, começe a leitura na pagina "+ paginaAtual);
        }else{
            System.out.println("O livro "+ livro+ " ja foi aberto!");
        }
    }
    public void lerPagina() {
        if (aberto == true) {
            if (paginaAtual <= numeroPaginas) {
                System.out.println("Lendo pagina "+ paginaAtual+ " de "+ numeroPaginas);
                paginaAtual++;
            }else{
                System.out.println("O livro "+ livro+ " ja foi terminado!");
            }
        }else {
            System.out.println("O livro "+ livro+ " ainda não foi aberto! Abra o livro antes de ler!");
        }
    }
}
