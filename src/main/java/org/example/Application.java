package org.example;


import org.example.utility.Injector;

public class Application

{
    public static void main( String[] args )
    {
        Injector.startApplication(Application.class);
        Injector.getService(selectionProcess.class).process();
    }
}
