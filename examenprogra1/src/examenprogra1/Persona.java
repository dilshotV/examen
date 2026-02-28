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
public class Persona {

    private String nombre;
    private String correo;
    private int anioNacimiento;
    private int edad;
public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
        calcularEdad();
    }

    public int getEdad() {
        return edad;
    }
    public Persona() {
    }

    public Persona(String nombre, String correo, int anioNacimiento, int edad) {
        this.nombre = nombre;
        this.correo = correo;
        this.anioNacimiento = anioNacimiento;
        this.edad = edad;
        calcularEdad();
    }

    public void pedirDatos() {

        nombre = JOptionPane.showInputDialog("digite su nombre");
        correo = JOptionPane.showInputDialog("digite su correo");
        anioNacimiento = Integer.parseInt(JOptionPane.showInputDialog("digite su año de nacimiento"));
        calcularEdad();

    }

    public void calcularEdad() {
        int annio = 2026;
        edad = annio - anioNacimiento;

    }

    public void Mostrardatos() {

        String MostrarDatos = "datos guardadados \n\n"
                + " nombre: " + nombre + "\n"
                + " edad: " + edad + "\n"
                + " correo: " + correo + "\n"
                + " año de naciiminento: " + anioNacimiento + "\n"
                + (edad >= 18 ? "eres mayor de edad." : "eres menor de edad.");
        JOptionPane.showInputDialog(MostrarDatos);

    }

    

}
