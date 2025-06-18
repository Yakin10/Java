import java.nio.file.AccessMode;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;

public class DeadLock {

    public static void main (String[] args) throws InterruptedException {
        /*TASK 1*/
//        BankAccount Account1 = new BankAccount(2500);
//        Thread transcation1 = new Thread(()-> {
//            synchronized (Account1) {
//                System.out.println("Transcation 1 Started");
//                Account1.deposit(6500);
//                System.out.println("Treanscation 1 Ended");
//            }
//        });
//
//        transcation1.start();
//        synchronized (Account1) {
//            System.out.println("Main Thread Started");
//            Account1.deposit(8900);
//            System.out.println("Main Thread Completed");
//            transcation1.join();
//        }

        /*TASK 2*/
//        Product p1 = new Product();
//        Thread producer = new Thread( ()-> {
//           try {
//               p1.prepProduct();
//           }
//           catch (Exception e ) {
//               System.out.println(e.getMessage());
//               }
//        });
//        Thread consumer = new Thread(()-> {
//            try {
//                p1.consProduct();
//            }
//            catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//        });
//        consumer.start();
//        producer.start();
        /*TASK3*/
        TrafficSignal TS = new TrafficSignal();
        for(int i =0; i<3;i++) {
            String name = "Thread"+i;
            Thread T = new Thread(()->{
                TS.Signal(name);
            }, name);
            T.start();
        }
        Thread T1 = new Thread(()-> {
           try{
               Thread.sleep(3000);
               TS.change();
           }catch (Exception e) {
               System.out.println(e.getMessage());
           }
        });

        T1.start();
     }

     public static class BankAccount {
        int Amount;
        public BankAccount(int M) {
            Amount=M;
        }
        public void deposit (int M) {
            Amount += M;
            System.out.println("Amount in Bank Account : "+Amount);
        }
     }

     public static class Product {
        private boolean isProductReady = false;
        public synchronized void prepProduct () throws InterruptedException {
            System.out.println("Producer is preparing Product");
            Thread.sleep(2000);
            isProductReady = true;
            System.out.println("Product is ready for consumer");
            notify();
        }
        public synchronized void consProduct () throws InterruptedException {
            while(!isProductReady){
                System.out.println("Consumer Waiting for product");
                wait();
            }
            System.out.println("Consumer Received the product");
        }
     }

     public static class TrafficSignal {
        public synchronized void Signal (String name) {
            try {
                System.out.println(name + " Car is waiting for green Signal");
                wait();
                System.out.println("Signal is Green, GO");
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
         }
         public synchronized void change () {
            System.out.println("Signal Turned to Green.");
            notifyAll();
         }
     }
}
