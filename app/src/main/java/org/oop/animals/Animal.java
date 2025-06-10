package org.oop.animals;

public abstract class Animal implements Desplazar
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
