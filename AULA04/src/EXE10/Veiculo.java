package EXE10;

public class Veiculo {
    private String tipo;
    private String placa;
    private String cor;
    private boolean gasolina;
    private boolean limpo;

    public Veiculo(String tipo, String placa, String cor) {
        this.tipo = tipo;
        this.placa = placa;
        this.cor = cor;
        this.gasolina = false;
        this.limpo = false;
    }

    public void abastecer() {
        if (gasolina) {
            System.out.println("Tanque cheio!");
        } else {
            System.out.println("Abastecendo " + tipo + "... placa: " + placa);
            gasolina = true;
        }
    }

    public void lavar() {
        if (limpo) {
            System.out.println("Veículo já está limpo!");
        } else {
            System.out.println("Lavando " + tipo + "... placa: " + placa);
            limpo = true;
        }
    }
}
