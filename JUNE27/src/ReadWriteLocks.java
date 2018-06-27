import java.util.concurrent.locks.ReentrantReadWriteLock;

class Box{

    private double len,wid,ht;

    public Box(double len, double wid, double ht) {
        this.len = len;
        this.wid = wid;
        this.ht = ht;
    }

    ReentrantReadWriteLock locks=new ReentrantReadWriteLock();
    ReentrantReadWriteLock.WriteLock wl= locks.writeLock();
    ReentrantReadWriteLock.ReadLock rl= locks.readLock();


    public void half(){

            wl.lock();
            len = len / 2;

            try {

                Thread.sleep(2000);

            } catch (Exception e) {
                System.out.println(e);
            }

            wid = wid / 2;
            ht = ht / 2;
            wl.unlock();

    }


    public void twice(){


            wl.lock();
            len = len * 2;

            try {

                Thread.sleep(1000);

            } catch (Exception e) {
                System.out.println(e);
            }


            wid = wid * 2;
            ht = ht * 2;
            wl.unlock();


    }


    public void show(){

        rl.lock();
        System.out.println(len+" "+wid+" "+ht);
        rl.unlock();
    }


}


class BoxProducer extends Thread{

    Box b1;

    public BoxProducer(Box b1) {
        this.b1 = b1;
    }

    public void run() {

        while (true) {
            b1.twice();
            try {

                Thread.sleep(2000);

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class BoxConsumer extends Thread{

    Box b2;

    public BoxConsumer(Box b2) {
        this.b2 = b2;
    }

    public void run(){

        while(true) {
            b2.half();
            try {

                Thread.sleep(2000);

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

}


class Viewer extends Thread {


    Box b2;

    public Viewer(Box b2) {
        this.b2 = b2;
    }

    public void run(){

        while(true) {
            b2.show();
        }
    }

}


public class ReadWriteLocks {

    public static void main(String[] args)throws Exception {

        Box b1 = new Box(8, 8, 8);

        BoxConsumer bc = new BoxConsumer(b1);
        BoxProducer bp = new BoxProducer(b1);
        Viewer v1 = new Viewer(b1);


        bc.start();
        bp.start();
        v1.start();

        bc.join();
        bp.join();
        v1.join();



    }

}