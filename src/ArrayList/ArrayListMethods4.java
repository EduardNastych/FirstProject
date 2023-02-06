package ArrayList;

import java.util.*;

public class ArrayListMethods4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Monday");
        list.add("Tuesday");
        list.add("Wednesday");
        list.add("Thursday");
        list.add("Friday");
        list.add("Saturday");
        list.add("Sunday");

        Object [] array = list.toArray();
        String [] array1 = list.toArray(new String[7]);
        for(Object s: array) {
            System.out.print(s + " ");
        }
        System.out.println();
        
        List <String> lyst = List.of("Hello", "my", "friends");
        List <String> lyst2 =List.copyOf(list);
        System.out.println(lyst);
        System.out.println(lyst2);
    }
}
