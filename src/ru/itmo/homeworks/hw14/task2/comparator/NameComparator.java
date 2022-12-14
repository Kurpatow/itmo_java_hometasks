package ru.itmo.homeworks.hw14.task2.comparator;

import ru.itmo.homeworks.hw14.task2.Employee;
import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
