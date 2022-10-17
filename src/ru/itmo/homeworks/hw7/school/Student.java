package ru.itmo.homeworks.hw7.school;

import ru.itmo.homeworks.hw7.school.fam.Partaker;

public class Student extends Partaker {

    private int lore;

    public Student(String name, int age, String lessonName, int lore) {
        super(name, age, lessonName);
        if (lore < 0) throw new IllegalArgumentException("lore должен быть больше нуля");
        this.lore = lore;
    }
    public int getLore() {
        return lore;
    }

    public void toString(int teacherInfo) {
        lore += (int) (Math.random() * teacherInfo);
    }
}
