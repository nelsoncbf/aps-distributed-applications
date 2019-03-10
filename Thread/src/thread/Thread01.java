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
 *
 * @author nelsonfonseca
 */
public class Thread01 {

    @SuppressWarnings("empty-statement")
    public static void main(String args[]) {
        double S;
        System.out.println("DAD'17 - Projeto 1 - 1 Thread");
        System.out.print("Entre com n:");
        double n = (new Scanner(System.in)).nextDouble();
        ThreadMXBean thMxB = ManagementFactory.getThreadMXBean();
        long t0 = thMxB.getCurrentThreadCpuTime();
        ThreadSoma ts = new ThreadSoma(0, n);
        ts.start();
        while(ts.isAlive());
        long t1 = thMxB.getCurrentThreadCpuTime();
        System.out.println("Tempo de execução: " + (t1 - t0) / 1000000000. + "s");
    }
}
