package PantallaFull;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServidorBanner {
      public static void main(String args[]){
     try {
         LocateRegistry.createRegistry(1099);
         //ImplBanner Banner= new ImplBanner();
         //Naming.bind("banner", Banner);
         System.out.println("Servidor Listo!!!!");
     } catch (Exception e) {
     }
 
 }
}
