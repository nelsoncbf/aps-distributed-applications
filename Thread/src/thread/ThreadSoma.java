/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author nelsonfonseca
 */
public class ThreadSoma extends Thread{
    private final double i0, in;
    public double S;
    ThreadSoma(double i0, double in){
        this.in = in;
        this.i0 = i0;
    }
    @Override
    public void run(){
        S = (new Soma()).Soma(i0, in);
    }
}
