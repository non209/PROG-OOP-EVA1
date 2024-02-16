/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_7_metodos;

/**
 *
 * @author invitado
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre (String valor){
        nombre=valor ;
       
    }
    
    public String getApellido(){
        return apellido;
    }
    public void setApellido (String valor){
        apellido=valor ;
       
    }
    
    public int getEdad(){
        return edad;
    }
    public void setEdad(int valor){
        edad=valor ;
       
    }
    
    
    public String generarnombrecompleto(){
        return nombre+ " "+ apellido;
        
    }
    
    public int calcularanonacimiento (){
        return 2024 - edad;
    }
}
