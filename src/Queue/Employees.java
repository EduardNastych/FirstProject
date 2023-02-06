//Queue
package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Employees {
    public static void main(String[] args) {
        Queue <String> employees = new LinkedList<>();
        employees.add("Nastych");
        employees.add("Melnyk");
        employees.add("Kokhan");
        employees.offer("Semkova");

        System.out.println(employees.remove());
        System.out.println(employees.element());
        System.out.println(employees.remove());
        System.out.println(employees.element());
        System.out.println(employees.remove());
        System.out.println(employees.element());
        System.out.println(employees.remove());
        System.out.println(employees.peek());
        System.out.println(employees.poll());
        System.out.println(employees.peek());

    }
}
