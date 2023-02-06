package Lambda;

import java.util.ArrayList;
import java.util.List;

public class SomeMethodsByLambda {
    public static void main(String[] args) {
        List<String> list = List.of("Hello", "World", "!");{
/*            for(String s: list){
                System.out.println(s);
            }*/
            list.forEach(s -> System.out.println(s));
        }
        ArrayList <Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(6);
        list1.add(1);
        list1.add(7);
        list1.add(5);
        list1.add(2);
        list1.add(4);
        list1.add(8);

/*        list1.removeIf(element -> element%2==0);
        System.out.println(list1);*/

        list1.sort((x,y) -> -x.compareTo(y));
        System.out.println(list1);
    }
}
