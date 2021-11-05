package com.acl.prototype;

/**
 * @author Luis Rondon
 */
public abstract class Bicicleta implements Cloneable{
    private int rin;
    
    public Bicicleta clone() throws CloneNotSupportedException{
        return (Bicicleta) super.clone();
    }
    
    public abstract int getBicicleta();
    
    public int getBici(){
        return rin;
    }
    
    public int setBici(int rin){
        return this.rin = rin;
    }
}
