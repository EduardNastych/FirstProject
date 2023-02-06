public class StringBuilder {
    public static void main(String[] args) {
        java.lang.StringBuilder q = new java.lang.StringBuilder("1234");
        java.lang.StringBuilder q1 = q.append("567");
        java.lang.StringBuilder q2 = q.insert(0, 0);
        System.out.println(q2);
        java.lang.StringBuilder q3 = q.delete(0, 0);
        java.lang.StringBuilder q4 = q.deleteCharAt(7);
        System.out.println(q4);
        java.lang.StringBuilder q5 = q.replace (0, 7, "123456");
        System.out.println(q5);
        java.lang.StringBuilder q6 = q.reverse();
        System.out.println(q6);
        int q7 = q.capacity();
        System.out.println(q7);

    }
}
