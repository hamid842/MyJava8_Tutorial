package LambdaExpressions.practice.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListintoMap {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1, "nahid", 2500f));
        products.add(new Product(2, "hanan", 3500f));
        products.add(new Product(3, "Amir", 1500f));
        products.add(new Product(4, "Mali", 4500f));
        Map<Integer,String> integerStringMap = products.stream()
                .collect(Collectors.toMap(p-> p.getId(),p -> p.getName()));
        System.out.println(integerStringMap);
    }
}
