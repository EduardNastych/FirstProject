package If_Ifelse;

public class Worker {
    int salary;
    int age;
    int experience;
    String name;
    String surname;

    Worker(int salary, int age, int experience, String name, String surname){
        this.salary = salary;
        this.age = age;
        this.name = name;
        this.surname = surname;


    }

}
class TestWorker {
    public static void main(String[] args) {
        Worker Vlad = new Worker(1000, 20, 1, "Vlad", "Glibov");
        Worker Glib = new Worker(2000, 20, 2, "Glib", "Vladov");

        if (Glib.salary > Vlad.salary) {
            System.out.println("Glib salary is higher than Vlad");
            if (Glib.age == Vlad.age) {
                System.out.println("Glib age is the same as Vlad");
                if (Glib.experience != Vlad.experience) {
                    System.out.println("Glib experience isn`t the same as Vlad");
                } else {
                    System.out.println("Glib experience is the same as Vlad");
                }
            } else {
                System.out.println("Glib age isn't the same as Vlad");
            }
        } else {
            System.out.println("Glib salary is lower than Vlad");
        }
    }
}


