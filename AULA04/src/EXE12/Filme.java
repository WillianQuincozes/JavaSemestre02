package EXE12;

public class Filme {
    private String titulo;
    private String diretor;
    private Double duracao;
    private boolean situacao;

    public Filme(String titulo, String diretor, Double duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
        this.situacao = false;
    }

    public void iniciar() {
        if (!situacao) {
            System.out.println("Iniciando o filme " + titulo + "...");
            situacao = true;
        } else {
            System.out.println("Pare o filme primeiro!!!");
        }
    }

    public void parar() {
        if (situacao) {
            System.out.println("Parando o filme " + titulo + "...");
            situacao = false;
        } else {
            System.out.println("Inicie o filme primeiro!!!");
        }
    }
}
