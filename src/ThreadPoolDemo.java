import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

    public static void main (String[] args) {
        /*TASK 1*/
//        ExecutorService executor = Executors.newFixedThreadPool(3);
//        for(int i=0;i<5;i++) {
//            executor.execute( () -> {
//                try {
//                    System.out.println(Thread.currentThread().getName()+"is performing task");
//                    Thread.sleep(3000);
//                    System.out.println(Thread.currentThread().getName()+" Completed Task");
//                }
//                catch (Exception e) {
//                    System.out.println(e.getMessage());
//                }
//            });
//        }

        /*TASK 2*/
//        ExecutorService executor = Executors.newCachedThreadPool();
//        for(int i=0;i<10;i++) {
//            executor.execute(()-> {
//                try {
//                    System.out.println(Thread.currentThread().getName()+" is accessing state of machine");
//                    Thread.sleep(1000);
//                    System.out.println(Thread.currentThread().getName()+" finalized the state");
//                }
//                catch (Exception e) {
//                    System.out.println(e.getMessage());
//                }
//            });
//        }
//        for(int i=0;i<5;i++) {
//            executor.execute(()-> {
//                try {
//                    System.out.println(Thread.currentThread().getName()+"is reused ?");
//                    Thread.sleep(2000);
//                    System.out.println(Thread.currentThread().getName()+" Check ->");
//                }
//                catch (Exception e) {
//                    System.out.println(e.getMessage());
//                }
//            });
//        }
        /*TASK 3*/
        ExecutorService executor = Executors.newSingleThreadExecutor();

        for(int i=0;i<5;i++) {
            executor.submit(() -> {
                try{
                    System.out.println(Thread.currentThread().getName()+" is Running");
                    Thread.sleep(1500);
                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            });
            executor.submit(()-> {
               try {
                   System.out.println(Thread.currentThread().getName()+" Second Task");
                   Thread.sleep(1000);
               }
               catch (Exception e) {
                   System.out.println(e.getMessage());
               }
            });
            executor.submit(()-> {
                try {
                    System.out.println(Thread.currentThread().getName()+" Third Task");
                    Thread.sleep(500);
                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            });
        }
        executor.close();
    }
}
