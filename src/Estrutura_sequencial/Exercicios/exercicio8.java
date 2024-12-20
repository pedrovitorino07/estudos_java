package Estrutura_sequencial.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextFloat();
        double B = sc.nextFloat();
        double C = sc.nextFloat();

        double areaTriangulo = A * C / 2.0;
        double areaCirculo = 3.14159 * C * C;
        double areaTrapezio = (A + B) / 2.0 * C;
        double areaQuadrado = B * B;
        double areaRetangulo = A * B;

        System.out.printf("Triangulo: %.3f\n", areaTriangulo);
        System.out.printf("Circulo: %.3f\n", areaCirculo);
        System.out.printf("Trapezio: %.3f\n", areaTrapezio);
        System.out.printf("Quadrado: %.3f\n", areaQuadrado);
        System.out.printf("Retangulo: %.3f\n", areaRetangulo);

        sc.close();
    }
}
