package EXE01;

import java.util.Scanner;

public class TesteLivro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do livro: ");
        String titulo = sc.nextLine();
        System.out.println("Digite o autor do livro: ");
        String autor = sc.nextLine();
        System.out.println("Digite o número de páginas: ");
        int numeroPaginas = sc.nextInt();

        Livro livro = new Livro(titulo, autor, numeroPaginas);

        livro.abrirLivro();
        livro.lerPagina();
        livro.lerPagina();

        sc.close();
    }
}
