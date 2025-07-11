// Java Program to Illustrate Priorities in Multithreading
// via help of getPriority() and setPriority() method
import java.lang.*;
// All the threads reach the runnable state at the same time, priority
class Thread1 extends Thread {

    // run() method for the thread that is called
    // as soon as start() is invoked for thread in main()
    public void run()
    {
        System.out.println(Thread.currentThread().getName()
                + " is running with priority "
                + Thread.currentThread().getPriority());
    }

    // Main driver method
    public static void main(String[] args)
    {
        // Creating random threads
        // with the help of above class
        Thread1 t1 = new Thread1();
        Thread1 t2 = new Thread1();
        Thread1 t3 = new Thread1();

        // Display the priority of above threads
        // using getPriority() method
        System.out.println("t1 thread priority: " + t1.getPriority());
        System.out.println("t2 thread priority: " + t2.getPriority());
        System.out.println("t3 thread priority: " + t3.getPriority());

        // Setting priorities of above threads by
        // passing integer arguments


        // Error will be thrown in this case
        // t3.setPriority(21);

        // Last Execution as the Priority is low



        // Now Let us Demonstrate how it will work
        // According to it's Priority
        t1.start();
        t2.start();
        t3.start();

        // Thread - 0, 1 , 2 signify 1 , 2 , 3
        // respectively
    }
}