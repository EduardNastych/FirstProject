package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("Monday");
        list.add("Tuesday");
        list.add("Wednesday");
        list.add("Thursday");
        list.add("Friday");
        list.add("Saturday");
        list.add("Sunday");
        System.out.println(list);

        ArrayList <String> list1 = new ArrayList<>();
        list1.add("Saturday");
        list1.add("Sunday");
        list.removeAll(list1);
        System.out.println(list);

        ArrayList <String> list2 = new ArrayList<>();
        list2.add("Wednesday");
        list2.add("Thursday");
        list2.add("Friday");
        list.retainAll(list2);
        System.out.println(list);

        boolean result = list.containsAll(list2);
        System.out.println(result);

        List <String> sublist = list.subList(0,1);
        System.out.println(sublist);
    }
}
