/*Implemente uma classe Filme com atributos titulo, diretor, e duracao. Adicione métodos para iniciar e parar o filme.*/

package EXE12;

public class Filme {
    public String titulo;
    public String diretor;
    public Double duracao;
    public boolean situacao = false;

    public Filme(String titulo, String diretor, Double duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public void iniciar(){
        if (situacao == false){
            System.out.println("Iniciando o filme "+ titulo+"...");
            situacao = true;
        }else{
            System.out.println("Pare o filme primeiro!!!");
        }
    }

    public void parar(){
        if (situacao == true){
            System.out.println("Parando o filme "+ titulo+"...");
            situacao = false;
        }else{
            System.out.println("Inicie o filme primeiro!!!");
        }
    }
}
