/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PantallaFull;

/**
 *
 * @author Ekam2
 */
public class ncjskal {
    
}
//
//package pruebasVarias;
//
//// AWT-SWING
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//
//// DEFINICIÓN DE LA CLASE
//public class HolaMundo extends JFrame{
//    // ATRIBUTOS DE LA CLASE
//
//    // Referencia al dispositivo gráfico
//    private GraphicsDevice gd = null;
//
//    public HolaMundo(){
//        // Primero obtenemos una referencia al entorno 
//        // gráfico de ventanas
//        GraphicsEnvironment ge = 
//            GraphicsEnvironment.getLocalGraphicsEnvironment();
//
//        // Obtenemos una referencia al dispositivo gráfico 
//        // primario
//        gd = ge.getDefaultScreenDevice();
//
//        // Si no hay soporte adecuado lo mostramos por pantalla
//        if(!gd.isFullScreenSupported())
//            System.out.println("WARNING: No hay soporte.\n");
//        else
//            System.out.println("INFO: Detectado soporte.\n");
//
//        try{
//            // Activamos el modo a pantalla completa
//            gd.setFullScreenWindow(this);
//
//            // Inicializamos toda la interfaz gráfica
//            initMainInterface();
//        }catch(Throwable e){
//            e.printStackTrace();
//            System.out.println("ERROR CRITICO: " 
//                + e.getMessage());
//            exit();
//        }
//    } // Constructor
//
//    public void initMainInterface() throws Exception{
//        // WindowListener para cerrar la aplicación al cerrar la 
//        // ventana
//        this.addWindowListener(new java.awt.event.WindowAdapter(){
//            public void windowClosing(WindowEvent e){
//                exit();
//            }
//        });
//        // Aqui añadimos una etiqueta en la "ventana" con la 
//        // cadena HolaMundo
//        this.getContentPane().add(new JLabel("HOLA MUNDO!"));
//        this.setVisible(true);
//    } // initMainInterface
//
//    public void exit(){
//        // Salimos del modoa pantalla completa
//        gd.setFullScreenWindow(null);
//
//        // Salimos de la aplicación
//        System.exit(0);
//    }//exit
//
//    public static void main(String[] args){
//        new HolaMundo();
//    }
//}