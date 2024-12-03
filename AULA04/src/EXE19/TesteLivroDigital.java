package EXE19;

import java.util.Scanner;

public class TesteLivroDigital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o título do livro digital: ");
        String titulo = sc.nextLine();
        System.out.print("Digite o autor do livro digital: ");
        String autor = sc.nextLine();
        System.out.print("Digite o tamanho do arquivo do livro digital (em MB): ");
        double tamanhoArquivo = sc.nextDouble();

        LivroDigital livroDigital = new LivroDigital(titulo, autor, tamanhoArquivo);

        livroDigital.abrirLivro();
        livroDigital.abrirLivro();
        livroDigital.fecharLivro();
        livroDigital.fecharLivro();

        sc.close();
    }
}
