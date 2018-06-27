import java.io.FileInputStream;
import java.io.FileOutputStream;

class MatrixThread extends Thread{

    public void run(){

        double start=System.currentTimeMillis();

        double a[][]=new double[1000][1000];
        double b[][]=new double[1000][1000];


        for(int i=0;i<1000;i++){

            for(int j=0;j<1000;j++){

                a[i][j]=(int) Math.random();
                b[i][j]=(int) Math.random();
                double n=a[i][j]+b[i][j];


            }

        }


        double end=System.currentTimeMillis();

        System.out.println("Matrix time"+(end-start));

    }
}


class TestRunnable implements Runnable {


    @Override
    public void run() {

        double start=System.currentTimeMillis();

        for(int i=0;i<10000;i++) {

            try {


                FileInputStream fin = new FileInputStream("JUNE22/src/myinput.txt");
                FileOutputStream fout = new FileOutputStream("JUNE22/src/output.txt");

                int ch = 0;

                while (ch != -1) {

                    ch = fin.read();
                    // if(ch==-1) break;
                    fout.write(ch);

                }

                fin.close();
                fout.close();

            } catch (Exception f) {

                System.out.println(f);

            }


        }

        double end=System.currentTimeMillis();

        System.out.println("File copy time"+(end-start));

    }
}


public class TestThreadRunnable{


    public static void main(String[] args)throws Exception{

        double start=System.currentTimeMillis();

        MatrixThread m1=new MatrixThread();
        m1.start();

        TestRunnable r1=new TestRunnable();
        Thread t1=new Thread(r1);
        t1.start();

        m1.join();
        t1.join();


        double end=System.currentTimeMillis();
        System.out.println("Main time "+(((int)(end-start)/1000))+" Seconds");


    }





}