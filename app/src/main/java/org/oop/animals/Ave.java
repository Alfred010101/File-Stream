package org.oop.animals;

public abstract class Ave extends Animal 
{
    protected double envergaduraAlas;

    public Ave(String nombre, int edad, double envergaduraAlas) 
    {
        super(nombre, edad);
        this.envergaduraAlas = envergaduraAlas;
    }

    @Override
    public String toString() 
    {
        return super.toString() + ", Envergadura de alas: " + envergaduraAlas + " m";
    }
}

