public class ForEach {
    public static void main (String [] args) {
        int [] a = {1, 7, 8, 9};
        for(int b: a) {
            System.out.print(b + " ");
        }
        System.out.println();
        }
    }
    class ForEach1 {
        public static void main(String[] args) {
            String [] name = {"Glib", "Kateryna", "Marko", "Oleg"};
            String [] feature = {"lazy", "smart", "dreamer"};
            for(String s1: name) {
                for(String s2: feature)
                System.out.println(s1 + " " + s2);
            }
        }
    }
    class ForEach2 {
        public static void main(String[] args) {
            int [][] e = {{1,4,6}, {2,3,7}, {5,8,0}};
            for(int [] f: e) {
                for(int g: f) {
                    System.out.print(g + " ");
                }
            }
        }
    }


