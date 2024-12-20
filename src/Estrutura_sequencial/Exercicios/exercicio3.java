package Estrutura_sequencial.Exercicios;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A;
        int B;
        int soma;

        A = sc.nextInt();
        B = sc.nextInt();
        soma = A + B;

        System.out.println("SOMA = " + soma);
        sc.close();
    }
}
