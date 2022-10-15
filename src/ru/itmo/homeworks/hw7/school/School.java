package ru.itmo.homeworks.hw7.school;

public class School {
    private final String name;
    public Director director;
    public int maxTeachers, maxStudents;
    public int numTeachers = 0, numStudents = 0;
    public Teacher[] teachers;
    public Student[] students;

    public School(String name, Director director, int maxStudents, int maxTeachers) {
        this.name = name;
        setDirector(director);
        setMaxStudents(maxStudents);
        setMaxTeachers(maxTeachers);
        students = new Student[maxStudents];
        teachers = new Teacher[maxTeachers];

    }
    public String getName() {
        return this.name;
    }

    public Director getDirector() {
        return this.director;
    }
    public void setDirector(Director director) {
        this.director = director;
    }

    public void setMaxTeachers(int maxTeachers) {
        if (maxTeachers < 1) throw new IllegalArgumentException("Ошибка! В школе должен быть минимум один учитель");
    }
    public void setMaxStudents(int maxStudents) {
        if (maxStudents < 1) throw  new IllegalArgumentException("Ошибка! В школе должен быть мимнум один ученик");
    }
    public Student[] getStudents() {
        return students;
    }

    public void addTeacher(Teacher teacher) {
        if (numTeachers < maxTeachers) {
            teachers[numTeachers] = teacher;
            System.out.printf
                    ("Учитель %s принят на работу в школу %s%n", teacher.getName(), this.name);
            numTeachers ++;
        } else {
            System.out.printf("Учитель %s не принят на работу в школу %s. В школе нет мест%n", teacher.getName(), this.name);
        }
    }
    public void addStudent(Student student) {
        if (numStudents < maxStudents) {
            students[numStudents] = student;
            System.out.printf
                    ("Ученик %s принят в школу %s%n", student.getName(), this.name);
            numStudents++;
        } else {
            System.out.printf
                    ("Ученик %s не принят в школу %s. В школе нет мест%n", student.getName(), this.name);
        }
    }

    public void startStudy() {
        director.startLesson();
        for (Teacher teacher : teachers) {
            if (teacher == null) break;
                for (Student student : students) {
                    if (student == null) break;
                    if (teacher.getLessonName().equals(student.getLessonName)) {
                        teacher.teach(student);
                    }
                    director.finishLesson();
                }
        }
    }
}
