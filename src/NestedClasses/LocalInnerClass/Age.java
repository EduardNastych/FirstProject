package NestedClasses.LocalInnerClass;

public class Age {
    public static void main(String[] args) {
        Age age = new Age();
        age.getResult(20, 1);

    }
    public void getResult(int currentAge, int year){
        class CountAge{
            public int Suma(){
                return currentAge+year;
            }
            public int Riznytsa(){
                return currentAge-year;
            }
        }
        CountAge countAge = new CountAge();
        System.out.println(countAge.Suma());
        System.out.println(countAge.Riznytsa());
    }
}
