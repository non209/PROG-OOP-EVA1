/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_8_tv;

/**
 *
 * @author invitado
 */
public class television {

    private int volumen;
    private int canal;
    private boolean estaEncendida;

    public television() {
        volumen = 30;
        canal = 5;
        estaEncendida = false;
    }

    //
    public void subirVolumen() {
        if (estaEncendida && (volumen < 100)) {
            volumen++;
        }
    }

    public void bajarVolumen() {
        if (estaEncendida && (volumen > 0)) {
            volumen--;
        }
    }

    public void subirCanal() {
        if (estaEncendida) {
            canal++;
        }
    }

    public void bajarCanal() {
        if (estaEncendida && (canal > 0)) {
            canal--;
        }
    }

    public void cambiarCanal(int numcanal) {

        if (estaEncendida && !(numcanal < 0)) {
            canal = numcanal;
        }
    }

    public void power() {

        estaEncendida = !estaEncendida;
    }

    public void imprimirConfig() {
        System.out.println("Volumen: " + volumen);
        System.out.println("Canal: " + canal);
        System.out.println("Power: " + estaEncendida);
    }
}
