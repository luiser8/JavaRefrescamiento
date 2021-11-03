package com.acl.basico;

/**
 * @author Luis Rondon
 */
public class Vehiculo {
    public String model = "Toyota";

    public void Get() {
        System.out.println("Modelo : " + this.model);
    }
    public void Set(String model) {
        this.model = model;
    }
}
