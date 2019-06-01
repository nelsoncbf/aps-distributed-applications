/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dado;

import java.io.Serializable;

/**
 *
 * @author 2014201608
 */
public class Cadastro implements Serializable {
    String nome, telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Cadastro(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
    
}
