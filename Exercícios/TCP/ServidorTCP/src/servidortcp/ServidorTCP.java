/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidortcp;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author 2014201608
 */
public class ServidorTCP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //1: Instanciar ServerSocket
        int Porta = 4000;
        ServerSocket servidor = new ServerSocket(Porta);
        
        //2: Accept ServerSocket
                
        while(true){
            Socket s = servidor.accept();
            (new ThreadTCP(s)).start();
        }
//        //3: Instanciar DataInputStream
//        DataInputStream entrada = new DataInputStream(s.getInputStream());
//        
//        //4: Receber o dado (read)
//        String palavra = entrada.readUTF();
//        System.out.println(palavra);
    }
    
}
