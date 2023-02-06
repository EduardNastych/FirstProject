package OOP;

public class Overriding {
    public static void main(String[] args) {
        Phone a = new IPhone();
        a.a();
    }
}
class Phone {
    public void a(){
        System.out.println("It's a phone");
    }
}

class IPhone extends Phone {
    @Override
    public void a(){
        System.out.println("It's an Iphone");
    }
}
