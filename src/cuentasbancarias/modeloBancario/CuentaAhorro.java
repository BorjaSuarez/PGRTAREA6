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
    protected float saldoMinimo;
    
    public CuentaAhorro(float interesVariable, float saldoMinimo, int numeroDeCuenta, int saldo, Cliente titular) {
        super(numeroDeCuenta, saldo, titular);
        this.interesVariable = interesVariable;
        this.saldoMinimo = saldoMinimo;
    }

//esto es una sobrecarga de metodos
// fijate que elimine el parametro saldominino, pero que de igual manera lo inicializo dentro

     public CuentaAhorro(float interesVariable, int numeroDeCuenta, int saldo, Cliente titular) {
        super(numeroDeCuenta, saldo, titular);
        this.interesVariable = interesVariable;
        this.saldoMinimo = 500;
    }



// lo mimso que con la otra clase de la cuenta corriente, depende de lo que quieras hacer
// pero si va a retirar daele un valor por parametro

    public float retirar(float ammountToSubstract) {

        if ((saldo - ammountToSubstract) < saldoMinimo ) {
            System.out.println("No se puede retirar dinero por debajo del minimo de saldo");
            return this.saldo;
        } 

        //nada te impide usar un return an cualquier parte de tu funcion
        // en este caso el return superior sale una vez que se determina que no se puede retirar saldo
        // y devuleve el saldo que hay en la cuenta restante
        // el otro caso seria devolver el saldo que queda tras retirar la cantidad deseada
        // tambien no tiene mucho sentido que pueda retirar con una variable del tipo float si al final casteamos al valor entero que tiene el tipo saldo
        //

        this.saldo = (int) (saldo - ammountToSubstract);
        
        return saldo;

    }

// una buena practica aunque no es necesario
// es apuntar a las propiedades de la clase con la palabra reservada this
// esto te ayudara a estar 100%  de que apuntas a la propiedad y no a una variable parecida
// ademas permite a otros desarrolladores que no seas tu entender mejor tu codigo
    public float actualizarSaldo() {
        this.saldo = (int) (saldo*interesVariable);
        return saldo;
    } 
    
    }

    

