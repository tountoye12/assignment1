import edu.model.Product;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class ProductMgmtApp {


    public static void main(String[] args) {

        List<Product> products = List.of(
                new Product(3128874119l, "Banana", LocalDate.now(), 124, 0.55),
                new Product(2927458265l, "Apple", LocalDate.now(), 18, 1.09),
                new Product(9189927460l, "Carrot", LocalDate.now(), 89, 2.99)
        );

        printProducts(products);
    }

    private static void printProducts( List<Product> products) {
                products.stream()
                        .sorted((Product p1, Product p2) -> p1.getName().compareTo(p2.getName()))
                .forEach(System.out::println);


//        var ret = products.stream()
//                .sorted((Product p1, Product p2) -> p1.getName().compareTo(p2.getName()))
//                .toList();
//        System.out.println(ret);
    }
}
