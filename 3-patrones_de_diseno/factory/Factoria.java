package com.acl.patrones;

/**
 * @author Luis Rondon
 */
public class Factoria {

    public static Cajero getSaldo() {
        return new Comisiones();
    }
}
