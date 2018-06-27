class Goodown{
    int item;
    boolean full=false;

    synchronized public void put(int item){

        while (full) {

            try {

                System.out.println("Producer Waiting");
                wait();

            } catch (InterruptedException e) {
                System.out.println(e);
            }

        }
            this.item=item;
            full=true;
            System.out.println("PUT"+item);
            notify();

    }

    synchronized public void get(){

        while (!full) {

            try {

                System.out.println("Consumer Waiting");
                wait();

            } catch (InterruptedException e) {
                System.out.println(e);
            }
            }

            this.item=item;
            full=true;
            System.out.println("GET"+item);
            notify();

        }
}


class Producer extends Thread{


    Goodown g;

    Producer(Goodown g){
        this.g=g;

    }


    public void run(){

            g.put(1);

            try {
                Thread.sleep(4000);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }

}

class Consumer extends Thread{

    Goodown g;


    Consumer(Goodown g){

        this.g=g;
    }


    public void run() {


            g.get();

        try {
            Thread.sleep(3000);
        }
        catch (Exception e){
            System.out.println(e);
        }


    }


}



public class InterThreadCommunication {

    public static void main(String[] args)throws Exception{

        Goodown g=new Goodown();

        Producer p=new Producer(g);
        Consumer c=new Consumer(g);

        p.start();
        c.start();


        p.join();
        c.join();

    }


}
