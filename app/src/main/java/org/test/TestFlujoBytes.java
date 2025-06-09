package org.test;

import java.util.List;

import org.archivos.FlujoBytes;

public class TestFlujoBytes 
{
    public static void exec()
    {
        List<Integer> flujoBytes = FlujoBytes.readBytes("logo Top-shop.jpg");
        FlujoBytes.writeBytes("logo-Top-shop-copia.jpg", flujoBytes);
    }
}
