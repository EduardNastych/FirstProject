//TreeSet
package Collection.Set;

import java.util.TreeSet;

public class Count {
    public static void main(String[] args) {
        TreeSet <Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);

        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.headSet(3));
        System.out.println(treeSet.tailSet(3));
        System.out.println(treeSet.subSet(2,5));
    }
}



