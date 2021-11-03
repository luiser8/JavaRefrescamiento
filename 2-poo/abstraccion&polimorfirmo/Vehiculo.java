package com.acl.basico;

/**
 * @author Luis Rondon
 */
public class Vehiculo extends Methods{
    public String model = "Toyota";

    //Cumpliendo la abstraccion con los metodos Get, Set
    public void Get() {
        System.out.println("Modelo : " + this.model);
    }
    public void Set(String model) {
        this.model = model;
    }
}
