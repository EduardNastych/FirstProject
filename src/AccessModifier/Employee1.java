package AccessModifier;

public class Employee1 {
    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    Employee1(int id) {
        id = 1;
    }

    public Employee1(String surname) {
        surname = "Nastych";
    }

    private Employee1(double salary) {
        salary = 5000;
    }

    public void showid(int id) {
        System.out.println(1);
    }

    public void showsurname(String surname) {
        System.out.println("Nastych");
    }

    public void showsalary(double salary) {
        System.out.println(5000);
    }
class Employee1Test {
        Employee1 idshow = new Employee1(2);
        Employee1 surnameshow = new Employee1("Omelchenko");
        Employee1 salaryshow = new Employee1(5000.0);
    }
}









