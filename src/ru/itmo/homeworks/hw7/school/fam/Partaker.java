package ru.itmo.homeworks.hw7.school.fam;

public class Partaker extends Subject {
    public String lessonName;
    public String getLessonName;

    public Partaker (String name, int age, String lessonName) {
        super(name, age);
    }
    public String getLessonName() {
        return this.lessonName;
    }
}
