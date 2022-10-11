package ru.itmo.homeworks.hw7.school;

import ru.itmo.homeworks.hw7.school.fam.Partaker;

public class Student extends Package {
    public int lore;
    private double teacherInfo;

    public Student(String name, int age, String lessonName, int lore) {
        super(name, lessonName);
    }
    public int getLore() {
        return this.lore;
    }
    public int study() {
        lore += Math.random() * teacherInfo;
        return 0;
    }
}
