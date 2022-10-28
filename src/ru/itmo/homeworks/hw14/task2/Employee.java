package ru.itmo.homeworks.hw14.task2;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String company;
    private int salary;
    private int age;

    // TODO: добавить конструктор, необходимы геттеры и сеттеры
    public Employee(String name, String company, int salary, int age) {
        setName(name);
        setCompany(company);
        setSalary(salary);
        setAge(age);

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Сотрудники [ " + "Имя: " + name + ", " +
                "Компания: " + company + ", " +
                "Зарплата: " + salary + ", " +
                "Возраст: " + age + "." + " ]";
    }

    // TODO: дописать реализацию метода для создания списка из объектов класса Employee.
    //  Объекты Employee создавать с рандомными значениями. Возраст от 21 до 60 и не забудьте про зп.
    //  num - количество объектов в списке
    public static List<Employee> employeeGenerator(int num) {
        String[] names = {"Mike", "Tom", "Alex", "John", "Peter", "Jack", "Charlie", "Max", "Jenifer", "Linda", "Elizabeth"}; // массив с именами
        String[] companies = {"Microsoft", "IBM", "Google", "General Electric", "Siemens", "Samsung", "Apple"}; // массив с названиями компаний
        int minAge = 21;
        int maxAge = 60;
        int minSalary = 50_000;
        int maxSalary = 500_000;
        int age, salary, nameIndex, companyIndex;

        ArrayList<Employee> employees = new ArrayList<>();

        // создание объектов, наполнение списка
        for (int i = 0; i < num; i++) {
            age = (int) (minAge + Math.random() * (maxAge - minAge));
            salary = (int) (minSalary + Math.random() * (maxSalary - minSalary));
            nameIndex = (int) (Math.random() * names.length);
            companyIndex = (int) (Math.random() * companies.length);
            employees.add(new Employee( names[nameIndex], companies[companyIndex], salary, age ));
        }
            return employees;
        }
}
