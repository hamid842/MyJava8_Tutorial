package LambdaExpressions.practice.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReferencesInStream {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1, "nahid", 2500f));
        products.add(new Product(2, "hanan", 3500f));
        products.add(new Product(3, "Amir", 1500f));
        products.add(new Product(4, "Mali", 4500f));

        List<Float> floatList = products.stream().filter(p-> p.getPrice() > 3000)
                .map(Product::getPrice).collect(Collectors.toList());
        System.out.println(floatList);
    }
}
