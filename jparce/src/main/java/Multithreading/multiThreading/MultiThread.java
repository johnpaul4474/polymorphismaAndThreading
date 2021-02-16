package Multithreading.multiThreading;

import java.util.LinkedList; 

public class MultiThread extends MultithreadingList{ 
    public static void main(String[] args) 
        throws InterruptedException 
    {
         MultithreadingList multiThreading = new MultithreadingList(); 
        Thread t1 = new Thread(new Runnable() { 
            @Override
            public void run() 
            { 
                try { 
                	multiThreading.produce(); 
                } 
                catch (InterruptedException e) { 
                    e.printStackTrace(); 
                } 
            } 
        });
        Thread t2 = new Thread(new Runnable() { 
            @Override
            public void run() 
            { 
                try { 
                	multiThreading.consume(); 
                } 
                catch (InterruptedException e) { 
                    e.printStackTrace(); 
                } 
            } 
        });

        t1.start(); 
        t2.start(); 


        t1.join(); 
        t2.join(); 

    } 

} 