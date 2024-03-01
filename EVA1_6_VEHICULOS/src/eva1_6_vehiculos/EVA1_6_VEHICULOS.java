/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_6_vehiculos;

/**
 *
 * @author invitado
 */
public class EVA1_6_VEHICULOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        vehiculo carro = new vehiculo();
        carro.setmarca("chevrolet");
        carro.setmodelo("camaro ss");
        carro.setannio(2016);
        carro.setprecio(217000);
        carro.setcolor("negro");
        
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getmodelo());
        System.out.println("Año: " + carro.getAnnio());
        System.out.println("Color: " + carro.getcolor());
        System.out.println("Precio: " + carro.getprecio());
    }
    
}
