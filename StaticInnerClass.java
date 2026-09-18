class Bank {
    static private int balance = 10000;

    void deposit() {
        balance = balance + 2000;
        System.out.println("deposited "+balance);
    }

    static class Gpay {
        void trans() {
            int transferamount = 1000;
            balance = balance - transferamount;
            System.out.println("transfered "+balance);
        }
    }
}

public class StaticInnerClass {
    public static void main(String[] args) {
        Bank ob=new Bank();
        ob.deposit();
        Bank.Gpay obj=new Bank.Gpay();
        obj.trans();
    }
}
