package ru.itmo.homeworks.hw6.task2.product;

public class MyBasket {
    private double maxProtein = 80;
    private double maxFats = 70;
    private double maxCarbs = 900;
    private double maxCalories = 600;

    private int productsCounter = 0;

    private Product[] myProducts = new Product[4];

    public void addProduct(Product product) {
        if (product.getProteins() > maxProtein) {
            System.out.println("Продукт " + product.getProductName() + " не подходит. Превышен лимит белка");
            return;
        }
        if (product.getFats() > maxFats) {
            System.out.println("Продукт " + product.getProductName() + " не подходит. Превышен лимит жира");
            return;
        }
        if (product.getCarbs() > maxCarbs) {
            System.out.println("Продукт " + product.getProductName() + " не подходит. Превышен лимит углеводов");
            return;
        }
        if (product.getCalories() > maxCalories) {
            System.out.println("Продукт " + product.getProductName() + " не подходит. Превышен лимит каллорий");
            return;
        }
        if (product.getCalories() == 0 && product.getCarbs() == 0 && product.getFats() == 0 && product.getProteins() == 0) {
            System.out.println("Продукт " + product.getProductName() + " не подходит. Состав не известен");
            return;
        }
        myProducts[productsCounter] = product;
        productsCounter++;
    }
    public void printProducts() {
        System.out.println("Список продуктов: ");
        for(Product product: myProducts) {
            if (product == null) continue;
            System.out.println(product.getProductName());
        }
    }
}
