package org.oop.animals;

public abstract class Mamifero extends Animal
{
    protected String tipoPelaje;

    public Mamifero(String nombre, int edad, String tipoPelaje) 
    {
        super(nombre, edad);
        this.tipoPelaje = tipoPelaje;
    }

    @Override
    public String toString() 
    {
        return super.toString() + " Tipo de pelaje: " + tipoPelaje;
    }
}
