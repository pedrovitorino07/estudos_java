package Estrutura_condicional.Aula;

import java.util.Scanner;

public class Aula4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double preco = 34.5;
        // expressão condicional ternaria
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.println(desconto);

        sc.close();
    }
}
