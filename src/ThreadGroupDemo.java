import java.time.LocalTime;

public class ThreadGroupDemo {

    public static void main (String[] args) throws Exception {

        /*TASK1*/
//        ThreadGroup MyGroup = new ThreadGroup("MyGroup");
//        Thread thread1 = new Thread(MyGroup, ()-> {
//            System.out.println(Thread.currentThread().getName());
//            System.out.println(Thread.currentThread().getThreadGroup());
//        });
//        Thread thread2 = new Thread(MyGroup,  ()-> {
//            System.out.println(Thread.currentThread().getName());
//            System.out.println(Thread.currentThread().getThreadGroup());
//        });
//        Thread thread3 = new Thread(MyGroup, ()-> {
//            System.out.println(Thread.currentThread().getName());
//            System.out.println(Thread.currentThread().getThreadGroup());
//        });
//        thread1.start();
//        thread2.start();
//        thread3.start();

        /*TASK2*/
//        ThreadGroup Group1 = new ThreadGroup("5 Task");
//        Thread thread1 = new Thread(Group1, ()-> {
//            try {
//                System.out.println(Thread.currentThread().getName());
//                Thread.sleep(3000);
//            }
//            catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//        });
//        Thread thread2 = new Thread(Group1, ()-> {
//            try {
//                System.out.println(Thread.currentThread().getName());
//                Thread.sleep(3000);
//            }
//            catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//        });
//        Thread thread3 = new Thread(Group1, ()-> {
//            try {
//                System.out.println(Thread.currentThread().getName());
//                Thread.sleep(3000);
//            }
//            catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//        });
//        Thread thread4 = new Thread(Group1, ()-> {
//            try {
//                System.out.println(Thread.currentThread().getName());
//                Thread.sleep(3000);
//            }
//            catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//        });
//        Thread thread5 = new Thread(Group1, ()-> {
//            try {
//                System.out.println(Thread.currentThread().getName());
//                Thread.sleep(3000);
//            }
//            catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//        });
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();
//        thread5.start();
//        Group1.interrupt();
//
        /*TASK3*/
//    BankAccount bankAccount = new BankAccount();
//
//    Thread transction1 = new Thread( ()-> {
//       bankAccount.deposit(4200);
//    });
//    Thread transction2 = new Thread( ()-> {
//        bankAccount.withdraw(400);
//    });
//    Thread transction3 = new Thread( ()-> {
//        bankAccount.deposit(8800);
//    });
//
//    transction1.start();
//    transction2.start();
//    transction3.start();
//    transction2.join();
//    transction3.join();
//    System.out.println("Amount in Bank Account : "+bankAccount.Amount);

        /*TASK 4*/
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Available processors :"+runtime.availableProcessors());
        System.out.println("Total Memory : "+(runtime.totalMemory()/(1024*1024)));
        System.out.println("Free Memory : "+(runtime.freeMemory()/(1024*1024)));

        runtime.addShutdownHook(new Thread( ()-> {
            System.out.println("Application Stopped at "+ LocalTime.now());
        }));

        System.out.println("Processes Completed");
    }

    public static class BankAccount {
        int Amount = 15000;
        synchronized void deposit (int money) {
            Amount += money;
        }

        synchronized void withdraw (int money) {
            Amount -= money;
        }
    }
}
