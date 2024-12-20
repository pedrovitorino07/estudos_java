package Estrutura_repetitiva.Exercicios;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int alcool = 0;
        int diesel = 0;
        int gasolina = 0;

        while (x < 4 && x > 0) {
            if ( x == 1 ){
                System.out.println("Alcool: 1");
                alcool += 1;
                x = sc.nextInt();
            }
            else if ( x == 2 ){
                System.out.println("Gasolina: 2");
                gasolina += 1;
                x = sc.nextInt();
            }
            else if ( x == 3 ){
                System.out.println("Diesel: 3");
                diesel += 1;
                x = sc.nextInt();
            }
        }
        System.out.println("Muito obrigado!");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
