package com.acl.patrones;

/**
 * @author Luis Rondon
 */
public class Main {
    public static void main(String[] args) {
        
        Cajero cajero = Factoria.getSaldo();
        cajero.setSaldo(10.20);
        cajero.getComision();
        System.out.println("Saldo: " + cajero.getSaldo());
    }
}
