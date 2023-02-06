public class Initializer {
    public static void main(String[] args) {
       Automobile a = new Toyota();
    }
}

class Automobile {
    Automobile (){System.out.println("constructor by automobile");}
    static {System.out.println("static initializer block by automobile");}
    {System.out.println("non-static initializer block by automobile");}
}

class Sedan extends Automobile{
    Sedan (){System.out.println("constructor by sedan");}
    static {System.out.println("static initializer block by sedan");}
    {System.out.println("non-static initializer block by automobile");}
}

class Toyota extends Sedan{
    Toyota (){System.out.println("constructor by toyota");}
    static {System.out.println("static initializer block by toyota");}
    {System.out.println("non-static initializer block by toyota");}
}
