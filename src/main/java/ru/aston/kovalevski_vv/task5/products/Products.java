package ru.aston.kovalevski_vv.task5.products;

/* Разделить продукты в Stream на несколько групп по категориям
   (например, молочные продукты, мясные продукты, овощи, фрукты),
   посчитать стоимость продуктов в каждой группе.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Products {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Milk",Category.DAIRY, 100.0));
        productList.add(new Product("Cheese",Category.DAIRY, 200.0));
        productList.add(new Product("Beef",Category.MEAT, 300.0));
        productList.add(new Product("Chicken",Category.MEAT, 250.0));
        productList.add(new Product("Carrot",Category.VEGETABLES, 50.0));
        productList.add(new Product("Potato",Category.VEGETABLES, 65.0));
        productList.add(new Product("Apple",Category.FRUITS, 100.0));
        productList.add(new Product("Banana",Category.FRUITS, 200.0));
        productList.add(new Product("Pineapple",Category.FRUITS, 300.0));
        productList.add(new Product("Grapefruit",Category.DAIRY, 500.0));

        Map<Category, Double> groupByCategoryWithCost = productList.stream().collect(
                Collectors.groupingBy(Product::getCategory,
                        Collectors.summingDouble(Product::getPrice)));

        groupByCategoryWithCost.forEach((category, cost) -> System.out.println(category + " " + cost));

    }
}
