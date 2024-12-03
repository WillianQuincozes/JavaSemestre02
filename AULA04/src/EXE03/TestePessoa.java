package EXE03;

import java.util.Scanner;

public class TestePessoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome da Pessoa: ");
        String nome = sc.nextLine();
        System.out.print("Digite a idade da Pessoa: ");
        int idade = sc.nextInt();
        System.out.print("Digite a altura da Pessoa: ");
        double altura = sc.nextDouble();

        Pessoa pessoa = new Pessoa(nome, idade, altura);

        pessoa.apresentacao();

        sc.close();
    }
}
