package com.acl.basico;

/**
 * @author Luis
 */
public class Car extends Vehiculo {

    public void GetCar() {
        System.out.println("Modelo : " + this.model);
    }

    public void SetCar(String model) {
        this.Set(model);
    }
}
