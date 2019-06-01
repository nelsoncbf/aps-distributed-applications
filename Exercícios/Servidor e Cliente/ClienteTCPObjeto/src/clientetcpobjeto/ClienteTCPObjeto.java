/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientetcpobjeto;

import dado.Cadastro;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author 2014201608
 */
public class ClienteTCPObjeto {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Socket cliente= new Socket("127.0.0.1", 5000);
        ObjectOutputStream objeto = new ObjectOutputStream(cliente.getOutputStream());
        objeto.writeObject(new Cadastro("Anderson", "9875465484"));
    }
    
}
