package com.acl.dependency;

/**
 * @author Luis Rondon
 */
public class Puerta {

    private final ICerradura cerradura;

    public Puerta(ICerradura iCerradura) {
        cerradura = iCerradura;
    }

    public void usar() {
        cerradura.accionar();
    }
}
