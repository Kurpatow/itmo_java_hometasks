package ru.itmo.homeworks.hw7.school;

public class School {
    public String name;
    public Director director;
    public Teacher[] teachers;
    public Student[] students;
    public int maxTeachers, maxStudents;
    public int numTeachers = 0, numStudents = 0;

    public School(String name, Director director, int maxStudents, int maxTeachers) {
        setDirector(director);
        setMaxStudents(maxStudents);
        setMaxTeachers(maxTeachers);
        students = new Student[maxStudents];
        teachers = new Teacher[maxTeachers];
    }
    public void setMaxTeachers(int maxTeachers) {
        if (maxTeachers < 1) throw new IllegalArgumentException("Ошибка! В школе должен быть минимум один учитель");
        this.numTeachers = numTeachers;
    }
    public void setMaxStudents(int maxStudents) {
        if (maxStudents < 1) throw  new IllegalArgumentException("Ошибка! В школе должен быть мимнум один ученик");
    }
    public Director getDirector() {
        return this.director;
    }
    public void setDirector(Director director) {
        this.director = director;
    }

    public Student[] getStudents() {
        return students;
    }

    public void addTeacher(Teacher teacher) {
        if (numTeachers < maxTeachers) {
            teachers[numTeachers] = teacher;
            System.out.println
                    (String.format("Учитель %s принят на работу в школу %s", teacher.getName(), this.name));
            numTeachers++;
        } else {
            System.out.println(
                    String.format("Учитель %s не принят на работу в школу %s. В школе нет мест", teacher.getName(), this.name));
        }
    }
    public void addStudent(Student student) {
        if (numStudents < maxStudents) {
            students[numStudents] = student;
            System.out.println
                    (String.format("Ученик %s принят в школу %s", student.getName(), this.name));
            numStudents++;
        } else {
            System.out.println
                    (String.format("Ученик %s не принят в школу %s. В школе нет мест", student.getName(), this.name));
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
