package LambdaExpressions.practice.stream;

import java.util.ArrayList;
import java.util.List;

public class FilteringIteratingCollection {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product(1,"nahid", 2300));
        productList.add(new Product(2,"Amir", 3000));
        productList.add(new Product(3,"Hanan", 4300));
        productList.add(new Product(4,"Saghar", 5200));
        productList.add(new Product(5,"Sepide", 3100));
        productList.stream().filter(product -> product.getPrice() == 3000)
                .forEach(product -> System.out.println(product.getPrice()));
    }


}
