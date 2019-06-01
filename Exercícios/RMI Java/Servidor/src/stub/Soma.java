/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stub;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author 2014201608
 */
public interface Soma extends Remote {
    public int mais (int a, int b) throws RemoteException;
}
