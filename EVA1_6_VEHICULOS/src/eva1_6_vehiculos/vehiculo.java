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
public class vehiculo {

    private String marca;
    private String modelo;
    private int annio;
    private String color;
    private double precio;

    public String getMarca() {
        return marca;
    }

    public void setmarca(String valor) {
        marca = valor;
    }

    public int getAnnio() {
        return annio;
    }

    public void setannio(int valor) {
        annio = valor;
    }

    public String getmodelo() {
        return modelo;
    }

    public void setmodelo(String valor) {
        modelo = valor;
    }

    public String getcolor() {
        return color;
    }

    public void setcolor(String valor) {
        color = valor;
    }

    public double getprecio() {
        return precio;
    }

    public void setprecio(double valor) {
        precio = valor;
    }
}
