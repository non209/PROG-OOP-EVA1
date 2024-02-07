/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg2_abstraccion;

/**
 *
 * @author invitado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor = 100;
        Persona perso1 = new Persona ();
        System.out.println(perso1);
        
       Vehiculo  elprecioso = new Vehiculo(); 
        
        
        elprecioso.annio = 1965;
        elprecioso.marca= "chevrolet";
        elprecioso.modelo= "camaro";
        
        System.out.println("marca : " + elprecioso.marca);
        System.out.println("modelo : " + elprecioso.modelo);
        System.out.println("año : " + elprecioso.annio);
    }
    
}

class Persona {
    
}

class Vehiculo{
    String marca;
    int annio;
    String modelo;
    
}































































