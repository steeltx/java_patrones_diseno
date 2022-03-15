package com.ejemplo.patrones.singleton;

public class ConexionBDSingleton {
    
    private static ConexionBDSingleton instancia;
    
    private ConexionBDSingleton(){
        System.out.println("Conectandose a BD ...");
    }
    
    public static ConexionBDSingleton getInstancia(){
        if(instancia == null){
            instancia = new ConexionBDSingleton();
        }
        return instancia;
    }
}
