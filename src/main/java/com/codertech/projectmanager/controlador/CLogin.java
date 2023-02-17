package com.codertech.projectmanager.controlador;

import com.codertech.projectmanager.vista.CrearCuenta;
import com.codertech.projectmanager.vista.FrmLogin;
import com.codertech.projectmanager.vista.Login;
import com.codertech.projectmanager.vista.SliderLogin;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author CoderTech
 */
public class CLogin {

    FrmLogin frmLogin = new FrmLogin();
    Login login = new Login();
    CrearCuenta crearCuenta = new CrearCuenta();
    SliderLogin sliderLogin = new SliderLogin();

    public CLogin() {
        
        cambiarPanel();

        login.jLRegistrate.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                crearCuenta();
               login.jLRegistrate.setIcon(new ImageIcon("src/main/java/com/codertech/projectmanager/img/registrarteExcited.png"));
            }
        });
        
        crearCuenta.jLatras.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                login();
                crearCuenta.jLatras.setIcon(new ImageIcon("src/main/java/com/codertech/projectmanager/img/atrasExcited.png"));
            }
        });


    }

    public void cambiarPanel() {
        login.setSize(599, 740);
        frmLogin.Contenedor1.removeAll();
        frmLogin.Contenedor1.add(login, BorderLayout.CENTER);
        frmLogin.Contenedor1.revalidate();
        frmLogin.Contenedor1.repaint();

        sliderLogin.setSize(578, 740);
        frmLogin.Contenedor2.removeAll();
        frmLogin.Contenedor2.add(sliderLogin, BorderLayout.CENTER);
        frmLogin.Contenedor2.revalidate();
        frmLogin.Contenedor2.repaint();
    }

    public void login() {
        login.setSize(599, 740);
        frmLogin.Contenedor1.removeAll();
        frmLogin.Contenedor1.add(login, BorderLayout.CENTER);
        frmLogin.Contenedor1.revalidate();
        frmLogin.Contenedor1.repaint();
    }

    public void crearCuenta() {
        crearCuenta.setSize(599, 740);
        frmLogin.Contenedor1.removeAll();
        frmLogin.Contenedor1.add(crearCuenta, BorderLayout.CENTER);
        frmLogin.Contenedor1.revalidate();
        frmLogin.Contenedor1.repaint();
    }

    public static void main(String[] args) {
        new CLogin().frmLogin.setVisible(true);

    }

}
