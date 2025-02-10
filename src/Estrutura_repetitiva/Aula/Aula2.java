package Estrutura_repetitiva.Aula;
import java.util.Scanner;

public class Aula2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Número de vezes que o For eh feito
        int N = sc.nextInt();

        int soma = 0;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            soma += x;
        }

        System.out.println(soma);
        sc.close();
    }
}
