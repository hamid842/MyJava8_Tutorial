package LambdaExpressions.practice.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertListintoSet {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1, "nahid", 2500f));
        products.add(new Product(2, "hanan", 3500f));
        products.add(new Product(3, "Amir", 1500f));
        products.add(new Product(4, "Mali", 4500f));
        Set<Float> productList = products.stream().filter(product -> product.getPrice() < 3000)
                .map(product -> product.getPrice()).collect(Collectors.toSet());
        System.out.println(productList);
    }

}
