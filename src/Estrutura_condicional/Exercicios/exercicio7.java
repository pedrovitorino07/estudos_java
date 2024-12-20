package Estrutura_condicional.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o eixo x: ");
        double x = sc.nextDouble();
        System.out.println("Digite o eixo y: ");
        double y = sc.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("Q1");
        }
        else if (x == 0) {
            System.out.println("Eixo Y");
        }
        else if (y == 0) {
            System.out.println("Eixo X");
        }
        else if (x > 0 && y < 0) {
            System.out.println("Q4");
        }
        else if (x < 0 && y < 0) {
            System.out.println("Q2");
        }
        else if (x < 0 && y > 0) {
            System.out.println("Q3");
        }
        else {
            System.out.println("Origem");
        }
        sc.close();
    }
}
