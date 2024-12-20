package Estrutura_sequencial.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Double raio;
        Double pi = 3.14159;
        Double area;

        raio = sc.nextDouble();
        area = pi * Math.pow(raio, 2);

        System.out.printf("A = %.4f%n", area);
        sc.close();
    }
}
