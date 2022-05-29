/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentasbancarias.modeloBancario;

/**
 *
 * @author Borja
 */


public class CuentaAhorro extends Cuenta {
      
    protected float interesVariable;
    protected float saldoMinimo = 500;
    
    Cliente ca = new Cliente(123, "Borja Suarez", "Calle Falsa", "123456789");
    
    public CuentaAhorro(float interesVariable, float saldoMinimo, int numeroDeCuenta, int saldo, Cliente titular) {
        super(numeroDeCuenta, saldo, titular);
        this.interesVariable = interesVariable;
        this.saldoMinimo = saldoMinimo;
    }

    public float retirar() {
        float retirado = 0;
        
        if ((saldo - retirado)<saldoMinimo) {
            System.out.println("No se puede retirar dinero por debajo del minimo de saldo");
        } else {
            saldo = (int) (saldo - retirado);
        }
        return saldo;

    }

    public float actualizarSaldo() {
        saldo = (int) (saldo*interesVariable);
        return saldo;
    } 
    
    }

    

