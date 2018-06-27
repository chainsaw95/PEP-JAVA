import java.util.TooManyListenersException;

class Hare extends Thread{

    public void run(){

        int i=0;
     while(i<1000){

         try {

              i = i + 100;
              if (i == 700) ;
              Thread.sleep(3000);

             if(i==1000){
                 System.out.println("Hare won the race");
                 break;
             }

         }
         catch (Exception e){
             System.out.println(e);
         }

        }

    }
}

class Turtle extends Thread {

    public void run() {
        int i=0;
        while (i<1000) {
            try {
                i = i + 40;
                if (i == 1000) {
                    System.out.println("Turtle won the race");

                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
public class HareTortoise {

    public static void main(String[] args)throws Exception{

        Hare h1=new Hare();
        Turtle t1=new Turtle();

        h1.start();
        t1.start();

        

    }
}
