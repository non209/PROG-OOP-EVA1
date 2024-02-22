package eva1_10_triangulo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class TRIANGULO {

    private double base;
    private double altura;
    private double alturaC;
    private double baseC;

    public TRIANGULO() {
        base = 100;
        altura = 20;

    }

    public void setBase(double valor) {
        base = valor ;
    }

    public void setAltura(double valor) {
        altura = valor ;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    private double calcularArea() {
        return (base * altura) / 2;
    }

    private double calcularPeri() {
        double peri;

        return Math.sqrt( (base * base) + (altura * altura)  );
    }

    public void imprimirDatos() {
        System.out.println("El area del triangulo es: " + calcularArea());
        System.out.println("El perimetro del triangulo es: " + calcularPeri());
    }
}
