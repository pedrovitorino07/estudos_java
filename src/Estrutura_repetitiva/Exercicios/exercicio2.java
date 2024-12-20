package Estrutura_repetitiva.Exercicios;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("1° Quadrante");
            }
            else if (x < 0 && y > 0) {
                System.out.println("2° Quadrante");
            }
            else if (x < 0 && y < 0) {
                System.out.println("3° Quadrante");
            }
            else {
                System.out.println("4° Quadrante");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }
}
