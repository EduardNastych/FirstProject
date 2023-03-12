package Collection.ArrayList;

import java.util.*;

public class ArrayListColections {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";
        String s5 = "E";
        ArrayList<String> list = new ArrayList<>();
        list.add(s4);
        list.add(s2);
        list.add(s5);
        list.add(s1);
        list.add(s3);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        ArrayList<String> list1 = list;
        ArrayList<String> list2 = new ArrayList<>();
        list2.add(s4);
        list2.add(s2);
        list2.add(s5);
        list2.add(s1);
        list2.add(s3);

        System.out.println(list1.equals(list));
        System.out.println(list2.equals(list));
    }
}
