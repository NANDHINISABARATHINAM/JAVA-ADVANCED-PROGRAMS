class Bank {
    private int balance = 10000;

    void deposit() {
        balance = balance + 2000;
        System.out.println("deposited "+balance);
    }

    class Gpay {
        void trans() {
            int transferamount = 1000;
            balance = balance - transferamount;
            System.out.println("transfered "+balance);
        }
    }

    void NetBanking(){
        class CashBack{
            void paymentOption(){
                System.out.println("congrats");
            }
        }
        CashBack ob=new CashBack();
        ob.paymentOption();
    }
}

public class Methodlocalinnerclass {
    public static void main(String[] args) {
        Bank ob=new Bank();
        ob.deposit();
        ob.NetBanking();
        //Bank.Gpay obj=new Bank().new Gpay();
        Bank.Gpay obj=ob.new Gpay();
        obj.trans();
    }
}
