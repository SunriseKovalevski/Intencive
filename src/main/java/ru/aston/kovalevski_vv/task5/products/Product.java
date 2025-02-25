package ru.aston.kovalevski_vv.task5.products;

public class Product {
    private String name;
    private Category category;
    private Double price;

    public Product(String name, Category category, Double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public Double getPrice() {
        return price;
    }
}

enum Category {
    DAIRY,
    MEAT,
    VEGETABLES,
    FRUITS
}
