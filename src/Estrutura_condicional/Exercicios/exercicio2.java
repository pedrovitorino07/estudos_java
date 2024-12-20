package Estrutura_condicional.Exercicios;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Par!");
        } else {
            System.out.println("Impar!");
        }

        sc.close();
    }
}
