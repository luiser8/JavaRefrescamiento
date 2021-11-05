package com.acl.prototype;

/**
 * @author Luis Rondon
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Bicicleta bicicleta = new BicicletaNueva();
        bicicleta.setBici(20);
        System.out.println("Bicicleta: " + bicicleta.getBicicleta());
    }
}
