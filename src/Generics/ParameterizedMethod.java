package Generics;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int i = GenericMethod.getSecondElement(list);
        System.out.println(i);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        list2.add("5");

        String s = GenericMethod.getSecondElement(list2);
        System.out.println(s);

    }
}

class GenericMethod{
    public static <T> T getSecondElement(ArrayList <T> list){
        return list.get(1);
    }
}
