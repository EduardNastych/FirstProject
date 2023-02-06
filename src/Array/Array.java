package Array;

public class Array {
    public static void main(String[] args) {
        String[] array1;

        array1 = new String[3];

        array1[0] = ("Rusni");
        array1[1] = ("Pyzda");
        array1[2] = ("!");


        System.out.print(array1[0]);
        System.out.print(array1[1]);
        System.out.println(array1[2]);

        String array[];
        array = new String[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = "pryvit" + i;
            System.out.println(array[i]);

        }
        int [][] abc;
        abc = new int[3][];

        abc[0]= new int[2];
        abc[1]= new int[1];
        abc[2]= new int[4];

        for(int i = 0; i<abc.length; i++) {
            for(int j=0; j<abc[i].length; j++) {
                abc[i][j]= j*2;
                System.out.println(abc[i][j]);
            }
        }
    }

}
