package org.oop.animals;

public class Aguila extends Ave implements Cazador 
{

    public Aguila(String nombre, int edad, double envergaduraAlas) 
    {
        super(nombre, edad, envergaduraAlas);
    }

    @Override
    public void hacerSonido() 
    {
        System.out.println(nombre + " emite un fuerte chillido.");
    }

    @Override
    public void desplazar() 
    {
        System.out.println(nombre + " vuela alto y rápido.");
    }

    @Override
    public void cazar() 
    {
        System.out.println(nombre + " caza pequeñas presas con sus garras.");
    }
}

