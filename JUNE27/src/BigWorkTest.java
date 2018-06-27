import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class BigWork implements Runnable{

    String workname;

    public BigWork(String workname) {
        this.workname = workname;
    }

    public void run(){

        Thread t=Thread.currentThread();
        System.out.println(t.getName()+"Big work starts here"+workname);
        try{

            Thread.sleep(5000+new Random().nextInt(5)+1000);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(t.getName()+"Big work over"+workname);

    }


}


public class BigWorkTest {

    public static void main(String[] args) throws InterruptedException {

        ScheduledThreadPoolExecutor exec=new ScheduledThreadPoolExecutor(4);

//        exec.schedule(new BigWork("1"),10,TimeUnit.SECONDS);
//        exec.schedule(new BigWork("2"),10,TimeUnit.SECONDS);
//        exec.schedule(new BigWork("3"),10,TimeUnit.SECONDS);

        exec.scheduleAtFixedRate(new BigWork("1"),5,20,TimeUnit.SECONDS);

    }

}