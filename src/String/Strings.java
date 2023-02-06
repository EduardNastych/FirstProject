package String;

public class Strings {
    public static void main(String[] args) {
        String q = new String("QwertyQwertyRR");
        String q1 = ("    lol   ");
        String q2 = ("Eduard");
        String q22 = ("Eduard");
        String q222 = new String ("Eduard");
        String q2222 = ("eduard");
        String q3 = ("Nastych");

        int a = q.length();
        System.out.println(a);

        char b = q.charAt(2);
        System.out.println(b);

        int c = q.indexOf('R');
        int d = q.indexOf("RR");
        int e = q.indexOf('w', 2);
        int f = q.indexOf("we", 2);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        boolean g = q.startsWith("Qw");
        boolean h = q.startsWith("Qw", 6);
        boolean i = q.endsWith("Qw");
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);

        String j = q.substring(6);
        String k = q.substring(6, 12);
        System.out.println(j);
        System.out.println(k);

        String l = q1.trim();
        System.out.println(l);

        String m = q2.concat(q3);
        System.out.println(m);
        System.out.println(q2 + " " + q3);

        String n = q.replace('Q', 'A');
        String o = q.replace("Qwerty", "LOL");
        System.out.println(n);
        System.out.println(o);

        String p = q.toLowerCase();
        String r = q1.toUpperCase();
        System.out.println(p);
        System.out.println(r);

        boolean s = q.contains("Qwerty");
        boolean t = q.contains("qwerty");
        System.out.println(s);
        System.out.println(t);

        boolean u = (q2 == q222);
        boolean v = (q2 != q22);
        boolean w = q2.equals(q22);
        boolean x = q2.equalsIgnoreCase(q2222);
        System.out.println(u);
        System.out.println(v);
        System.out.println(w);
        System.out.println(x);

        int y = 1;
        double y1 = 1.5;
        String y2 = ("0");
        String y3 = ("0.5");
        String y4 = String.valueOf(y);
        String y5 = String.valueOf(y1);
        int y6 = Integer.parseInt(y2);
        double y7 = Double.parseDouble(y3);
        System.out.println(y4);
        System.out.println(y5);
        System.out.println(y6);
        System.out.println(y7);


































    }
}
