/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Usuario;
import View.Login;

/**
 *
 * @author tiago
 */
public class LoginController{

    private final Login view;



    public LoginController(Login view) {
        this.view = view;
        
    }


    public void AdicionaTexto(Usuario usuario) {
        System.out.println(usuario.getName());
        view.dispose();
    }
    
    
    
}
