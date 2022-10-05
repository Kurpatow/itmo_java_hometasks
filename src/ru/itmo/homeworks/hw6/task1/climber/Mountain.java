package ru.itmo.homeworks.hw6.task1.climber;

public class Mountain {
    private String name;
    private String country;
    private double height;

    public Mountain(String name, String country, double height) {
        setName(name);
        setCountry(country);
        setHeight(height);
    }
    public String getName() {
        return name;
    }
    private void setName(String name) {
        if (name.length() < 4) throw new IllegalArgumentException("В наименовании горы должно быть минимум 4 буквы");
        this.name = name;
    }
    public String getCountry() {
        return country;
    }
    private void setCountry(String country) {
        if (country.length() < 4) throw new IllegalArgumentException("В наименовании страны должно быть минимум 4 буквы");
        this.country = country;
    }
    public double getHeight() {
        return height;
    }
    private void setHeight(double height) {
        if (height < 200) throw new IllegalArgumentException("Гора должна быть высотой более 200 метров");
        this.height = height;
    }
}
