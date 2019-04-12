package clientetcp;


import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2014201608
 */
public class ClienteTCP {
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //1 - Instanciar um Socket
        String endereco = "10.8.3.24";
        int Porta = 4000;
        Socket s = new Socket (endereco, Porta);
        
        //2 - Definir objeto que vai enviar o dado
        DataOutputStream saida = new DataOutputStream(s.getOutputStream());
        //3 - Enviar o dado
        saida.writeUTF("Unicarioca");
        System.out.println("Informação enviada");
        
    }
}
