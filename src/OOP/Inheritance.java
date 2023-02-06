package OOP;

public class Inheritance {}
class Animal {
    Animal() {
        System.out.println("I`m animal.");
    }

    protected final int eyes = 2;

    protected void Eat() {
        System.out.println("Animal eats.");
    }

    protected void Drink() {
        System.out.println("Animal drinks.");
    }
}

class Pet extends Animal {
    Pet(){
        System.out.println("I`m Pet and I have " + eyes + " eyes." );
    }
    String name;
    protected int tale = 1;
    protected int paw = 4;
    protected void Run(){
        System.out.println("Pet runs.");
    }
    protected void Jump(){
        System.out.println("Pet jumps.");
    }
}

class Dog extends Pet {
    Dog(String name){
        this.name = name;
        System.out.println("I`m Dog and my name is " + name + ".");
    }
    public void Play(){
        System.out.println("Dog plays.");
    };
}
class Cat extends Pet {
    Cat(String name ){
        this.name = name;
        System.out.println("I`m Cat and my name is " + name + ".");
    }
    public void Sleep(){
        System.out.println("Cat sleeps.");
    }
}
class Test {
    public static void main(String[] args) {
        Dog D = new Dog("Margo");
        System.out.println("Dog has " + D.paw + " paws.");
        Cat C = new Cat("Gosha");
        C.Sleep();
    }
}
