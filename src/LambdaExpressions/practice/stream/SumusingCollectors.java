package LambdaExpressions.practice.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SumusingCollectors {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1, "nahid", 2500));
        products.add(new Product(2, "hanan", 3500));
        products.add(new Product(3, "Amir", 1500));
        products.add(new Product(4, "Mali", 4500));
        double totalPrice = products.stream().collect(Collectors.summingDouble(product->product.getPrice()));
        System.out.println(totalPrice);
    }
}
