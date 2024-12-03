/*Crie uma classe Computador com atributos como processador, memoriaRAM, e armazenamento.
Adicione métodos para ligar e desligar o computador.*/

package EXE06;

public class Computador {
    public String processador;
    public int ram;
    public int armazenamento;

    public Computador(String processador, int ram, int armazenamento) {
        this.processador = processador;
        this.ram = ram;
        this.armazenamento = armazenamento;
    }

    public void ligar(){
        System.out.println("Ligando...");
        System.out.println("Processador: " + processador);
        System.out.println("Ram: " + ram+ "gb");
        System.out.println("Armazenamento: " + armazenamento+ "gb");
    }

    public void desligar(){
        System.out.println("Desligando...");
        System.out.println("Processador: " + processador);
        System.out.println("Ram: " + ram+ "gb");
        System.out.println("Armazenamento: " + armazenamento+ "gb");
    }
}
