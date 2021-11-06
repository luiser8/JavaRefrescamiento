package com.acl.decorator;

/**
 * @author Luis Rondon
 */
public class Queso extends ExtrasPizzas{

    public Queso(Pizza pizza){
        this.pizza = pizza;
    }
    
    @Override
    public String getDescripcion() {
        return pizza.getDescripcion() + ",  Queso";
    }

    @Override
    public double costo() {
        return pizza.costo();
    }
    
}
