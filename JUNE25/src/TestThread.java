class ParallelWork extends Thread{

    @Override
    public void run() {

        try {

            for(int i=0;i<50;i++){

                System.out.println(Thread.currentThread().getName());
                sleep(1000);

            }

             }catch (InterruptedException e){
            System.out.println(e);
        }

    }

}

class ParallelWorkRunnable implements Runnable{

    @Override
    public void run() {

        try {

            for(int i=0;i<50;i++){

                System.out.println(Thread.currentThread().getName());
                Thread.sleep(1000);
            }


        }catch (InterruptedException e){
            System.out.println(e);
        }

    }

}




public class TestThread extends Thread {

    public static void main(String[] args){

        ParallelWork p1=new ParallelWork();
        p1.start();


        ParallelWorkRunnable p2=new ParallelWorkRunnable();
        Thread t1=new Thread(p2);
        t1.start();

        for(int i=0;i<50;i++){

            System.out.println(Thread.currentThread().getName());

           try {
               sleep(1000);
           }catch (Exception e){
               System.out.print(e);
           }
        }

        try{

            p1.join();
            t1.join();;
        }catch (InterruptedException e){
            System.out.print(e);
        }




    }


}
