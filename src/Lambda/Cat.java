package Lambda;

public class Cat {
    String color;
    int age;
    double weight;

    Cat(String color, int age, double weight){
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public String toString(){
        return "Cat is " + color + ", its age is " + age + ", its weight is " + weight + ".";
    }

}
