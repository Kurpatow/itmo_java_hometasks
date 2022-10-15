package ru.itmo.homeworks.hw7.school;

import ru.itmo.homeworks.hw7.school.fam.Subject;

public class Director extends Subject {

    public Director(String name, int age) {
        super(name, age);
        this.name = name;
    }
    public void startLesson() {
        System.out.printf("Директор %s обьявила начало уроков%n", this.getName());
    }
    public void finishLesson() {
    System.out.printf("Директор обьявила об окончании уроков%n", this.getName());
    }
}
