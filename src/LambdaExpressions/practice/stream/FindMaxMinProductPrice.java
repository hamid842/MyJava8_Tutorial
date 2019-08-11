package LambdaExpressions.practice.stream;

import java.util.ArrayList;
import java.util.List;

public class FindMaxMinProductPrice {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1, "nahid", 2500f));
        products.add(new Product(2, "hanan", 3500f));
        products.add(new Product(3, "Amir", 1500f));
        products.add(new Product(4, "Mali", 4500f));
        Product productMax = products.stream().max((product1, product2) ->
                product1.getPrice() > product2.getPrice() ? 1 : -1).get();
        System.out.println(productMax.getPrice());

        Product productMin = products.stream().max((product1, product2) ->
                product1.getPrice() < product2.getPrice() ? 1 : -1).get();
        System.out.println(productMin.getPrice());
    }
}
