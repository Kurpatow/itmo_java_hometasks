package ru.itmo.homeworks.hw7.school;

import ru.itmo.homeworks.hw7.school.fam.Subject;

public class Director extends Subject {

    public Director(String name, int age) {
        super(name, age);
    }
    public void startLesson() {
        System.out.printf("\n" + "Директор %s обьявила начало уроков!", this.getName());
    }
    public void finishLesson() {
    System.out.printf("\n" + "Директор обьявила об окончании уроков!", this.getName());
    }
}
