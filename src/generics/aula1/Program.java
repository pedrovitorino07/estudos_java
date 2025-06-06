package generics.aula1;

import generics.aula1.Services.PrintService;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrintService<String> ps = new PrintService<>();

        System.out.println("How many values? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String value =  sc.next();
            ps.addValue(value);
        }

        ps.print();
        String x = ps.first();
        System.out.println("First: " + x);

        sc.close();
    }
}
