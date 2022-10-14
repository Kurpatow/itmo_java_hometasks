package ru.itmo.homeworks.hw7;

import ru.itmo.homeworks.hw7.school.Student;
import ru.itmo.homeworks.hw7.school.School;
import ru.itmo.homeworks.hw7.school.Director;
import ru.itmo.homeworks.hw7.school.Teacher;

import java.util.Arrays;

public class Main {

    public static String[] classes = {"Алгебра", "Геометрия", "Физика", "История"};

    public static void main(String[] args) {
        Director director = new Director("Татьяна Николаевна", 45);
        School school = new School("Школа 495", director, 8, 4);
        Teacher teacher1 = new Teacher("Наталья Игоревна", 39, "Алгебра", 90);
        Teacher teacher2 = new Teacher("Ирина Юрьевна", 44, "Геометрия", 88);
        Teacher teacher3 = new Teacher("Михаил Васильевич", 34, "Физика", 86);
        Teacher teacher4 = new Teacher("Иван Викторович", 32, "История", 99);

        school.addTeacher();
        school.addTeacher();
        school.addTeacher();
        school.addTeacher();

        for (int i = 0; i < 10; i++) {
            Student student = new Student(String.format("Ученик %d",i + 1), (int) (6 + (Math.random() * 7)),
                    Main.classes[(int) (Math.random() * 2)], (int) (Math.random() * 30));
            school.addStudent();
        }
        System.out.println(Arrays.toString(school.getStudents()));
        school.startStudy();
    }
}
