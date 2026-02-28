/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenprogra1;

import javax.swing.JOptionPane;

/**
 *
 * @author dilsh
 */
public class calcular_factorial {

    public static void calcularfactorial() {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("escriba un numero positivo: "));

        int factorial = 1;

        for (int i = numero; i > 0; i--) {
            factorial = factorial * i;
        }
        if (numero <= 0) {
            JOptionPane.showMessageDialog(null, "este numero no es positivo");
            return;
        }

        JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es " + factorial);
    }

}
