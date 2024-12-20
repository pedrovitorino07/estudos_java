package Estrutura_sequencial.Exercicios;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A;
        int B;
        int C;
        int D;
        int diferenca;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        diferenca = (A * B - C * D);

        System.out.println("Diferença = " + diferenca);
        sc.close();
    }
}
