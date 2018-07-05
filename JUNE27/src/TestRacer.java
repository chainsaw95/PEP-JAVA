import java.util.*;
class Racer extends Thread{

    Vector<String> vec=new Vector<>();

    public void run(){

        int i=0;
        while(i<=500){


            System.out.println(Thread.currentThread().getName()+" "+i);
            i=i+100;

            try {
                Thread.sleep(2000);
            }
            catch (Exception e){
                System.out.println(e);
            }
            if(i==500) {

                String s=Thread.currentThread().getName();
                vec.add(s);

                if(vec.size()>3){
                    for(int j=0;j<3;j++){
                       System.out.println(vec.get(i));
                    }
                    System.exit(0);
                }

            }
        }

    }

}


public class TestRacer {

    public static void main(String[] args)throws InterruptedException{
Thread.currentThread().getName();

        ArrayList<Racer> ar1=new ArrayList<>();

        for(int i=0;i<10;i++){
            ar1.add(new Racer());
        }


        for(int i=0;i<10;i++){
           Racer r1=ar1.get(i);
           r1.start();
        }


    }

}
