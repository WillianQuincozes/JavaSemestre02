/*Crie uma classe Veiculo com atributos tipo, placa, e cor. Adicione métodos para abastecer e lavar o veículo*/

package EXE10;

public class Veiculo {
    public String tipo;
    public String placa;
    public String cor;
    public boolean gasolina = false;
    public boolean limpo = false;

    public Veiculo(String tipo, String placa, String cor) {
        this.tipo = tipo;
        this.placa = placa;
        this.cor = cor;
    }

    public void abastecer(){
        if(this.gasolina == true){
            System.out.println("Tanque cheio!");
        }else{
            System.out.println("Abastecendo "+ tipo+ "... placa: "+ placa);
            this.gasolina = true;
        }
    }

    public void lavar(){
        if(this.limpo == true){
            System.out.println("Carro está loimpo!");
        }else{
            System.out.println("Lavando "+ tipo+ "... placa: "+ placa);
            this.limpo = true;
        }
    }
}
