package AccessModifier;

public class Employee {
    int id;
    String surname;
    int age;
    int salary;
    String department;

    int UpSalary(int salary) {
        int result = salary * 2;
        return result;
    }
}
    class EmployeeTest {
        public static void main(String[] args) {

            Employee Nastych = new Employee();
            Employee Melnyk = new Employee();

            Nastych.id = 1;
            Nastych.surname = ("Nastych");
            Nastych.age = 20;
            Nastych.salary = 5000;
            Nastych.department = ("QA");

            Melnyk.id = 1;
            Melnyk.surname = ("Nastych");
            Melnyk.age = 20;
            Melnyk.salary = 4000;
            Melnyk.department = ("QA");

            int SalaryUpEduard = Nastych.UpSalary(Nastych.salary);
            int SalaryUpOlena = Melnyk.UpSalary(Melnyk.salary);
            System.out.println(SalaryUpEduard);
            System.out.println(SalaryUpOlena);
        }
    }
