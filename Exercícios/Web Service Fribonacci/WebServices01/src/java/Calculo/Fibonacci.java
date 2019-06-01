/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculo;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author anderson
 */
@WebService(serviceName = "Fibonacci")
public class Fibonacci {

    /**
     * This is a sample web service operation
     * @param n
     * @return 
     */
    @WebMethod(operationName = "Fibonacci")
    public int f(@WebParam(name="numero") String n) {
        return fibo(Integer.parseInt(n));
    }
    
    private int fibo(int n){
        if(n<0) return 0;
        if(n==0 || n==1) return n;
        return fibo(n-1) + fibo(n-2);
    }
}
