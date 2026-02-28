/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenprogra1;

import javax.swing.JOptionPane;

/**
 *
 * @author dilsh
 */
public class Examenprogra1 {

    public static void main(String[] args) {

        int opcion = 0;
        String menu = "===== Sistema =====\n";
        menu += "1. Verificar la edad de una persona  \n";
        menu += "2. Calcular el factorial de un número \n";
        menu += "3. Calcular el monto total a pagar de un crédito  \n";
        menu += "4. Salir del programa \n";

        do {

            String input = JOptionPane.showInputDialog(menu);

            if (input == null) {
                opcion = 4;
            } else {
                opcion = Integer.parseInt(input);
            }

            switch (opcion) {
                case 1:
                    ejercicio_1();
                    break;
                case 2:
                    calcular_factorial.calcularfactorial();
                    break;
                case 3:
                    ejercicio_2();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "gracias por usar");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "no valida");
            }

        } while (opcion != 4);

    }

    public static void ejercicio_1() {
        Persona persona = new Persona();
        persona.pedirDatos();
        persona.Mostrardatos();

    }

    public static void ejercicio_2() {
        Credito credito = new Credito();
        credito.tomar_datos();
        credito.mostrar_datos();
    }
}
