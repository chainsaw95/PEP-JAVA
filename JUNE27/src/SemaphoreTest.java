import java.util.Random;
import java.util.concurrent.Semaphore;

class Box1{

    double len,wid,ht;
    Semaphore sem;

    public Box1(double len, double wid, double ht) {
        this.len = len;
        this.wid = wid;
        this.ht = ht;
        sem=new Semaphore(1);
    }

    public void access()throws Exception{

        Thread cur=Thread.currentThread();
        System.out.println(cur.getName()+"is trying to access box");
        sem.acquire();
        System.out.println(cur.getName()+"has to access box");
        long time=(new Random().nextInt(1))*1000;
        Thread.sleep(time);
        System.out.println(cur.getName()+"has released the b box");
        sem.release();

    }


}

class AccessBox1 extends Thread{

    Box1 b1;

    public AccessBox1(Box1 b1) {
        this.b1 = b1;
    }

    public void run(){

        try {
            b1.access();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}

class AccessBox2 extends Thread{

    Box1 b1;

    public AccessBox2(Box1 b1) {
        this.b1 = b1;
    }

    public void run(){

        try {
            b1.access();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}

public class SemaphoreTest {

    public static void main(String[] args)throws Exception{


        Box1 b1=new Box1(4,4,4);

        AccessBox1 ac1=new AccessBox1(b1);
        AccessBox2 ac2=new AccessBox2(b1);


        ac1.start();
        ac2.start();

        ac1.join();
        ac2.join();




    }

}
