/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_7_metodos;

import java.util.Scanner;



/**
 *
 * @author invitado
 */
public class EVA1_7_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona perso = new Persona ();
        perso.setNombre("Juan");
        perso.setApellido("Perez");
        perso.setEdad(50);
        
        System.out.println("El nombre es ");
        
        Persona[] grupo = new Persona [2];
        
        for (int i = 0; i < grupo.length; i++) {
            Scanner sc = new Scanner (System.in);
        
            grupo[i] = new Persona();
            
            System.out.println("Introduce el nombre: ");
            String nombre= sc.nextLine();
            grupo[i].setNombre(nombre);
            
            System.out.println("Introduce el apellido: ");
                        String ape= sc.nextLine();
            grupo[i].setApellido(ape);

            System.out.println("Introduce la edad: ");
                        int edad= sc.nextInt();
            grupo[i].setEdad(edad);

            
            
            
        }
    }
    
}
