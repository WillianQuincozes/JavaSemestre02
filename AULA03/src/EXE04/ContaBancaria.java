/*Crie uma classe ContaBancaria com atributos como numeroConta e saldo.
Adicione métodos para depositar e sacar dinheiro.*/

package EXE04;

import java.util.Scanner;

public class ContaBancaria {
    public int numero;
    public double saldo;

    public ContaBancaria(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void deposito() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do deposito: ");
        double valor = sc.nextDouble();
        this.saldo = this.saldo + valor;
    }

    public void sacar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do saque: ");
        double valor = sc.nextDouble();
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
}
