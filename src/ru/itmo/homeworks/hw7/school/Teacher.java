package ru.itmo.homeworks.hw7.school;

import ru.itmo.homeworks.hw7.school.fam.Partaker;

public class Teacher extends Partaker {

    public int teacherInfo;

    public Teacher(String name, int age, String lessonName, int teacherInfo) {
        super(name, age, lessonName);
        if (teacherInfo < 0) throw new IllegalArgumentException("teacherInfo должен быть больше нуля");
        this.teacherInfo = teacherInfo;
        this.name = name;
        this.age = age;
        this.lessonName = lessonName;
    }

    public void teach (Student student){
        if (student.getLessonName().equals(this.getLessonName())) {
            System.out.printf("Учитель %s обучет ученика %s. Название урока - %s%n",
                    this.getName(),
                    student.getName(),
                    this.getLessonName());

            System.out.printf("Знания до урока - %d%n", student.getLore());
            student.toStudy(this.teacherInfo);
            System.out.printf("Знания после урока - %d%n", student.getLore());
        }
    }
}
