package NestedClasses.InnerClass;

public class PersonInfo {
    String name;
    String surname;
    Age age;
    public PersonInfo(String name, String surname/*, int age*/) {
        this.name = name;
        this.surname = surname;
/*        this.age = this.new Age(age);*/
    }
    public void setAge(Age age){
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person info: {" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
    public class Age{
        int age;
        public Age(int age) {
            this.age = age;
        }
        @Override
        public String toString() {
            return "Age: {" +
                    "age=" + age +
                    '}';
        }
    }
}

class Test{
    public static void main(String[] args) {
/*        PersonInfo personInfo = new PersonInfo("Eduard", "Nastych", 20);
        System.out.println(personInfo);*/

        PersonInfo personInfo = new PersonInfo("Eduard", "Nastych");
        PersonInfo.Age age = personInfo.new Age(20);
        personInfo.setAge(age);
        System.out.println(personInfo);

    }
}

