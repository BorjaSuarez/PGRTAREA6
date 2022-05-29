/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentasbancarias.modeloBancario;

/**
 *
 * @author Borja
 */

// Savings account
public class CuentaAhorro extends Cuenta {
    
    // variableInterestRate
    protected float interesVariable;
    
    //minBalance
    protected float saldoMinimo;
    
    // Savings account
    public CuentaAhorro(int numeroDeCuenta, float saldo, Cliente titular) {
        super(numeroDeCuenta, saldo, titular);
    }    
    // Funcionara el pull?? 
    //Withdraw
    public float retirar() {
        float retirado = 0;
        
        if (saldoMinimo>retirado) {
            System.out.println("No se puede retirar dinero por debajo del minimo de saldo");
        } else {
            saldo = saldo - retirado;
        }
        return saldo;

    }
    // Update Balance
    @Override
    public float actualizarSaldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    }

    

