package com.acl.patrones;

/**
 * @author Luis Rondon
 */
public class Comisiones extends Cajero{
    @Override
    public double getComision() {
        double saldoComision = this.getSaldo() * 0.10;
        return this.setSaldo(this.getSaldo() + saldoComision);
    }
}
