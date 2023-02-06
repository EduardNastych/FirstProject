//HashSet
package Set;

import java.util.HashSet;

public class Bachelor {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Katya");
        set.add("Sasha M");
        set.add("Sasha P");
        set.add("Maryna");
        set.add("Yulia");
        set.add("Varley");
        set.add("Alina");
        set.add("Liza");

        set.remove("Alina");
        set.remove("Sasha P");
        set.remove("Sasha M");
        set.remove("Katya");

        System.out.println(set.size());

        System.out.println(set.contains("Katya"));

        System.out.println(set.isEmpty());

        HashSet <Integer> hashSet1 = new HashSet<>();
        hashSet1.add(1);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(4);

        HashSet <Integer> hashSet2 = new HashSet<>();
        hashSet2.add(3);
        hashSet2.add(4);
        hashSet2.add(5);
        hashSet2.add(6);

        HashSet <Integer> union = new HashSet<>(hashSet1);
        union.addAll(hashSet2);
        System.out.println(union);

        HashSet <Integer> intersect = new HashSet<>(hashSet1);
        intersect.retainAll(hashSet2);
        System.out.println(intersect);

        HashSet <Integer> subtract = new HashSet<>(hashSet1);
        intersect.removeAll(hashSet2);
        System.out.println(subtract);
    }
}
