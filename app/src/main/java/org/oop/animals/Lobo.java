package org.oop.animals;

public final class Lobo extends Mamifero implements Cazador
{
    private String raza;

    public Lobo(String nombre, int edad, String tipoPelaje, String raza) 
    {
        super(nombre, edad, tipoPelaje);
        this.raza = raza;
    }

    public String getNombre() 
    {
        return nombre;
    }


    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    @Override
    public void hacerSonido() 
    {
        System.out.println(nombre + " dice: ¡Wooow!");
    }

    @Override
    public void desplazar() 
    {
        System.out.println(nombre + " corre sobre 4 patas.");
    }

    @Override
    public String toString() 
    {
        return super.toString() + ", Raza: " + raza;
    }

     @Override
    public void cazar() 
    {
        System.out.println(nombre + " acecha y caza a su presa.");
    }
}

