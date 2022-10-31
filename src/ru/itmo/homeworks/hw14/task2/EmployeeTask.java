package ru.itmo.homeworks.hw14.task2;

import java.util.List;
import ru.itmo.homeworks.hw14.task2.comparator.AgeComparator;
import ru.itmo.homeworks.hw14.task2.comparator.CompanyComparator;
import ru.itmo.homeworks.hw14.task2.comparator.NameComparator;
import ru.itmo.homeworks.hw14.task2.comparator.SalaryComparator;

import java.util.Comparator;



public class EmployeeTask {
    public static void main(String[] args) {
        List<Employee> employeeList = Employee.employeeGenerator(50);

        Comparator<Employee> nameComparator = new NameComparator();
        Comparator<Employee> companyComparator = new CompanyComparator();
        Comparator<Employee> salaryComparator = new SalaryComparator();
        Comparator<Employee> ageComparator = new AgeComparator();

        // TODO 1: отсортировать список по имени
        System.out.println("=============== Список по имени ===============");
        employeeList.sort(nameComparator);
        System.out.println(employeeList);


        // TODO 2: отсортировать список по имени и зп
        System.out.println("=============== Список по имени и зп ===============");
        Comparator<Employee> nameSalaryComparator = nameComparator.thenComparing(salaryComparator);
        employeeList.sort(nameSalaryComparator);
        System.out.println(employeeList);


        // TODO 3: отсортировать список по имени, зарплате, возрасту и компании
        System.out.println("===============Список по имени, зарплате, возрасту и компании ===============");
        Comparator<Employee> fullComparator = nameSalaryComparator.thenComparing(ageComparator).thenComparing(companyComparator);
        employeeList.sort(fullComparator);
        System.out.println(employeeList);


    }
}
