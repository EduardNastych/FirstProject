package Switch;

public class Month {
    static int Month;

    int showMonth(int Month) {
        this.Month = Month;
        return Month;
    }

    public static void main(String[] args) {
        Month = 31;
        switch (Month) {
            case 31:
                System.out.println("January, March, May, July, August, October, December");
                break;
            case 30:
                System.out.println("April, June, September, November");
                break;
            case 28:
                System.out.println("February");
                break;
            default:
                System.out.println("Wrong month");
        }
    }
}
