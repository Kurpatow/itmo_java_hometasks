package ru.itmo.homeworks.hw7.school;

import ru.itmo.homeworks.hw7.school.fam.Partaker;

public class Student extends Partaker {
    public int lore;
    private double teacherInfo;
    public Student(String name, int age, String lessonName, int lore) {
        super(name, age, lessonName);
    }
    public int getLore() {
        return this.lore;
    }
    public int toStudy(int teacherInfo) {
        lore += Math.random() * teacherInfo;
        return 0;
    }
}
