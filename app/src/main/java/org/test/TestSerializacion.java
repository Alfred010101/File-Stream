package org.test;

import java.util.List;
import java.util.stream.Collectors;

import org.archivos.BFile;
import org.oop.animals.Aguila;
import org.oop.animals.Animal;
import org.oop.animals.Cazador;
import org.oop.animals.Lobo;
import org.oop.animals.Paloma;
import org.oop.animals.Tigre;
import org.oop.animals.Vaca;

public class TestSerializacion 
{
    private static final String nameFile = "animales.dat";
    
    @SuppressWarnings("unchecked")
    public static void exec()
    {
        List<Animal> animales = createListOfAnimals();

        System.out.println("Estos son nuestros animales...");
        animales.forEach(System.out::println);

        if ( ! BFile.save(animales, nameFile) )
            System.exit(5);
        
        Object object = BFile.load(nameFile);

        if(object == null)
            System.exit(6);
        if ((object instanceof List<?> lista)) 
        {
            if(!lista.isEmpty())
                if(!lista.stream().allMatch(a -> a instanceof Animal))
                    System.exit(7);  
            animales = (List<Animal>)object;
        }
        else
            System.exit(8);
        
        List<Cazador> cazadores = animales.stream()
            .filter(a -> a instanceof Cazador)
            .map(a -> (Cazador) a)
            .collect(Collectors.toList());

        cazadores.add(new Lobo("lobito x2", 5, "fino", "mx") );

        System.out.println("\nEstos son nuestros cazadores...");
        cazadores.forEach(Cazador::cazar);
        
    }

    private static List<Animal> createListOfAnimals()
    {
        return List.of(
            new Lobo("lobito", 5, "fino", "mx"),
            new Tigre("Simba", 4, "Denso", "Vengala"),
            new Aguila("Águila Real", 5, 2.1),
            new Aguila("Calva", 7, 2.5),
            new Paloma("Mensajera", 2, 0.8),
            new Paloma("Blanca", 3, 0.75),
            new Vaca("Echo", 6, "Brillante"),
            new Aguila("Imperial", 6, 2.4),
            new Paloma("Gris", 1, 0.6)
        );
    }
}
