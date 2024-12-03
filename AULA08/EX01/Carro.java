package EX01;

public class Carro {
    private String modelo;
    private Motor motor;

    public Carro(String modelo, Motor motor){
        this.modelo = modelo;
        this.motor = motor;
    }

    public void adicionarAcelerador(int incrementoRpm){
        motor.acelerar(incrementoRpm);
        System.out.println("Acelerador acionado.");
    }

    public void adicionarFreio(int decrementoRpm){
        motor.reduzirRpm(decrementoRpm);
        System.out.println("Freio acionado.");
    }

    public void trocarMarcha(){
        System.out.println("Marcha trocada.");
    }

    public void ligarCarro(){
        motor.ligar();
        System.out.println("EX01.Carro ligado.");
    }

    public void desligarCarro(){
        motor.desligar();
        System.out.println("EX01.Carro desligado.");
    }

    public void turboBoost(){
        motor.aumentarPotencia(50);
        System.out.println("Turbo Boost acionado!");
    }

    public void reduzirPotenciaMotor(){
        motor.reduzirPotencia(20);
        System.out.println("Potência do motor reduzida.");
    }
}
