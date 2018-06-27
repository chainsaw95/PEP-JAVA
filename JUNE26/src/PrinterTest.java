class AccessPrinter extends Thread{

    Printer p;
    String msg;

    AccessPrinter(Printer p,String msg){
        super();
        this.p=p;
        this.msg=msg;
    }

    public void run(){

        synchronized (p) {
            p.printmsg(msg);
        }
    }

}

class Printer {

    // method one
    // use synchronized

    public  void printmsg(String msg){

        System.out.print("[");
        System.out.print(msg);
        try{
            Thread.sleep(1000);

        }
        catch (InterruptedException e){

            System.out.print(e);
        }


        System.out.println("]");

    }

}


public class PrinterTest{

    public static void main(String[] args)throws Exception{

        Printer p=new Printer();


        AccessPrinter ap1=new AccessPrinter(p,"hello");
        AccessPrinter ap2=new AccessPrinter(p,"world");

        ap1.start();
        ap2.start();


        ap1.join();
        ap2.join();

    }

}



