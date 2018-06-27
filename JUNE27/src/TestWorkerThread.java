import javafx.concurrent.Worker;

import java.util.Random;
import java.util.concurrent.Phaser;

class WorkerThread extends Thread{

    Phaser phaser;

    public WorkerThread(Phaser phaser) {
        this.phaser = phaser;
    }

    public void run(){

        for(int i=0;i<=5;i++){


            try{

                int sleeptime=new Random().nextInt(10)*1000;
                System.out.println(Thread.currentThread().getName()+"running cycle"+i);
                Thread.sleep(sleeptime);
            }
            catch (Exception e){
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+"finished cycle");
            phaser.arriveAndAwaitAdvance();

        }

    }

}



public class TestWorkerThread {

    public static void main(String[] args)throws Exception{


    Phaser phaser=new Phaser(2);

    WorkerThread w1=new WorkerThread(phaser);
    WorkerThread w2=new WorkerThread(phaser);


    w1.start();
    w2.start();

    w1.join();
    w2.join();


        System.out.println("\n Main ends");



    }

}
