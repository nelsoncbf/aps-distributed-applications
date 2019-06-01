/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 2014201608
 */
public class ServidorUDP {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        try {
            DatagramSocket servidor = new DatagramSocket(4000);
            byte[] buffer = new byte[1000];
            
            DatagramPacket dado = new DatagramPacket(buffer, buffer.length);
            
            servidor.receive(dado);
            
            System.out.println(dado.toString());
            
            String a = new String(dado.getData());
            System.out.println(a);
        }catch (SocketException ex) {
            Logger.getLogger(ServidorUDP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
