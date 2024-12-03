package EX01;

public class Motor {
    private int cilindradas;
    private String modelo;
    private TipoCombustivel tipoCombustivel;
    private int rpm;
    private int potencia;

    public Motor(int cilindradas, String modelo, TipoCombustivel tipoCombustivel, int potencia){
        this.cilindradas = cilindradas;
        this.modelo = modelo;
        this.tipoCombustivel = tipoCombustivel;
        this.rpm = 0;
        this.potencia = potencia;
    }

    public void ligar(){
        this.rpm = 1000;
        System.out.println("EX01.Motor ligado. RPM: "+ this.rpm);
    }

    public void desligar(){
        this.rpm = 0;
        System.out.println("EX01.Motor desligado.");
    }

    public void aumentarPotencia(int incremento){
        this.potencia += incremento;
        System.out.println("Potencia aumentada. Potencia: "+ this.potencia);
    }

    public void reduzirPotencia( int decremento){
        if(this.potencia - decremento >= 0){
            this.potencia -= decremento;
            System.out.println("Potencia reduzida. Potencia: "+ this.potencia);
        }else{
            System.out.println("Potencia nao pode ser menor do que 0");
        }
    }

    public void acelerar(int incrementoRpm){
        this.rpm += incrementoRpm;
        System.out.println("Acelerando. RPM atual: " + this.rpm);
    }

    public void reduzirRpm(int decrementoRpm){
        if(this.rpm - decrementoRpm >= 0){
            this.rpm -= decrementoRpm;
            System.out.println("Desacelerando. RPM atual: " + this.rpm);
        }else{
            System.out.println("RPM não pode ser menor que 0");
        }
    }
}