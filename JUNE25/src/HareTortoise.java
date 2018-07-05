import java.util.TooManyListenersException;

class Flag{

    public int flag=0;

}


class Hare extends Thread{


    Flag f1;

    Hare(Flag f1){
        this.f1=f1;
    }

    public void run(){


        int i=0;
     while(i<1000 && f1.flag==0){

         try {

              i = i + 100;
              if (i == 700) ;
              Thread.sleep(1000);

             if(i==1000){
                 f1.flag=1;
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

    Flag f1;

    Turtle(Flag f1){
        this.f1=f1;

    }


    public void run() {
        int i=0;
        while (i<1000 && f1.flag==0) {
            try {
                i = i + 50;
                if (i == 1000) {
                    f1.flag=2;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class HareTortoise {

    public static void main(String[] args)throws Exception{

        Flag f1=new Flag();

        Hare h1=new Hare(f1);
        Turtle t1=new Turtle(f1);

        h1.start();
        t1.start();

        if(f1.flag==1){
            System.out.println("Hare won the race");
        }
        else if(f1.flag==2){
            System.out.println("Turtle won the race");
        }

    }
}
