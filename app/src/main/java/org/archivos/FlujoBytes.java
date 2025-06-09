package org.archivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FlujoBytes 
{
    // private static final String path = "logo Top-shop.jpg";

    private static final String path = "files/";

    public static void path()
    {
        File file = new File(path);
        System.out.println(file.getAbsolutePath());
    }

    public static List<Integer> readBytes(String nameFile)
    {
        List<Integer> flujoBytes = new ArrayList<>();

        try (FileInputStream file = new FileInputStream(path + nameFile)) 
        {
            int code = file.read();
            int cont = 0;
            while (code != -1) 
            {
                cont++;
                flujoBytes.add(code);
                code = file.read();  
            }
            System.out.println("Tamano : " + cont);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return flujoBytes;
    }

    public static void writeBytes(String nameFile, List<Integer> data)
    {
        try (FileOutputStream file = new FileOutputStream(path + nameFile))
        { 
            for (Integer integer : data) 
            {
                file.write(integer);   
            }     
        } catch (Exception e) 
        {
            System.out.println(e.toString());
        }        
    }

}
 