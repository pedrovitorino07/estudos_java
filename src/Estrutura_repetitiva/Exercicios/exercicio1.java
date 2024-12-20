package Estrutura_repetitiva.Exercicios;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha invalida");
            System.out.println("Digite uma senha válida: ");
            senha = sc.nextInt();
        }

        System.out.println("Acesso Permitido!");

        sc.close();
    }
}
