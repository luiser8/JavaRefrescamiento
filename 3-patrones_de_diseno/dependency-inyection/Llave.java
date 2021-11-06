package com.acl.dependency;

/**
 * @author Luis Rondon
 */
public class Llave implements ICerradura {

    @Override
    public void accionar() {
        System.out.println("Cerradura con Llave");
    }
}
