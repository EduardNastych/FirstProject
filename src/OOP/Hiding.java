package OOP;

public class Hiding {
    public static void main(String[] args) {
        Father Gregor = new Father();
        Gregor.age();
        System.out.println(Gregor.amount);
        Family Black = new Family();
        Black.age();
        System.out.println(Black.amount);
    }
}

class Family {
    int amount = 10;

    public static void age(){
        System.out.println("Their age is unknown.");
    };
}
class Father extends Family {
    int amount = super.amount - 8;
    public static void age(){
        System.out.println("They are about 40.");
    }
}