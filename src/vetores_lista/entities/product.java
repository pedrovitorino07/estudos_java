package vetores_lista.entities;

public class product {

    private String name;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
