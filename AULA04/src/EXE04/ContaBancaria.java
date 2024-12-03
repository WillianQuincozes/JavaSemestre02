package EXE04;

import java.util.Scanner;

public class ContaBancaria {
    private int numero;
    private double saldo;

    public ContaBancaria(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do deposito: ");
        double valor = sc.nextDouble();
        this.saldo += valor;
    }

    public void sacar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do saque: ");
        double valor = sc.nextDouble();
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
