package OOP;

public class Abstract {
}
abstract class Worker {
    int age;
    abstract void salary();
    abstract void vacation();
}
class Doctor extends Worker implements City_liver {
    int age = 30;

    void salary() {
        System.out.println("Doctor`s salary is 20 000.");
    }

    void vacation() {
        System.out.println("Doctor have 24 days for vacation in year.");
    }
    public void city(){
        System.out.println("Live in the city.");
    }
}
    class Artist extends Worker implements City_liver,Village_liver{
        int age = 25;
        void salary() {
            System.out.println("Artist`s salary unstable.");
        }
        void vacation() {
            System.out.println("Artist have free work schedule");
        }
        public void city(){
            System.out.println("Live in the city");
        }
        public void village(){
            System.out.println("Has house in the village");
        }

        public static void main(String[] args) {
        Artist Oleg = new Artist();
        Oleg.flat();
    }
}
    class Miller extends Worker implements Village_liver{
    int age = 55;
        void salary() {
            System.out.println("We don`t have information about their salary.");
        }
        void vacation(){
            System.out.println("We don`t have information about their vacation.");
        }
        public void village(){
            System.out.println("Live in the village.");
        }

        public static void main(String[] args) {
            Village_liver Stepan = new Miller();
            Village_liver.garden();
        }
    }



interface Village_liver {
    void village();
    public static void garden(){
        System.out.println("Work in the garden.");
    }
}
interface City_liver {
    void city();
    default void flat(){
        System.out.println("Live in the flat.");
    }
    private void rent(){
        System.out.println("They pay rent for flat.");
    }
}
