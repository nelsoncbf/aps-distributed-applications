/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import stub.Soma;

/**
 *
 * @author 2014201608
 */
public class Servidor extends UnicastRemoteObject implements Soma {
    
    public Servidor() throws RemoteException {
    super();
}
    /**
     * @param args the command line arguments
     * @throws java.rmi.RemoteException
     * @throws java.net.MalformedURLException
     */
    public static void main(String[] args)
            throws RemoteException, MalformedURLException {
        Naming.rebind("//localhost/Soma", new Servidor());
    }

    /**
     *
     * @param a
     * @param b
     * @return
     * @throws RemoteException
     */
    @Override
    public int mais(int a, int b) throws RemoteException {
        System.out.println("a: "+a+" b: "+b);
        return a+b;
    }
}
