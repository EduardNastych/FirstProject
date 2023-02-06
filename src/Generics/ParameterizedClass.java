package Generics;

public class ParameterizedClass {
    public static void main(String[] args)  {
        Info <String> info1 = new Info<>("Hello!");
        String s = info1.getValue();
        System.out.println(info1);

        Info <Integer> info2 = new Info<>(1);
        Integer i = info2.getValue();
        System.out.println(info2);
    }
}

class Info <T>{
    private T value;
    public Info(T value){
        this.value = value;
    }
    public String toString(){
        return "[(" + value + ")]";
    }
    public T getValue(){
        return value;
    }
}
