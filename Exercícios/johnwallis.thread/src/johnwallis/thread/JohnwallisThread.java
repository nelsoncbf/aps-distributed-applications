/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnwallis.thread;

import java.util.Scanner;

/**
 *
 * @author nelsonfonseca
 */
public class JohnwallisThread {

    
    public static void main(String[] args) {
        int R;
        double pi = 1, a =2, b=2;
        
        Scanner scan = new Scanner(System.in);
        System.out.print ("Insira um valor a ser calculado: ");
        R = scan.nextInt();
        
        for (int i = 1; i <= R; i++){          
            
            if ((a -1) == b){
                pi = pi * (a/b);
                b = b+2;
                System.out.println ("O pi de "+ i +" é: "+ pi);
            }
             if (a<b){
                pi = pi * (a/b);
                a = a + 2;
                System.out.println ("O pi de "+ i +" é: "+ pi);
            }
        }
    }
    
}
