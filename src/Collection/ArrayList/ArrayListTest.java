package Collection.ArrayList;

import java.util.ArrayList;
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(1);
        a.add(1.25);
        a.add('c');
        a.add(true);
        a.add("hello");
        Car c = new Car();
        a.add(c);
        Flower rose = new Flower();
        a.add(rose);
    }
}
class Car{}
class Flower{}
