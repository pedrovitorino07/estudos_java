package funcional_lambda.aula6.model;

import funcional_lambda.aula6.entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public double filteredSum (List<Product> list, Predicate<Product> criteria) {
        double sum = 0.0;
        for (Product p : list) {
            if (criteria.test(p)) {
                sum += p.getPrice();
            }
        }
        return sum;
    }
}
