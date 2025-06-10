package org.oop.animals;

public class Paloma extends Ave 
{

    public Paloma(String nombre, int edad, double envergaduraAlas) 
    {
        super(nombre, edad, envergaduraAlas);
    }

    @Override
    public void hacerSonido() 
    {
        System.out.println(nombre + " hace un suave arrullo.");
    }

    @Override
    public void desplazar() 
    {
        System.out.println(nombre + " vuela en bandadas por la ciudad.");
    }
}

