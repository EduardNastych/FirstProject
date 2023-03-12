package NestedClasses.AnomymousClasses;

public class Age {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        countAge countAge = new countAge() {
            @Override
            public int doCount(int a, int b) {
                return a + b;
            }
        };
        countAge countAge1 = new countAge() {
            @Override
            public int doCount(int a, int b) {
                return a*b;
            }
        };
        System.out.println(countAge.doCount(a, b));
        System.out.println(countAge1.doCount(a, b));
    }
}
interface countAge{
int doCount(int a, int b);
}
