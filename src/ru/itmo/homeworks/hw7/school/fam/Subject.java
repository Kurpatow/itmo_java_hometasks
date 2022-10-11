package ru.itmo.homeworks.hw7.school.fam;

public class Subject {
    public String name;
    public int age;

    public Subject(String name, int age) {
        if (age < 0) throw new ArithmeticException("Возраст не может быть меньше нуля");
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return  this.age;
    }
}
