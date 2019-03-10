/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.Scanner;

/**
 *0 - n/4 - 2n/2 - 3n/4 - n
 * @author nelsonfonseca
 */
public class Thread09 {
    @SuppressWarnings("empty-statement")
    public static void main(String args[]) {
        double S;
        System.out.println("DAD'17 - Projeto 1 - 2 Threads");
        System.out.print("Entre com n:");
        double n = (new Scanner(System.in)).nextDouble();
        ThreadMXBean thMxB = ManagementFactory.getThreadMXBean();
        long t0 = thMxB.getCurrentThreadCpuTime();
        ThreadSoma ts1 = new ThreadSoma(0, Math.floor(n/5));
        ThreadSoma ts2 = new ThreadSoma(Math.floor(n/9), Math.floor(2*n/9));
        ThreadSoma ts3 = new ThreadSoma(Math.floor(2*n/9), Math.floor(3*n/9));
        ThreadSoma ts4 = new ThreadSoma(Math.floor(3*n/9), Math.floor(4*n/9));
        ThreadSoma ts5 = new ThreadSoma(Math.floor(4*n/9), Math.floor(5*n/9));
        ThreadSoma ts6 = new ThreadSoma(Math.floor(5*n/9), Math.floor(6*n/9));  
        ThreadSoma ts7 = new ThreadSoma(Math.floor(6*n/9), Math.floor(7*n/9)); 
        ThreadSoma ts8 = new ThreadSoma(Math.floor(7*n/9), Math.floor(8*n/9)); 
        ThreadSoma ts9 = new ThreadSoma(Math.floor(8*n/9), n);
        ts1.start();
        ts2.start();
        ts3.start();
        ts4.start();
        ts5.start();
        ts6.start();
        ts7.start();
        ts8.start();
        ts9.start();
        while(ts1.isAlive() || ts2.isAlive() || ts3.isAlive() || ts4.isAlive() || ts5.isAlive() || ts6.isAlive() || ts7.isAlive() || ts8.isAlive() || ts9.isAlive());
        long t1 = thMxB.getCurrentThreadCpuTime();
        System.out.println("Tempo de execução: " + (t1 - t0) / 1000000000. + "s");
    }    
}
