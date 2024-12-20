package Estrutura_sequencial.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1, cod2;
        int quantidade1, quantidade2;
        double valorUnitario1, valorUnitario2, total;

        cod1 = sc.nextInt();
        quantidade1 = sc.nextInt();
        valorUnitario1 = sc.nextDouble();
        cod2 = sc.nextInt();
        quantidade2 = sc.nextInt();
        valorUnitario2 = sc.nextDouble();

        total = quantidade1 * valorUnitario1 + quantidade2 * valorUnitario2;

        System.out.printf("Valor a pagar: R$ %.2f\n", total);
        sc.close();
    }
}
