package LambdaExpressions.practice.stream;

import java.util.ArrayList;
import java.util.List;

public class JavaWithoutStream {
    private static List<Product> products = new ArrayList<Product>();

    public static void main(String[] args) {
        products.add(new Product(1, "Hp", 1000));
        products.add(new Product(2, "Dell ", 2500));
        products.add(new Product(3, "Lenevo ", 2400));
        products.add(new Product(4, "Sony ", 3500));
        withoutStream();
    }

    private static void withoutStream() {
        List<Float> priceList = new ArrayList<Float>();
        for (Product p : products) {
            if (p.getPrice() > 2000) {
                priceList.add(p.getPrice());
            }
        }
        for (float price : priceList) {
            System.out.println(price);
        }
    }
}
