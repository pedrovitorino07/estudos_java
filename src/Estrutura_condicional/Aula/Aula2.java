package Estrutura_condicional.Aula;

import java.util.Locale;
import java.util.Scanner;

public class Aula2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // a += b; mesma coisa de a = a + b;
        // a -= b; mesma coisa de a = a - b;
        // a *= b; mesma coisa de a = a * b;
        // a /= b; mesma coisa de a = a / b;
        // a %= b; mesma coisa de a = a % b;

        System.out.println("Digite quantos minutos: ");
        int minutos = sc.nextInt();

        double conta = 50.0;
        if(minutos > 100) {
            conta = conta + (minutos - 100) * 2.0;
            //conta += (minutos - 10) * 2.0; mesma coisa
        }

        System.out.printf("Valor da conta = R$ %.2f%n", conta);

        sc.close();
    }
}
