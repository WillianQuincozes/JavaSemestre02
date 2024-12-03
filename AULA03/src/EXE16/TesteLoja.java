package EXE16;

import java.util.Scanner;

public class TesteLoja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome da loja: ");
        String nome = sc.nextLine();
        System.out.print("Digite o endereço da loja: ");
        String endereco = sc.nextLine();
        System.out.print("Digite o telefone da loja: ");
        String telefone = sc.nextLine();

        Loja loja = new Loja(nome, endereco, telefone);

        loja.abrir();
        loja.abrir();
        loja.fechar();
        loja.fechar();

        sc.close();
    }
}
