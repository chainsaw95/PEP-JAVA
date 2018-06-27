class AccountInfo{

    double balance;

    public AccountInfo(double balance) {
        this.balance = balance;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdrawAmount(int amt){


        System.out.println("withdraw amt"+amt);
        System.out.println("balance before withdraw "+this.getBalance());
        double bb=this.getBalance()-amt;
        try {
            Thread.sleep(3000);
        }
        catch (Exception e){
            System.out.println(e);
        }



        this.setBalance(bb);

        System.out.println("after withdraw"+this.getBalance());

    }


    public void depositAmount(int amt){


            System.out.println("deposit"+amt);
            System.out.println("balance"+this.getBalance());


            double bb=this.getBalance()+amt;
            try {
                Thread.sleep(4000);
            }
            catch (Exception e){
                System.out.println(e);
            }




            this.setBalance(bb);

            System.out.println("balance after deposit"+this.getBalance());

    }


}

class Withdraw extends Thread{

    AccountInfo a;

    public Withdraw(AccountInfo a) {
        this.a = a;
    }

    public void run(){
        synchronized (a) {
            a.withdrawAmount(2000);
        }
    }

}

class Deposit extends Thread {

    AccountInfo a;

    public Deposit(AccountInfo a) {
        this.a = a;
    }

    public void run(){

        synchronized (a) {
            a.depositAmount(4000);
        }
    }
}


public class Account {

    public static void main(String[] args)throws Exception{

        AccountInfo a=new AccountInfo(4000.00);

        Deposit d=new Deposit(a);
        Withdraw w=new Withdraw(a);


        d.start();
        w.start();

        d.join();
        w.join();


    }

}
