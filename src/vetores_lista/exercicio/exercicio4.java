package vetores_lista.exercicio;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.println(" ");

        int pares = 0;

        System.out.println("NÚMEROS PARES: ");
        for (int i = 0; i < n; i++) {
            if (vect[i] % 2 == 0) {
                System.out.print(vect[i] + " ");
                pares++;
            }
        }

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("QUANTIDADE DE PARES = " + pares);


        sc.close();
    }
}
