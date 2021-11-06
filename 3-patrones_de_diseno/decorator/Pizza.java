package com.acl.decorator;

/**
 * @author Luis Rondon
 */
public abstract class Pizza {
    String descripcion = "Pizza basica";
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public abstract double costo();
}
