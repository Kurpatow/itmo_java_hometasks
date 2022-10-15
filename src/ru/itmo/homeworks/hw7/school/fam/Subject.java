package ru.itmo.homeworks.hw7.school.fam;

public class Subject {
    private final String name;

    public Subject(String name, int age) {
        if (name.length() < 2) throw new IllegalArgumentException("Имя должно состоять минимум из двух букв");
        this.name = name;

        if (age < 0) throw new ArithmeticException("Возраст не может быть меньше нуля");
    }

    public String getName() {
        return this.name;
    }
}
