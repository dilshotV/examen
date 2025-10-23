/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;
import examen.Facturas.Factura;
import javax.swing.JOptionPane;
/**
 *
 * @author dilsh
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
  
        String nombre =JOptionPane.showInputDialog("Nombre del trabajador:");
        String cedula =JOptionPane.showInputDialog("Cédula:");
        String codigo =JOptionPane.showInputDialog("Sucursal:");
        int vehiculo = Integer.parseInt(JOptionPane.showInputDialog("¿Tiene vehículo propio? (1=Sí, 0=No)"));


        while (true) {
            String nombreCliente = javax.swing.JOptionPane.showInputDialog("Nombre del cliente:");
            String cedulaCliente = javax.swing.JOptionPane.showInputDialog("Cédula del cliente:");
            String codigoFactura = javax.swing.JOptionPane.showInputDialog("Código de factura:");
            double monto = Double.parseDouble(javax.swing.JOptionPane.showInputDialog("Monto de la factura:"));
            int mes = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Mes (1-12):"));
            int electrico = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Cantidad productos eléctricos:"));
            int auto = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Cantidad productos automotrices:"));
            int construccion = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Cantidad productos construcción:"));

            int continuar = javax.swing.JOptionPane.showConfirmDialog(null, "¿Desea ingresar otra factura?", "Continuar", javax.swing.JOptionPane.YES_NO_OPTION);
            if (continuar != javax.swing.JOptionPane.YES_OPTION) break;
        }

        trabajador.evaluarBonoExtra();
        trabajador.mostrarResumen();
    }
}  
      
        
   
       

     
        

        
        
        
    

    