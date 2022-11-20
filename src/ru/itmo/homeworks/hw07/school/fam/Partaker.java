package ru.itmo.homeworks.hw07.school.fam;

public class Partaker extends Subject {

    private final String lessonName;

    public Partaker (String name, int age, String lessonName) {
        super(name, age);
        if (lessonName.length() < 3) throw new IllegalArgumentException("lessonName должно быть минимум 3 бквы");
        this.lessonName = lessonName;
    }
    public String getLessonName() {
        return this.lessonName;
    }
}
