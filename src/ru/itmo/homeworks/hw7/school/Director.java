package ru.itmo.homeworks.hw7.school;

import ru.itmo.homeworks.hw7.school.fam.Subject;

public class Director extends Subject {

    public Director(String name, int age) {
        super(name, age);
    }
    public void startLessons(){
        System.out.println(String.format("Директор %s обьявил начало уроков", this.getName()));
    }
    public void finishLesson() {
    System.out.println(String.format("Директор обьявил об окончании уроков", this.getName()));
    }
}
