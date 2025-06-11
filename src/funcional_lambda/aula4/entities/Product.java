package funcional_lambda.aula4.entities;

public class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void nonStaticPriceUpdate(Product p) {
        price = price * 1.1;
    }

    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", price);
    }
}
