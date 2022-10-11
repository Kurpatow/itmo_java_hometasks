package ru.itmo.homeworks.hw7.school;

import ru.itmo.homeworks.hw7.school.fam.Partaker;

public class Teacher extends Partaker {
    public int teacherInfo;


    public Teacher(String name, int age, String lessonName, int teacherInfo) {
        super(name, age, lessonName);
    }
    public void Teacher (Student student){
        if (student.getLessonName().equals(this.getLessonName())) {
            System.out.println("Учитель %s обучет ученика %s. Название урока - %s",
                    this.getName(), student.getName(), this.getLessonName());

            System.out.println("Знания до урока - %d" , student.getLore());
            student.study(this.teacherInfo);

            System.out.println("Знания после урока - %d", student.getLore());
        }
    }
}
