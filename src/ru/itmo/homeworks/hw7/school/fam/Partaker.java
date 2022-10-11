package ru.itmo.homeworks.hw7.school.fam;

public class Partaker {
    public String lessonName;
    public Partaker (String name, int age, String lessonName) {
        super(name, age);
    }
    public String getLessonName() {
        return this.lessonName;
    }
}
