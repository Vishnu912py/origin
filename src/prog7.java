import java.io.*;
import java.util.*;

// Method 1 - Thread Class
class ThreadImpl extends Thread
{
    // Method to start Thread
    @Override
    public void run()
    {
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
    }
}

// Method 2 - Runnable Interface
class RunnableThread implements Runnable
{
    // Method to start Thread
    @Override
    public void run()
    {
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
    }

}

public class prog7
{
    public static void main(String[] args)
    {
        // Method 1 - Thread Class
        ThreadImpl t1 = new ThreadImpl();
        RunnableThread g2 = new RunnableThread();
        Thread t2 = new Thread(g2);
        t1.start();

        // Method 2 - Runnable Interface

        t2.start();

        // Wait for both threads to finish before printing the final result


    }
}