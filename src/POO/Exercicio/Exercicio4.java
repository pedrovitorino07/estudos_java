package POO.Exercicio;

import POO.EntidadesExercicio.CurrencyConverter;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double dollars = sc.nextDouble();

        CurrencyConverter converter = new CurrencyConverter(dollarPrice);
        double amountInReais = converter.calculateAmountInReais(dollars);

        System.out.printf("Amount to be paid in reais = %.2f%n", amountInReais);

        sc.close();
    }
}
