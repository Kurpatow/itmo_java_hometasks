package ru.itmo.homeworks.hw7.school;

public class School {
    private final String name;
    private Director director;
    private int maxTeachers, maxStudents;
    private int numTeachers = 0, numStudents = 0;
    private final Teacher[] teachers;
    private final Student[] students;

    public School(String name, Director director, int maxStudents, int maxTeachers) {
        if (name.length() < 1) throw new IllegalArgumentException("Наименование школы должно содержать минимум один символ");
        this.name = name;
        setDirector(director);
        setMaxTeachers(maxTeachers);
        setMaxStudents(maxStudents);
        teachers = new Teacher[maxTeachers];
        students = new Student[maxStudents];
    }
    public void setDirector(Director director) {
        this.director = director;
    }

    public void setMaxTeachers(int maxTeachers) {
        if (maxTeachers < 1) throw new IllegalArgumentException("Ошибка! В школе должен быть минимум один учитель");
        this.maxTeachers = maxTeachers;
    }
    public void setMaxStudents(int maxStudents) {
        if (maxStudents < 1) throw new IllegalArgumentException("Ошибка! В школе должен быть мимнум один ученик");
        this.maxStudents = maxStudents;
    }

    public Student[] getStudents() {return students;}

    public void addTeacher(Teacher teacher) {
        if (numTeachers < maxTeachers) {
            teachers[numTeachers] = teacher;
            System.out.printf
                    ("\n" + "Учитель %s принят на работу в школу %s" + "\n", teacher.getName(), this.name);
            numTeachers ++;
        } else {
            System.out.printf
                    ("\n" + "Учитель %s НЕ принят на работу в школу -  %s. Причина: В школе нет мест" + "\n", teacher.getName(), this.name);
        }
    }
    public void addStudent(Student student) {
        if (numStudents < maxStudents) {
            students[numStudents] = student;
            System.out.printf
                    ("\n" + "Ученик %s принят в школу %s" + "\n" , student.getName(), this.name);
            numStudents++;
        } else {
            System.out.printf
                    ("\n" + "Ученик %s НЕ принят в школу -  %s. Причина: В школе нет мест" + "\n", student.getName(), this.name);
        }
    }
    public void startStudy() {
        director.startLesson();
        for (Teacher teacher : teachers) {
            if (teacher == null) break;
                for (Student student : students) {
                    if (student == null) break;
                    if (teacher.getLessonName().equals(student.getLessonName())) {
                        teacher.teach(student);
                    }
                }
        }
        director.finishLesson();
    }
}
