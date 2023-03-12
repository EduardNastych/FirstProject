
package NestedClasses.StaticNestedClass;

public class PersonInfo {
    String name;
    String surname;
    Age age;
    public PersonInfo(String name, String surname, Age age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    @Override
    public String toString() {
        return "NestedClasses.StaticNestedClass{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
    void method(){
        System.out.println(Age.countOfAge);
        Age age1 = new Age(20);
        System.out.println(age1.age);
    }
    public static class Age{
        int age;
        static int countOfAge;
        public Age(int age) {
            this.age = age;
            countOfAge++;
        }
        @Override
        public String toString() {
            return "Age{" +
                    "age=" + age +
                    '}';
        }
    }
}

class Test{
    public static void main(String[] args) {
        PersonInfo.Age age = new PersonInfo.Age(20);
        System.out.println(age);

        PersonInfo personInfo = new PersonInfo("Eduard", "Nastych", age);
        System.out.println(personInfo);
    }
}
