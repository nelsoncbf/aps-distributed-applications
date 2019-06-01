/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidortcp;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author 2014201608
 */
public class ThreadTCP extends Thread {

    private Socket s;

    public ThreadTCP(Socket s) {
        this.s = s;
    }

    public void run() {
        try {
            //3: Instanciar DataInputStream
            DataInputStream entrada = new DataInputStream(s.getInputStream());

            //4: Receber o dado (read)
            String palavra = entrada.readUTF();
            System.out.print(s.getInetAddress().getCanonicalHostName() + " ");
            System.out.print(s.getInetAddress().getHostAddress() + " ");
            System.out.println(palavra);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
