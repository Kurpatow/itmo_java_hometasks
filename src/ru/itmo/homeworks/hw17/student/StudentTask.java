package ru.itmo.homeworks.hw17.student;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class StudentTask {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student(1, "Женя", Student.Gender.MALE, LocalDate.now().minusYears(10)),
                new Student(2, "Олег", Student.Gender.MALE, LocalDate.now().minusYears(7)),
                new Student(3, "Алена", Student.Gender.FEMALE, LocalDate.now().minusYears(6)),
                new Student(4, "Иван", Student.Gender.MALE, LocalDate.now().minusYears(12)),
                new Student(5, "Алексей", Student.Gender.MALE, LocalDate.now().minusYears(9)),
                new Student(6, "Петр", Student.Gender.MALE, LocalDate.now().minusYears(9)),
                new Student(7, "Иван", Student.Gender.MALE, LocalDate.now().minusYears(17)),
                new Student(8, "Петр", Student.Gender.MALE, LocalDate.now().minusYears(5)),
                new Student(9, "Алена", Student.Gender.FEMALE, LocalDate.now().minusYears(8)),
                new Student(10, "Алена", Student.Gender.FEMALE, LocalDate.now().minusYears(10)),
                new Student(11, "Григорий", Student.Gender.MALE, LocalDate.now().minusYears(7)),
                new Student(12, "Ирина", Student.Gender.FEMALE, LocalDate.now().minusYears(6))
        ));

        // TODO: Используя Stream API:
        //  1. Разделить учеников на две группы: мальчиков и девочек. Результат: Map<Student.Gender, ArrayList<Student>>
        //  2. Найти средний возраст учеников
        //  3. Найти самого младшего ученика
        //  4. Найти самого старшего ученика
        //  5. Собрать учеников в группы по году рождения
        //  6. Убрать учеников с одинаковыми именами, имена и дату рождения оставшихся вывести в консоль
        //  7. Отсортировать по полу, потом по дате рождения, потом по имени (в обратном порядке), собрать в список (List)
        //  8. Вывести в консоль всех учеников в возрасте от N до M лет
        //  9. Собрать в список всех учеников с именем=someName
        //  10. Собрать Map<Student.Gender, Integer>, где Student.Gender - пол, Integer - суммарный возраст учеников данного пола

        // 1. Разделить учеников на две группы: мальчиков и девочек. Результат: Map<Student.Gender, ArrayList<Student>>
        System.out.println("----------1----------");
        Map<Student.Gender, ArrayList<Student>> studentGendersMap = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGender,
                        Collectors.toCollection(ArrayList::new)));
        System.out.println(studentGendersMap);

        // 2. Найти средний возраст учеников
        System.out.println("----------2----------");
        double avgAge = students.stream()
                .mapToInt(pupil -> LocalDate.now().getYear() - pupil.getBirth().getYear())
                .average().orElse(0);
        System.out.println(avgAge);


        // 3. Найти самого младшего ученика
        System.out.println("----------3----------");
        Student youngestStudent = students.stream()
                .min(Comparator.comparingInt(s -> Period.between(s.getBirth(), LocalDate.now()).getYears())).get();
        System.out.println(youngestStudent);

        Student minAge = students.stream().max(Comparator.comparing(Student::getBirth)).orElse(null);
        System.out.println(minAge);

        // 4. Найти самого старшего ученика
        System.out.println("----------4----------");
        Student oldestStudent = students.stream()
                .max(Comparator.comparingInt(s -> Period.between(s.getBirth(), LocalDate.now()).getYears())).get();
        System.out.println(oldestStudent);

        Student maxAge = students.stream().min(Comparator.comparing(Student::getBirth)).orElse(null);
        System.out.println(maxAge);

        // 5. Собрать учеников в группы по году рождения
        System.out.println("----------5----------");
        Map<Integer, List<Student>> studentsByYears = students.stream()
                .collect(Collectors.groupingBy(
                        student -> student.getBirth().getYear()));
        System.out.println(studentsByYears);

        // 6. Убрать учеников с одинаковыми именами, имена и дату рождения оставшихся вывести в консоль
        System.out.println("----------6----------");
        Collection<Student> uniqueByName = students.stream()
                .collect(Collectors.toMap(
                        Student::getName,   // student -> student->getName();
                        Function.identity(),// student -> student
                        ((pupil, pupil2) -> pupil)
                )).values();
        uniqueByName.forEach(pupil -> System.out.println(pupil.getName() + ": " + pupil.getBirth()));

        // 7. Отсортировать по полу, потом по дате рождения, потом по имени (в обратном порядке), собрать в список (List)
        System.out.println("----------7----------");
        students.sort(
                Comparator.comparing(Student::getGender)
                        .thenComparing(Student::getBirth)
                        .thenComparing(Student::getName).reversed()
        );
        System.out.println(students);

        // 8. Вывести в консоль всех учеников в возрасте от N до M лет
        System.out.println("----------8----------");
        int N = 7, M = 10;
        System.out.println("Список студентов в возрасте от " + N + " до " + M + " лет включительно");
        students.stream().filter(
                        student -> Period.between(student.getBirth(),LocalDate.now()).getYears() > N &&
                                Period.between(student.getBirth(),LocalDate.now()).getYears() < M)
                .forEach(System.out::println);

        // 9. Собрать в список всех учеников с именем=someName
        String name = "Петр";
        List<Student> studentList = students.stream()
                .filter(student -> student.getName().equals(name))
                .collect(Collectors.toList());
        System.out.println(studentList);

        // 10. Собрать Map<Student.Gender, Integer>, где Student.Gender - пол, Integer - суммарный возраст учеников данного пола
        System.out.println("----------10----------");
        Map<Student.Gender, Integer> genderCount = students.stream()
                .collect(Collectors.groupingBy(Student::getGender,
                        Collectors.summingInt(
                                pupil -> LocalDate.now().getYear() - pupil.getBirth().getYear())));
        System.out.println(genderCount);
    }
}