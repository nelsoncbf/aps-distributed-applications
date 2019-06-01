/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidortcpobjeto;

import dado.Cadastro;
import java.io.ObjectInputStream;
import java.net.Socket;

/**
 *
 * @author 2014201608
 */
public class ServidorThread extends Thread {

    private Socket s;

    public ServidorThread(Socket s) {
        this.s = s;
        @Override
        public void run
        
            (){
        ObjectInputStream objeto = new ObjectInputStream(s.getInputStream());
            Cadastro c = (Cadastro) objeto.readObject();
            System.out.println(c.getNome());
            System.out.println(c.getTelefone());
        }
    }
