package com.acl.singleton;

/**
 * @author Luis Rondon
 */
public class Main {

    public static void main(String[] args) {
        Session sessionLuis = Session.obtenerInstancia();
        sessionLuis.setUser("luis rondon");
        System.out.println("SessionLuis, Usuario: " + sessionLuis.getUser());
        
        Session sessionMaria = Session.obtenerInstancia();
        sessionMaria.setUser("maria diaz");
        System.out.println("sessionMaria, Usuario: " + sessionMaria.getUser());
    }
}
