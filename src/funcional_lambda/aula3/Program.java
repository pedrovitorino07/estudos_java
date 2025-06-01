package funcional_lambda.aula3;

import funcional_lambda.aula3.entities.Product;
import funcional_lambda.aula3.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // list.removeIf(new  ProductPredicate());
        // list.removeIf(p -> p.getPrice() >= 100);
        // list.removeIf(Product::staticProductPredicate);
        // list.removeIf(Product::nonStaticProductPredicate);
        // Predicate<Product> pred = p -> p.getPrice() >= 100.0;

        list.removeIf(p -> p.getPrice() >= 100);

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
