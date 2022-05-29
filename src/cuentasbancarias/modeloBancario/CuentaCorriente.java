/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentasbancarias.modeloBancario;

/**
 *
 * @author Borja
 */

//Checking's account
public class CuentaCorriente extends Cuenta {

    final float interesFijo = 0.15f;

    Cliente cc = new Cliente(321, "Antonio Suarez", "Calle Falsa", "987654321");

    public CuentaCorriente() {
    }

    public CuentaCorriente(int numeroDeCuenta, int saldo, Cliente titular) {
        super(numeroDeCuenta, saldo, titular);
    }
    
    public float retirar() {
    float retirado = 0;
        
        if ((saldo - retirado)>=0) {
            System.out.println("No se puede tener saldo inferior a cero");
        } else {
            saldo = (int) (saldo - retirado);
        }
        return saldo;

    }   

    /**
     *
     * @return
     */
    @Override
    public float actualizarSaldo() {
        saldo = (int) (saldo*interesFijo);
        return saldo;
    }
    
    
}
