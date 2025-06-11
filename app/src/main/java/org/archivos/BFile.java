package org.archivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

public class BFile 
{
    private static final String path = "files/";

    public static boolean save(Object obj, String name)
    {
        try (ObjectOutputStream file = new ObjectOutputStream
            (
                new FileOutputStream(path + name)
            )
        ) 
        {
            file.writeObject(obj);
            return true;
        } catch (FileNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, ex.toString(), "Error al guardar", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex)
        {
            JOptionPane.showMessageDialog(null, ex.toString(), "Error al guardar", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.toString(), "Error al guardar", JOptionPane.ERROR_MESSAGE);
        }

        return false;
    }

    public static Object load(String name)
    {
        try (ObjectInputStream file = new ObjectInputStream
            (
                new FileInputStream(path + name)
            )
        ) 
        {
            return file.readObject();            
        } catch (FileNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, ex.toString(), "Error al cargar", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex)
        {
            JOptionPane.showMessageDialog(null, ex.toString(), "Error al cargar", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.toString(), "Error al cargar", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
}
