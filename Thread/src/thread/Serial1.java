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
public class Serial1 {
    public static void main(String args[]){
        double S;
        System.out.println("DAD'17 - Projeto 1 - Serial");
        System.out.print("Entre com n:");
        double n = (new Scanner(System.in)).nextDouble();
        ThreadMXBean thMxB = ManagementFactory.getThreadMXBean();
        long t0 = thMxB.getCurrentThreadCpuTime();
        S = (new Soma()).Soma(0, n);
        long t1 = thMxB.getCurrentThreadCpuTime();
        System.out.println("Tempo de execução: " + (t1-t0)/1000000000. +  "s");
        
    }
}

class Soma{
    public double Soma(double i0, double in){
        double S=0;
        for(double i=i0; i<in; i++)
            S+=i;
        return S;
    }
}
