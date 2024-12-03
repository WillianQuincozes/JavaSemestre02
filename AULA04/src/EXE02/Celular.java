package EXE02;

public class Celular {
    private String marca;
    private String modelo;
    private int capacidadeBateria;
    private boolean status;

    public Celular(String marca, String modelo, int capacidadeBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeBateria = capacidadeBateria;
        this.status = false;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public boolean isStatus() {
        return status;
    }

    public void setMarca(String marca) {
        if (marca != null && !marca.isEmpty()) {
            this.marca = marca;
        } else {
            System.out.println("Marca inválida!");
        }
    }

    public void setModelo(String modelo) {
        if (modelo != null && !modelo.isEmpty()) {
            this.modelo = modelo;
        } else {
            System.out.println("Modelo inválido!");
        }
    }

    public void setCapacidadeBateria(int capacidadeBateria) {
        if (capacidadeBateria > 0) {
            this.capacidadeBateria = capacidadeBateria;
        } else {
            System.out.println("Capacidade da bateria inválida!");
        }
    }

    public void ligar() {
        if (status) {
            System.out.println("Celular já está ligado!");
        } else {
            System.out.println("Ligando celular!");
            status = true;
        }
    }

    public void desligar() {
        if (!status) {
            System.out.println("Celular já está desligado!");
        } else {
            System.out.println("Desligando celular!");
            status = false;
        }
    }
}
