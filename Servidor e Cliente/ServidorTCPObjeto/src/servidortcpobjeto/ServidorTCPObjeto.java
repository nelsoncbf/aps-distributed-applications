/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidortcpobjeto;

import dado.Cadastro;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author 2014201608
 */
public class ServidorTCPObjeto {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO code application logic here
        ServerSocket servidor = new ServerSocket(5000);
        Socket s = servidor.accept();
        ObjectInputStream objeto = new ObjectInputStream(s.getInputStream());
        Cadastro c = (Cadastro) objeto.readObject();
        System.out.println(c.getNome());
        System.out.println(c.getTelefone());
    }
    
}
