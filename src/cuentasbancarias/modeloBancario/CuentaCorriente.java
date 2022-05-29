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
    
    // fixInteresRate
    static protected float interesFijo = 0.15f;

    Cliente c = new Cliente(321, "Antonio Suarez", "Calle Falsa", "987654321");
    
    //Checking Account
    public CuentaCorriente(int numeroDeCuenta, int saldo, Cliente titular) {
        super(numeroDeCuenta, saldo, titular);

    }
    
    
    

    @Override //Withdraw
    public float retirar() {
        //por completar
        return 0;
        //por completar
    }

    @Override //UpateBalance
    public float actualizarSaldo() {
    //
        
        
        return 0;
        //por completar
    }
    
    
}
