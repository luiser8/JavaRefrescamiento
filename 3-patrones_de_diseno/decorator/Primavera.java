package com.acl.decorator;

/**
 * @author Luis Rondon
 */
public class Primavera extends Pizza{
    public Primavera(){
        descripcion = "Pizza Primavera";
    }
    @Override
    public double costo() {
        return 12.20;
    }
    
}
