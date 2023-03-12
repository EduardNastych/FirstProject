package Collection.ArrayList;
import java.util.ArrayList;
public class ArrayListMethods {
    public static void main(String[] args) {
    ArrayList <String> list = new ArrayList<>();
    list.add("Olena");
    list.add("Valentyna");
    list.add("Sofiya");
    list.add(0,"Margo");
    for(String s: list) {
        System.out.print(s + " "); }
        System.out.println();
        System.out.println(list.get(2));
        list.set(1, "Tetyana");
        System.out.println(list.get(1));
        list.remove("Margo");
        list.remove(0);
        for(String s: list) {
            System.out.print(s + " "); }
        System.out.println();
        System.out.println(list.contains("Margo"));
        System.out.println(list.contains("Sofiya"));
        System.out.println(list.toString());


        ArrayList <String> list1 = new ArrayList<>();
        list1.add("Ira");
        list1.add("Olya");
        list1.addAll(0, list);
        for(String s1: list1) {
            System.out.print(s1 + " "); }
        System.out.println();


        ArrayList <Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(3);
        list2.add(5);
        list2.add(0, 7);
        for(Integer i: list2) {
            System.out.print(i + " "); }
        System.out.println();
        System.out.println(list2.indexOf(5));
        System.out.println(list2.lastIndexOf(5));
        System.out.println(list2.size());
        list2.clear();
        System.out.println(list2.isEmpty());
}
}