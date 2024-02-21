/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_9_constructores;

/**
 *
 * @author invitado
 */
public class CuentaBancaria {

    private int noCuenta;
    private double saldo;
    private String cliente;

    public CuentaBancaria(){
        noCuenta = 0;
        cliente = "SIN CLIENTE";
        saldo = 100000;
    }
    
    public int getNoCuenta() {
        return noCuenta;

    }
    public void setNoCuenta(int cuenta) {
        noCuenta = cuenta;
    }

    
    public String getCliente() {
        return cliente;

    }
    public void setcliente(String nomCliente) {
        cliente = nomCliente;
    }

    public double getSaldo(){
            return saldo;
                    }
   
    public void retirar(double monto){
        if(saldo >= monto)
            saldo = saldo - monto;
            
    }
    
    public void depositar (double deposito){
        
    
            saldo = saldo + deposito;
                    }
}
