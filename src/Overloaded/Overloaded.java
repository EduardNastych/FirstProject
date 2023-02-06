package Overloaded;

public class Overloaded {
    int a = 0;
    int b = 1;
    int c = 2;
    int d = 3;
    int e = 4;

    int sum(int a) {
        int result = a;
        return result;
    }

    int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    int sum(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }

    int sum(int a, int b, int c, int d) {
        int result = a + b + c + d;
        return result;
    }

    int sum(int a, int b, int c, int d, int e) {
        int result = a + b + c + d + e;
        return result;
    }
}
    class OverloadedTest {
        public static void main(String[] args) {
            Overloaded t = new Overloaded();
            int sum = t.sum(0);
            int sum1 = t.sum(0, 1);
            int sum2 = t.sum(0, 1, 2);
            int sum3 = t.sum(0, 1, 2, 3);
            int sum4 = t.sum(0, 1, 2, 3, 4);
        }
    }










