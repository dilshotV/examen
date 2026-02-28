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
public class Credito {

    public double monto_solicitado;
    public double interes_men;
    public int plazo_meses;
    public double monto_total;

    public Credito() {
    }

    public Credito(double monto_solicitado, double interes_men, int plazo_meses, int monto_total) {
        this.monto_solicitado = monto_solicitado;
        this.interes_men = interes_men;
        this.plazo_meses = plazo_meses;
        this.monto_total = monto_total;
        calcular_monto_total_crédito();
    }

    public double getMonto_total() {
        return monto_total;
    }

    public void setMonto_total(double monto_total) {
        this.monto_total = monto_total;
    }

    public double getMonto_solicitado() {
        return monto_solicitado;
    }

    public void setMonto_solicitado(double monto_solicitado) {
        this.monto_solicitado = monto_solicitado;
    }

    public double getInteres_men() {
        return interes_men;
    }

    public void setInteres_men(double interes_men) {
        this.interes_men = interes_men;
    }

    public int getPlazo_meses() {
        return plazo_meses;
    }

    public void setPlazo_meses(int plazo_meses) {
        this.plazo_meses = plazo_meses;
    }

    public void tomar_datos() {
        monto_solicitado = Double.parseDouble(JOptionPane.showInputDialog("digite el monto"));
        interes_men = Double.parseDouble(JOptionPane.showInputDialog("digite el interes mensual"));
        plazo_meses = Integer.parseInt(JOptionPane.showInputDialog("digite el plazo por mes"));
        calcular_monto_total_crédito();
    }

    public void mostrar_datos() {
        String mensaje = "Monto solicitado: " + monto_solicitado
                + "\nInterés mensual: " + interes_men
                + "\nPlazo en meses: " + plazo_meses
                + "\nMonto total a pagar: " + monto_total;
        JOptionPane.showMessageDialog(null, mensaje);

    }

    public void calcular_monto_total_crédito() {
        monto_total = monto_solicitado + (monto_solicitado * (interes_men / 100) * plazo_meses);
    }

}
