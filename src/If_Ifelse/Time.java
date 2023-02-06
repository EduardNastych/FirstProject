package If_Ifelse;

public class Time {
    static void Time() {
         OUTER: for (int hour = 0; hour <= 6; hour++)
        {
             MIDDLE: for (int minute = 0; minute <= 59; minute++)
            {
                INNER: for (int second = 0; second <= 59; second++) {
                    if (hour > 1 && minute%10 == 0) {
                        break OUTER;
                    }
                    if (second*hour>minute) {
                        continue MIDDLE;
                    }
                    System.out.println(hour + ":" + minute + ":" + second);
                }
            }
        }
    }
    public static void main (String [] args) {
        Time();
    }
}



