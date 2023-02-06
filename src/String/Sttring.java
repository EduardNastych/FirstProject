package String;

public class Sttring {
    public static void main(String[] args) {
        String Lyrics = ("Me and my girl, we got this relationship, I love her so bad, but she treats me like shit, " +
                "On lock-down like a penitentiary, She spreads her loving all over, And when she gets home, there's none left for me.");
        String L = Lyrics.toUpperCase();
        char c1;
        char c2;
        for (int i = 0; i < Lyrics.length(); i++) {
            c1 = Lyrics.charAt(i);
            c2 = L.charAt(i);
            if (c1 != ',' && c1 != ' ' && c1 != '-' && c1 != '\'' && c1 != '.' && c1 == c2) {
            System.out.println();
            System.out.print(c1);
            continue;
        }
        System.out.print(c1);
    }
        System.out.println();
    }
}
