package ArrayList;

import java.util.Arrays;

public class ArrayListMethods2 {
    public static void main(String[] args) {

    int [] a = {1, 2 , 3, 4};
    int [] b = {1, 2, 3, 4, 5};

    System.out.println(Arrays.compare(b, a));
    System.out.println(Arrays.mismatch(a, b));
    }
}
