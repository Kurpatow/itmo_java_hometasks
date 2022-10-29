package ru.itmo.homeworks.hw14.task2.comparator;

import ru.itmo.homeworks.hw14.task2.Employee;
import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getSalary() < o2.getSalary())
            return -1;
        if (o1.getSalary() > o2.getSalary())
            return 1;
        return 0;
    }
}
