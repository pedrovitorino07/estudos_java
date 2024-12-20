package Estrutura_condicional.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a renda: ");
        double renda = sc.nextDouble();
        double imposto;

        if (renda < 2000.00) {
            System.out.println("Isento");
        }
        else if (renda <= 3000.00) {
            imposto = (renda - 2000.0) * 0.08;
            System.out.printf("R$ %.2f%n", imposto);
        }
        else if (renda <= 4500.00) {
            imposto = (renda - 3000.0) * 0.18 + 1000.0 * 0.08;
            System.out.printf("R$ %.2f%n", imposto);
        }
        else if (renda > 4500.00) {
            imposto = (renda - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
            System.out.printf("R$ %.2f%n", imposto);
        }

        sc.close();
    }
}
