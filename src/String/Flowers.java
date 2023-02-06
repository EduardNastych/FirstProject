package String;

public class Flowers {
    String color;
    String type;
    double weight;
    String owner;

    String description(String color, String type, double weight) {
        String result = ("It is " + type + ". " + "Its color is " + color + ". " + "Its weight is " + weight + "kg" + ".");
        return result;
    }
}
        class FlowersTest {
            public static void main (String[] args) {
                Flowers Rose = new Flowers();
                Rose.color = "red";
                Rose.type = "rose";
                Rose.weight = 0.22;
                System.out.println(Rose.description(Rose.color, Rose.type, Rose.weight));

            }
        }


