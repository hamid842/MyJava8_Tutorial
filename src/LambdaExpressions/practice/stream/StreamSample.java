package LambdaExpressions.practice.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSample {
    private static List<Product> products = new ArrayList<Product>();

    public static void main(String[] args) {
        products.add(new Product(1, "nahid", 2500));
        products.add(new Product(2, "hanan", 3500));
        products.add(new Product(3, "Amir", 1500));
        products.add(new Product(4, "Mali", 4500));
        withStramApi();
    }

    public static void withStramApi() {
        List<Float> getPriceList = products.stream().filter((product) -> product.getPrice() > 2500)
                .map(product -> product.getPrice()).collect(Collectors.toList());
        getPriceList.forEach(price -> System.out.println(price));
    }
}
