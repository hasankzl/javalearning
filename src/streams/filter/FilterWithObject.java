package streams.filter;

import java.util.ArrayList;
import java.util.List;

class Product
{
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "streams.filter.Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
public class FilterWithObject {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        productList.add(new Product(1,"phone",100));
        productList.add(new Product(2,"Laptop",200));
        productList.add(new Product(3,"smart watch",50));
        productList.add(new Product(4,"iphone",150));

        productList.stream().filter(p -> p.price >100).forEach(System.out::println);
    }
}
