package org.oop.animals;

public final class Tigre extends Mamifero implements Cazador 
{
    private String raza;

    public Tigre(String nombre, int edad, String tipoPelaje, String raza) 
    {
        super(nombre, edad, tipoPelaje);
        this.raza = raza;
    }

    @Override
    public void hacerSonido() 
    {
        System.out.println(nombre + " ruge ferozmente.");
    }

    @Override
    public void desplazar() 
    {
        System.out.println(nombre + " se mueve sigilosamente.");
    }

    @Override
    public void cazar() 
    {
        System.out.println(nombre + " acecha y caza a su presa.");
    }

    @Override
    public String toString() 
    {
        return super.toString() + ", Raza: " + raza;
    }
}

