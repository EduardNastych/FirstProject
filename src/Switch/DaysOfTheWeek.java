package Switch;

import java.sql.SQLOutput;

public class DaysOfTheWeek {
    public static void main(String[] args) {
        switch (9) {
            case 1: System.out.println("It`s monday.");
                break;
            case 2: System.out.println("It`s tuesday.");
                break;
            case 3: System.out.println("It`s wednesday.");
                break;
            case 4: System.out.println("It`s thursday.");
                break;
            case 5: System.out.println("It`s friday.");
                break;
            case 6: System.out.println("It`s saturday.");
                break;
            case 7: System.out.println("It`s sunday.");
                break;
            default:
                System.out.println("It`s not a day of the week");
        }
    }
}
