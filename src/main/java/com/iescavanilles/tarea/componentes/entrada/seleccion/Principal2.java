/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.iescavanilles.tarea.componentes.entrada.seleccion;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Cristian y Carmen
 */
public class Principal2 extends JFrameTarea2 {

    public Principal2() {
        setTitle("Mi primera ventana en Java");
        
        setSize(400, 300);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);
        add(new JLabel("¡Hola, mundo!", JLabel.CENTER));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Principal2 ventana = new Principal2();
                ventana.setVisible(true); // Hacer visible la ventana
            }
        });
    }
}