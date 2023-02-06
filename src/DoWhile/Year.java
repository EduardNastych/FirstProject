package DoWhile;

public class Year {
    static void Year() {
        int year = 1;
        do {
            System.out.println("DoWhile.Year: " + year);
            year++;
            if (year == 2020) {
                break;
            }

        }
        while (year <= 2022);
    }

    public static void main(String[] args) {
        Year();
    }
}
