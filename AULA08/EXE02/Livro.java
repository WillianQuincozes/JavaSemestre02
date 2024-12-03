package EXE02;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private String autor;

    private List<Pagina> pagina;

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.pagina = new ArrayList<>();
    }

    public void adicionarPagina(String conteudo){
        int numeroPagina = pagina.size();
        Pagina novaPagina = new Pagina(numeroPagina, conteudo);
        pagina.add(novaPagina);
        System.out.println("Pagina "+ numeroPagina+ " adicionada ao livro");
    }

    public void listarPagina(){
        for (int i = 0; i < pagina.size(); i++){
            System.out.println(pagina.get(i).toString());
        }
    }
}
