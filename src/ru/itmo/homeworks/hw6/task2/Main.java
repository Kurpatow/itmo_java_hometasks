package ru.itmo.homeworks.hw6.task2;

import ru.itmo.homeworks.hw6.task2.product.MyBasket;
import ru.itmo.homeworks.hw6.task2.product.Product;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Греческий йогурт", 10);
        Product product2 = new Product("Шаверма", 5, 60, 300, 1300);
        Product product3 = new Product("Жаренная картошечка", 7, 90, 60);
        Product product4 = new Product("Бишбармак");

        MyBasket myProducts = new MyBasket();
        myProducts.addProduct(product1);
        myProducts.addProduct(product2);
        myProducts.addProduct(product3);
        myProducts.addProduct(product4);
        myProducts.printProducts();
    }

}
