/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import stub.Soma;

/**
 *
 * @author 04279207798
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
            throws NotBoundException, 
            MalformedURLException, 
            RemoteException {
        Soma s = (Soma)Naming.lookup("//localhost/Soma");
        System.out.println(s.mais(1, 2));
    }
    
}
