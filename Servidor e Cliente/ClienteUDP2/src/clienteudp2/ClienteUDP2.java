/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteudp2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 *
 * @author 2014201608
 */
public class ClienteUDP2 {

    /**
     * @param args the command line arguments
     * @throws java.net.SocketException
     * @throws java.net.UnknownHostException
     */
    public static void main(String[] args) throws SocketException, UnknownHostException, IOException {
        DatagramSocket cliente = new DatagramSocket();
        String palavra = "unicarioca";
        byte[] mensagem = palavra.getBytes();
        InetAddress enderecoServidor = InetAddress.getByName("127.0.0.1");
        DatagramPacket dados = new DatagramPacket(mensagem, palavra.length(),
        enderecoServidor, 5000);
        cliente.send(dados);
    }
    
}
