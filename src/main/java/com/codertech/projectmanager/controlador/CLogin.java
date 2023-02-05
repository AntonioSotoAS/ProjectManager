
package com.codertech.projectmanager.controlador;

import com.codertech.projectmanager.vista.Login;

/**
 *
 * @author CoderTech
 */
public class CLogin {

    Login login = new Login();
    
    public CLogin() {
        login.cambiarImagenSlider();
    }
    
    
    public static void main(String[] args) {
        new CLogin().login.setVisible(true);
        
    }
    
}
