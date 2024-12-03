package EXE06;

public class Computador {
    private String processador;
    private int ram;
    private int armazenamento;

    public Computador(String processador, int ram, int armazenamento) {
        this.processador = processador;
        this.ram = ram;
        this.armazenamento = armazenamento;
    }

    public String getProcessador() {
        return processador;
    }

    public int getRam() {
        return ram;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void ligar() {
        System.out.println("Ligando...");
        System.out.println("Processador: " + processador);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Armazenamento: " + armazenamento + " GB");
    }

    public void desligar() {
        System.out.println("Desligando...");
        System.out.println("Processador: " + processador);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Armazenamento: " + armazenamento + " GB");
    }
}
