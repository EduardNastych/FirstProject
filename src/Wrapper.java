import java.util.ArrayList;

public class Wrapper {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(3);
        list.add(-8);

        //Autoboxing
        int a =list.get(0);
        System.out.println(a);

        //Unboxing
        Number b = new Integer(5);
        int c = (Integer) b;

        String s1 = "27";
        int i1 = Integer.parseInt(s1);
        System.out.println(i1);

        Integer d = Integer.valueOf(10);
        Integer e = Integer.valueOf(s1);
        System.out.println(d);
        System.out.println(e);
    }
}
