package EXE02;

public class Pagina {
    private int numero;
    private String conteudo;

    public Pagina(int numero, String conteudo){
        this.numero = numero;
        this.conteudo = conteudo;
    }

    public int getNumero(){
        return numero;
    }

    public String conteudo(){
        return conteudo;
    }

    public String toString(){
        return "Pagina "+ numero+ ": "+ conteudo;
    }
}