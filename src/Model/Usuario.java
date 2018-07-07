/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author tiago
 */
public class Usuario {
    
    private String name;
    private String senha;

    public Usuario(String name, String senha) {
        this.name = name;
        this.senha = senha;
    }

    public String getName() {
        return name;
    }
    
   
    
}
