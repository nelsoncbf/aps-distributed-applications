/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorudp2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 *
 * @author 2014201608
 */
public class ServidorUDP2 {

    /**
     * @param args the command line arguments
     * @throws java.net.SocketException
     */
    public static void main(String[] args) throws SocketException, IOException {
        DatagramSocket servidor = new DatagramSocket (5000);
        byte[] buffer = new byte[1000];
        DatagramPacket dados = new DatagramPacket(buffer, buffer.length);
        servidor.receive(dados);
        
        System.out.println(dados);
        System.out.println(buffer);
        System.out.println(buffer.toString());
        System.out.println(dados.getData());
        String mensagem = new String (buffer);
        System.out.println(mensagem);
    }
    
}
