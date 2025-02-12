package POO.Aula;

import POO.Entidades.Product;

import java.util.Locale;
import java.util.Scanner;

public class Aula2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println(product.name + " , " + product.price + " , " + product.quantity);

        sc.close();
    }
}
