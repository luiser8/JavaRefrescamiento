package com.acl.patrones;

/**
 * @author Luis Rondon
 */
public abstract class Cajero {
    private double saldo;
    
    public double getSaldo() {
        return saldo;
    }
    
    public double setSaldo(double saldo) {
       return this.saldo = saldo;
    }
 
    public abstract double getComision();
}
