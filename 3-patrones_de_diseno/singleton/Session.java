package com.acl.singleton;

/**
 * @author Luis Rondon
 */
public class Session {

    private static Session session;
    private String usuario;

    public static Session obtenerInstancia() {
        if (null == session) {
            session = new Session();
        }
        return session;
    }

    public String getUser() {
        return usuario;
    }

    public void setUser(String usuario) {
        this.usuario = usuario;
    }
}
