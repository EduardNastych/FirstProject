package Comparable_Comporator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable<Employee> {
    String name;
    String surname;
    int salary;

    Employee(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public String toString() {
        return "{Employee name is " + name + ", surname is " + surname + ", salary is " + salary + "$.}";
    }

    @Override
    public int compareTo(Employee e) {
/*        if (this.salary==e.salary){
            return 0;
        }
        else if (this.salary<e.salary){
            return -1;
        }
        else return 1;*/ //method 1

        /*return this.salary-e.salary;*/ //method 2

        /*return this.salary.compareTo(e.salary); */ //method3

        int result = this.name.compareTo(e.name);
        if (result == 0) {
            return this.surname.compareTo(e.surname);
        }
        return result; //method 4
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee emp1 = new Employee("Oleg", "Symonenko", 30000);
        Employee emp2 = new Employee("Oleg", "Mykytenko", 18000);
        Employee emp3 = new Employee("Olga", "Nesterenko", 45000);
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        Collections.sort(employeeList, new salaryComporator());
        System.out.println(employeeList);
    }
}

class salaryComporator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.salary - emp2.salary;
    }
}