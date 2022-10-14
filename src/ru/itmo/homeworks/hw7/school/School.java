package ru.itmo.homeworks.hw7.school;

public class School {
    public String name;
    public int director;
    private int maxTeachers, maxStudents;
    private int numTeachers = 0, numStudents = 0;
    public Teacher[] teachers;
    public Student[] student;

    public void addTeacher(Teacher teacher) {
    }
    public void addStudent(Student student) {
    }

    public School(String name, int director, int maxStudents, int maxTeachers) {
        setDirector(director);
        setMaxStudents(maxStudents);
        setMaxTeachers(maxTeachers);
        student = new Student[maxStudents];
        teachers = new Teacher[maxTeachers];
    }
    public String getName() {
        return this.name;
    }
    public int getDirector() {
        return this.director;
    }
    public void setMaxTeachers(int maxTeachers) {
        this.maxTeachers = maxTeachers;
    }
    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }
    public void setDirector(int director) {
        this.director = director;
    }
    public Student[] getStudents() {
        return student;
    }

    public void startStudy() {
        director.startLessons();
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
