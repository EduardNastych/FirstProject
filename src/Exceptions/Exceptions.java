package Exceptions;

public class Exceptions {
    public static void main(String[] args) {
        int [] array = {1,2,3};
        try {
            System.out.println(array[5]);
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("There is " + exception);
        }
        finally {
            System.out.println("There is an exception");
        }
    }
}
