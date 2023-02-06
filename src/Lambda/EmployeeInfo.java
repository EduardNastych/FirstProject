package Lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeInfo {
    void printEmployee(Employee employee) {
        System.out.println("Name of employee: " + employee.name + ", department: " + employee.department + ", employee`s salary: " + employee.salary + ".");
    }

    void employeeFiltering(ArrayList<Employee> list, Predicate<Employee> t) {
        for (Employee e : list) {
            if (t.test(e)) {
                printEmployee(e);
            }
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Vlad", "IT", 6500);
        Employee emp2 = new Employee("Roman", "Marketing", 3500);
        Employee emp3 = new Employee("Eugene", "PR", 4650);
        Employee emp4 = new Employee("John", "IT", 5000);
        Employee emp5 = new Employee("Katya", "PR", 3800);

        ArrayList<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);

        EmployeeInfo employeeInfo = new EmployeeInfo();
        employeeInfo.employeeFiltering(list, e -> e.department == "IT" && e.salary > 2000);
        System.out.println("------------------------------------------------------------------------------------------");
        employeeInfo.employeeFiltering(list, e -> e.name.startsWith("E") && e.salary != 450);
        System.out.println("------------------------------------------------------------------------------------------");
        employeeInfo.employeeFiltering(list, e -> e.name == e.department);
    }
}
