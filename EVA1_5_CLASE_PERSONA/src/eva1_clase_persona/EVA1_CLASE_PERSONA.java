/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_clase_persona;

/**
 *
 * @author invitado
 */
public class EVA1_CLASE_PERSONA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Persona pers=new Persona();
        pers.setNombre("Jorge");
        System.out.println(pers.getNombre());
        pers.setApellidos("Hernandez");
        System.out.println(pers.getApellidos());
        pers.setEdad(18);
        System.out.println(pers.getEdad());
        
        
    }
    
}

class Persona{
    //Atributos --> estado del objeto
    //no deben ser accesibles directamente
    private String nombre;
    private String Apellidos;
    private int edad;
    
    //Metodos
    //publicos --> son la interfaz
    //si son para manipular los atributos hay un estandar en java
    //Metodos set(escritura) y get(lectura)
    
    //Leer nombre:
    public String getNombre(){
        return nombre;
    }
    
    //Escribir nombre:
    public void setNombre(String valor){
        nombre= valor;
    }
    
    //Leer apellido
    
    public String getApellidos(){
        return Apellidos;
    }
    
    //Escribir apellido
    public void setApellidos(String valor){
        Apellidos= valor;
    }
    
    //Leer edad:
    public int getEdad(){
        return edad;
    }
    
    //Escribir edad:
    public void setEdad(int valor){
        edad= valor;    }
    
}
