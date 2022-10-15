package ru.itmo.homeworks.hw7.school.fam;

public class Partaker extends Subject {

    private String lessonName;

    public Partaker (String name, int age, String lessonName) {
        super(name, age);
        if (lessonName.length() < 3) throw new IllegalArgumentException("lessonName должно быть минимум 3 бквы");
        this.lessonName = lessonName;
    }
    public String getLessonName() {
        return this.lessonName;
    }
}
