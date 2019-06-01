/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservicescliente01;

/**
 *
 * @author anderson
 */
public class Fibonacci {

    private static int fibonacci(java.lang.String numero) {
        webservice.Fibonacci_Service service = new webservice.Fibonacci_Service();
        webservice.Fibonacci port = service.getFibonacciPort();
        return port.fibonacci(numero);
    }
    
    public int Calculo(int n){
        return fibonacci(String.valueOf(n));
    }
    
}
