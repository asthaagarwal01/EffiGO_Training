import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product implements Comparable<Product> {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // compareTo method for sorting by price
    @Override
    public int compareTo(Product otherProduct) {
        return Double.compare(this.price, otherProduct.getPrice());
    }

    // converting toString for easy printing
    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + '}';
    }
}

public class SortingObjects {
    public static void main(String[] args) {
       
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1200.90));
        products.add(new Product("Smartphone", 800.0));
        products.add(new Product("Camera", 500.60));
        products.add(new Product("Headphones", 100.5));

        // unsorted list
        System.out.println("\nUnsorted List:");
        for (Product product : products) {
            System.out.println(product);
        }

        // Sorting the list based on prices
        Collections.sort(products);

        // sorted list
        System.out.println("\nSorted List by Price:");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
