package org.test;

import java.util.List;

import org.archivos.FlujoCaracteres;

public class TestFlujoCaracteres 
{
    public static void exec()
    {
        FlujoCaracteres.path();
        String[] data = 
        {
            "parrafo 9\n",
            "parrafo 10\nparrafo 11\n",
            "parrafo 12:)\n"
        };
        FlujoCaracteres.writeEndByLine("flujo-caracteres", data);
        List<String> value = FlujoCaracteres.readByLine("flujo-caracteres");
        
        value.forEach(System.out::print);        
    }
}
