package org.archivos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FlujoCaracteres 
{
    // private static final StringBuilder path = new StringBuilder("files/");
    private static final String path = "files/";

    public static void path()
    {
        File file = new File(path);
        System.out.println(file.getAbsolutePath());
    }

    public static void write(String nameFile, String[] data) 
    {
        try(FileWriter file = new FileWriter(path + nameFile))
        {
            for(int i = 0; i < data.length; i++)
            {
                file.append(data[i]);
            }
        }catch(IOException e)
        {
            System.out.println(e.toString());
        }
    }

    public static void writeEnd(String nameFile, String[] data) 
    {
        List<String> value = FlujoCaracteres.read(nameFile);

        try(FileWriter file = new FileWriter(path + nameFile))
        {
            for (String string : value) 
            {
                file.append(string);
            }

            for(int i = 0; i < data.length; i++)
            {
                file.append(data[i]);
            }
        }catch(IOException e)
        {
            System.out.println(e.toString());
        }
    }

    public static List<String> read(String nameFile) 
    {
        List<String> data = new ArrayList<>();

        try(FileReader file = new FileReader(path + nameFile))
        {
            int code = file.read();
            StringBuilder stringBuilder = new StringBuilder();

            while(code != -1)
            {
                if(code != '\n')
                {
                    stringBuilder.append((char)code);                    
                }else
                {
                    data.add(stringBuilder.append('\n').toString());
                    stringBuilder = new StringBuilder();
                }
                code = file.read();
            }
        }catch(IOException e)
        {
            System.out.println(e.toString());
        }

        return data;
    }
}
