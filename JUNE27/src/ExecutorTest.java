import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTest {
    public static void main(String[] args)throws Exception{

        ExecutorService tpool= Executors.newFixedThreadPool(3);
        List<Callable<Object>> tasks=new ArrayList<>();


        for(int i=0;i<=10;i++) {

            tasks.add(new Callable<Object>() {
                @Override
                public Object call() throws Exception {

                    System.out.println(Thread.currentThread().getName() + "starts");
                    Thread.sleep((new Random().nextInt(10) * 1000));
                    System.out.println(Thread.currentThread().getName() + "after sleep");
                    return "Thread after sleep";


                }
            });

        }

        tpool.invokeAll(tasks);
        tpool.shutdown();


        }
        }


