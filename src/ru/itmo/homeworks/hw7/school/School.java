package ru.itmo.homeworks.hw7.school;

public class School {
    public String name;
    public int director;
    private int maxTeachers, maxStudents;
    private int numTeachers = 0, numStudents = 0;
    public Teacher[] teachers;
    public Student[] students;
    private Object student;

    public School(String name, int director, int maxStudents, int maxTeachers) {
        setDirector(director);
        setMaxStudents(maxStudents);
        setMaxTeachers(maxTeachers);
        students = new Student[maxStudents];
        teachers = new Teacher[maxTeachers];
    }
    public String getName() {
        return this.name;
    }
    public int getDirector() {
        return this.director;
    }
    public void setDirector(int director) {
        this.director = director;
    }
    public Student[] getStudents() {
        return students;
    }
    public void startStudy(){
        director.startLesson();
        for (Teacher teacher: teachers) {
            if (teacher == null);
            continue;
            for (student == null);
            continue;
            if (teacher.getLessonName().equals(student.getLessonName)) {
                teacher.teach(student);
            }
        }
        director.finishLesson();
    }

    public void addTeacher(Teacher teacher1) {
    }

    public void addStudent(Student student) {
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    public void setMaxTeachers(int maxTeachers) {
        this.maxTeachers = maxTeachers;
    }

    public int getMaxStudents() {
        return maxStudents;
    }
}
