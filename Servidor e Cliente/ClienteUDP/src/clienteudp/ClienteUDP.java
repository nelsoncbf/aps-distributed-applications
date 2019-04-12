/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteudp;

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
public class ClienteUDP {

    /**
     * @param args the command line arguments
     * @throws java.net.SocketException
     * @throws java.net.UnknownHostException
     */
    public static void main(String[] args) throws SocketException, UnknownHostException, IOException {
        // TODO code application logic here
        DatagramSocket cliente = new DatagramSocket();
        String mensagem = "UniCarioca";
        byte []Mensagem = mensagem.getBytes();
        InetAddress enderecoServidor = InetAddress.getByName("127.0.0.1");
        DatagramPacket dados = new DatagramPacket(Mensagem, mensagem.length(), enderecoServidor,  4000);
        
        cliente.send(dados);
    }
    
}
