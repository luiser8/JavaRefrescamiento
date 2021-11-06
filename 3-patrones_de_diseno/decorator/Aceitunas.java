package com.acl.decorator;

/**
 * @author Luis Rondon
 */
public class Aceitunas extends ExtrasPizzas{

    public Aceitunas(Pizza pizza){
        this.pizza = pizza;
    }
    
    @Override
    public String getDescripcion() {
        return pizza.getDescripcion() + ",  Aceitunas";
    }

    @Override
    public double costo() {
        return pizza.costo() + .50;
    }
    
}
