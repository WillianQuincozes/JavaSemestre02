/*Crie uma classe Loja com atributos nome, endereco, e telefone. Adicione métodos para abrir e fechar a loja.*/

package EXE16;

public class Loja {
    public String nome;
    public String endereco;
    public String telefone;
    public boolean status = false;

    public Loja(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void abrir(){
        if(status == false){
            System.out.println("Abrindo a loja "+ nome+ "...");
            status = true;
        }else{
            System.out.println("A loja "+ nome+ " já esta aberta!");
        }
    }

    public void fechar(){
        if(status == true){
            System.out.println("Fechando a loja "+ nome+ "...");
            status = false;
        }else {
            System.out.println("A loja "+ nome+ " já esta fechada!");
        }
    }
}
