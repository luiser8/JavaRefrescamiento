package com.acl.dependency;

/**
 * @author Luis Rondon
 */
public class Codigo implements ICerradura {

    @Override
    public void accionar() {
        System.out.println("Cerradura con Código");
    }
}
