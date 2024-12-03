package EXE04;

import java.util.Scanner;

public class testeContaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero da conta: ");
        int numero = sc.nextInt();
        System.out.print("Digite o saldo da conta: ");
        double saldo = sc.nextDouble();

        ContaBancaria conta = new ContaBancaria(numero, saldo);
        conta.deposito();
        conta.sacar();
        System.out.println("Saldo: R$" + conta.getSaldo());

        sc.close();
    }
}