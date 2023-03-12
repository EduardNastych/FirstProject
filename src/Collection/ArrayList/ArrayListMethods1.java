package Collection.ArrayList;
import java.util.*;
public class ArrayListMethods1 {
    public static void main(String[] args) {
    StringBuilder sb1 = new StringBuilder("L");
    StringBuilder sb2 = new StringBuilder("O");
    StringBuilder sb3 = new StringBuilder("L");
    ArrayList <StringBuilder> list = new ArrayList<>();
    list.add(sb1);
    list.add(sb2);
    list.add(sb3);


    ArrayList <StringBuilder> list1 = (ArrayList<StringBuilder>) list.clone();
    ArrayList <StringBuilder> list2 = list;
        System.out.println(list1 == list);
        System.out.println(list2 == list);

        StringBuilder [] array = list.toArray(new StringBuilder[]{});
        for(StringBuilder a: array ) {
            System.out.print(a);
        }
        System.out.println();

        StringBuilder [] lyst = {sb1, sb2, sb3};
        List <StringBuilder> abc = Arrays.asList(lyst);
        System.out.println(abc);

    }
}
