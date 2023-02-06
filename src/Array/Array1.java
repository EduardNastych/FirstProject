package Array;

import java.util.Arrays;
public class Array1 {
    public static void main(String[] args) {
        int array[] = {1, 6, 18, 1234, 0};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int index = Arrays.binarySearch(array, 6);
        System.out.print(index);
    }
}
