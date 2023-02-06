package Methods;

public class BankAccount {
    int BankAccount;
    String CustomerID;
    int a;
    int b;

    int UpMoney(int BankAccount, int a) {
        int result = BankAccount + a;
        return result;
    }

    int DownMoney(int BankAccount, int b) {
        int result1 = BankAccount - b;
        return result1;
    }
}

class Changes {
    public static void main (String [] args) {
        int BankAccount = 5000;
        int a = 2000;
        int b = 3000;
        BankAccount f = new BankAccount();
        int MoneyToUp = f.UpMoney(BankAccount, a);
        System.out.println(MoneyToUp);

        int MoneyToDown = f.DownMoney(BankAccount, b);
        System.out.println(MoneyToDown);

    }
}




