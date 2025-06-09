package org.archivos;

import java.io.File;
import java.io.FileInputStream;

public class FlujoBytes 
{
    // private static final String path = "logo Top-shop.jpg";

    private static final String path = "files/";

    public static void path()
    {
        File file = new File(path);
        System.out.println(file.getAbsolutePath());
    }

    public static void readBytes(String nameFile)
    {
        try (FileInputStream file = new FileInputStream(path + nameFile)) 
        {
            int code = file.read();
            int cont = 0;
            while (code != -1) 
            {
                cont++;
                System.out.println(code);
                code = file.read();    
            }
            System.out.println("Tamano : " + cont);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}
