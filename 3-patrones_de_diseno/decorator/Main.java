package com.acl.decorator;

/**
 * @author Luis Rondon
 */
public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Margarita();
        Pizza quesoPizza = new Queso(pizza);
        Pizza aceitunasPizza = new Aceitunas(quesoPizza);
        
        System.out.println(aceitunasPizza.getDescripcion() + " $ " + aceitunasPizza.costo());
    }
}
