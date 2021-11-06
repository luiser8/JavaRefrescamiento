package com.acl.dependency;

/**
 * @author Luis Rondon
 */
public class Main {

    public static void main(String[] args) {
        Llave llave = new Llave();
        Puerta puerta = new Puerta(llave);
        puerta.usar();

        Codigo codigo = new Codigo();
        puerta = new Puerta(codigo);
        puerta.usar();
    }
}
