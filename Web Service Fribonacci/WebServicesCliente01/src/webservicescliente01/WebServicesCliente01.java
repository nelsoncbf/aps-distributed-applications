/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservicescliente01;

import java.util.Scanner;

/**
 *
 * @author anderson
 */
public class WebServicesCliente01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        System.out.print("n:");
        Scanner leitura = new Scanner(System.in);        
        System.out.println(f.Calculo(leitura.nextInt()));
    }
    
}
