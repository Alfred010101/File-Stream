package org.oop.animals;

import java.io.Serializable;

public abstract class Animal implements Serializable, Desplazar
{
    protected String nombre;
    protected int edad;

    public Animal(String nombre, int edad) 
    {
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract void hacerSonido();

    @Override
    public String toString() 
    {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}
