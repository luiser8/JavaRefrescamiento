package com.acl.decorator;

/**
 * @author Luis Rondon
 */
public class Margarita extends Pizza{

    public Margarita(){
        descripcion = "Pizza Margarita";
    }
    @Override
    public double costo() {
        return 10.20;
    }   
}
