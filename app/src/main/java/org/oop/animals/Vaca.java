package org.oop.animals;

public class Vaca extends Mamifero 
{

    public Vaca(String nombre, int edad, String tipoPelaje) {
        super(nombre, edad, tipoPelaje);
    }

    @Override
    public void hacerSonido() 
    {
        System.out.println(nombre + " hace: ¡Muu!");
    }

    @Override
    public void desplazar() 
    {
        System.out.println(nombre + " camina lentamente.");
    }

    @Override
    public String toString() 
    {
        return super.toString() + " Soy una vaca";
    }
}

