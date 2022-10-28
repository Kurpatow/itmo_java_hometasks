package ru.itmo.homeworks.hw14.task2;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String company;
    private int salary;
    private int age;

    // TODO: добавить конструктор, необходимы геттеры и сеттеры


    // TODO: дописать реализацию метода для создания списка из объектов класса Employee.
    //  Объекты Employee создавать с рандомными значениями. Возраст от 21 до 60 и не забудьте про зп.
    //  num - количество объектов в списке
    public static List<Employee> employeeGenerator(int num) {
        String[] names = {"Mike", "Tom", "Alex", "John", "Peter", "Jack", "Charlie", "Max", "Jenifer", "Linda", "Elizabeth"}; // массив с именами
        String[] companies = {"Microsoft", "IBM", "Google", "General Electric", "Siemens", "Samsung", "Apple"}; // массив с названиями компаний

        ArrayList<Employee> employees = new ArrayList<>();

        // создание объектов, наполнение списка

        return employees;
    }
}
