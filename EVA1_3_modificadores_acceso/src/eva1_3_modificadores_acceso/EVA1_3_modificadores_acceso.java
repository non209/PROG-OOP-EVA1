/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_3_modificadores_acceso;

/**
 *
 * @author invitado
 */
public class EVA1_3_modificadores_acceso {
public  int x;
protected int y;
private int z;
int w;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PruebaA objA = new PruebaA();
        System.out.println(objA.w);
    }
    
}

class PruebaA{
    public  int x;
protected int y;
private int z;
int w;
}
