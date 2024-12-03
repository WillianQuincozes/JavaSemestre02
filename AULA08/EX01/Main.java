package EX01;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor(2000, "V8 Turbo", TipoCombustivel.GASOLINA, 500);

        Carro carro = new Carro("BMW M3", motor);

        carro.ligarCarro();
        carro.adicionarAcelerador(3000);
        carro.trocarMarcha();
        carro.turboBoost();
        carro.adicionarFreio(2000);
        carro.desligarCarro();
    }
}