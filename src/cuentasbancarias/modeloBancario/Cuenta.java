/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentasbancarias.modeloBancario;

/**
 *
 * @author Borja
 */

//acc
public abstract class Cuenta {
    private int numeroDeCuenta;
    float saldo;
    private Cliente titular;

    public Cuenta() {
    }
    
    //acc
    public Cuenta(int numeroDeCuenta, float saldo, Cliente titular) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }
    
    //get accnumber
    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }
    
    //set accnumber
    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }
    
    //getBalance
    public float getSaldo() {
        return saldo;
    }
    
    //setBalance
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    //getAccOwner
    public Cliente getTitular() {
        return titular;
    }
    
    //setAccOwner
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    
    // deposit
    public void ingresar (float ingresar) {
        if (ingresar <= 0)
            System.out.println("El ingreso debe ser superior a cero euros");
        else
            saldo = saldo + ingresar;
    }
    
    //withdraw
    abstract public float retirar ();
    
    //update balance
    abstract public float actualizarSaldo ();
}
