package ru.itmo.homeworks.hw7.school;

public class School {
    public String name;
    public Director director;
    public Teacher[] teachers;
    public Student[] student;

    public void addTeacher() {
    }
    public void addStudent() {
    }
    public School(String name, Director director, int maxStudents, int maxTeachers) {
        setDirector(director);
        setMaxStudents(maxStudents);
        setMaxTeachers(maxTeachers);
        student = new Student[maxStudents];
        teachers = new Teacher[maxTeachers];
    }
    public String getName() {
        return this.name;
    }
    public Director getDirector() {
        return this.director;
    }
    public void setMaxTeachers(int maxTeachers) {
    }
    public void setMaxStudents(int maxStudents) {
    }
    public void setDirector(Director director) {
        this.director = director;
    }
    public Student[] getStudents() {
        return student;
    }
    public int getNumTeachers() {
        return 0;
    }
    public int getNumStudents() {
        return 0;
    }

    public void startStudy() {
        director.startLesson();
        for (Teacher teacher : teachers) {
            if (teacher == null) ;
            continue;
            for (Student student : student) {
                if (student == null) ;
                continue;
                if (teacher.getLessonName().equals(student.getLessonName)) {
                    teacher.teach(student);
                }
                director.finishLesson();
            }
        }
    }
}
