package Exceptions;

public class MyExceptions {
    void workDay(int mood, int health) throws BadMoodException {
        if (mood <= 5) {
            throw new BadMoodException("Mood was so low: " + mood);
        }
        if (health < 10) {
            throw new BadHealthException("Health was so low: " + health);
        }
    }

    public static void main(String[] args) {
        MyExceptions exception = new MyExceptions();
        try {exception.workDay(4, 8);}
        catch (BadMoodException e){
            System.out.println("It was bad mood. You should pay attention to:  " + e);
        }
        catch (BadHealthException e){
            System.out.println("It was bad health. You should pay attention to: " + e);
        }
        finally {
            System.out.println("At least you`re alive.");
        }
    }

}

class BadMoodException extends Exception {
    BadMoodException(String message) {
        super(message);
    }

    BadMoodException() {
    }
}

class BadHealthException extends RuntimeException {
    BadHealthException(String message) {
        super(message);
    }

    BadHealthException() {
    }
}
