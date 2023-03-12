public class OverrideEqualsAndtoString {
    public static void main(String[] args) {
        Car c1 = new Car("black", "V8");
        Car c2 = new Car("black", "V8");
        Car c3 = new Car("red", "V6");
        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));
        System.out.println(c1.toString());
        System.out.println(c1.hashCode());
    }
}

class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }
    public String toString(){
        return color + ", " + engine;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car c2 = (Car) obj;
            return (color.equals(c2.color)) && (engine.equals(c2.engine));
        } else {
            return false;
        }
    }
    public int hashCode(){
        return 2*color.hashCode() + 3/engine.hashCode();
    }
}


