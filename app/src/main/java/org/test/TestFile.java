package org.test;

import java.io.File;
import java.util.Arrays;

public class TestFile 
{
    public static void exec()
    {
        File file = new File("./");
        
        System.out.println("Ruta absoluta:" + file.getAbsolutePath());
        
        if( file.isDirectory() )
        {
            System.out.println("listando ruta...");
            System.out.println(Arrays.toString(file.list()));
            Arrays.asList(file.list())
                .forEach(System.out::println);
            Arrays.stream(file.list())
                .forEach(System.out::println);
        }else
            System.exit(1);
        
    }
}
