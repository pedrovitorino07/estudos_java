package funcional_lambda.aula4.util;

import funcional_lambda.aula4.entities.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {
    
    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
}
