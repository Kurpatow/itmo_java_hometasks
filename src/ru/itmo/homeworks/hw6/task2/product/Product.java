package ru.itmo.homeworks.hw6.task2.product;

public class Product {
    private String productName;
    private double proteins;
    private double fats;
    private double carbs;
    private double calories;

    public Product(String productName) {
        setProductName(productName);
    }
    public Product(String productName, double proteins) {
        setProductName(productName);
        setProteins(proteins);
    }
    public Product(String productName, double proteins, double fats, double carbs) {
        setProductName(productName);
        setProteins(proteins);
        setFats(fats);
        setCarbs(carbs);
    }
    public Product(String productName, double proteins, double fats, double carbs, double callories) {
        setProductName(productName);
        setProteins(proteins);
        setFats(fats);
        setCarbs(carbs);
        setCalories(callories);
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        if (productName.length() < 4) throw new IllegalArgumentException("В наименовании продукта должно быть минимум 4 буквы");
        this.productName = productName;
    }
    public double getProteins() {
        return proteins;
    }
    public void setProteins(double proteins) {
        if (proteins < 0) throw new IllegalArgumentException("Количество белков должно быть положительным!");
        this.proteins = proteins;
    }
    public double getFats() {
        return fats;
    }
    public void setFats(double fats) {
        if (fats < 0) throw new IllegalArgumentException("Количество жиров должно быть положительным!");
        this.fats = fats;
    }
    public double getCarbs() {
        return carbs;
    }
    public void setCarbs(double carbs) {
        if (carbs < 0) throw new IllegalArgumentException("Количество углеводов должно быть положительным!");
        this.carbs = carbs;
    }
    public double getCalories() {
        return calories;
    }
    public void setCalories(double calories) {
        if (calories < 0) throw new IllegalArgumentException("Количество каллорий должно быть положительным!");
        this.calories = calories;
    }
}
