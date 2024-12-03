package EXE22;

import java.util.Scanner;

public class TesteEmpresa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome da empresa: ");
        String nome = sc.nextLine();
        System.out.print("Digite o CNPJ da empresa: ");
        String CNPJ = sc.nextLine();
        System.out.print("Digite o número inicial de funcionários: ");
        int numeroFuncionarios = sc.nextInt();

        Empresa empresa = new Empresa(nome, CNPJ, numeroFuncionarios);

        empresa.contratar();
        empresa.contratar();
        empresa.demitir();
        empresa.demitir();

        sc.close();
    }
}
