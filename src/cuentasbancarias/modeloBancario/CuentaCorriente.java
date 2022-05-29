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

    private final float interesFijo = 0.15f;

    public CuentaCorriente(int numeroDeCuenta, int saldo, Cliente titular) {
        super(numeroDeCuenta, saldo, titular);
    }
    
    public void ingresar (float ingresar) {
        if (ingresar <= 0)
            System.out.println("El ingreso debe ser superior a cero euros");
        else
            saldo = (int) (saldo + ingresar);
    }
    
        
//no se exactamente como funciona la retirada de saldo de una cuenta correinte pero es posible
//que permita retirar dinero aunque te quedes en saldo negativo
// de todos modos este metodo le falta un parametro 
// el saldo que vas  retirar
    public float retirar (float ammountToSubstract) {  
        if ((saldo - ammountToSubstract)>=0) {
            System.out.println("No se puede tener saldo inferior a cero");
            return saldo;
        }

        System.out.println("Se ha procedido a retirar la cantidad indicada");
        return saldo - ammountToSubstract;

    }   
    
  
    @Override
    public float actualizarSaldo() {
        this.saldo = (int) ( saldo * interesFijo);
        return saldo;
    }

    
}
