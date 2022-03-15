package com.ejemplo.patrones.singleton;

public class EjemploSingleton {

    public static void main(String[] args) {

        ConexionBDSingleton con = ConexionBDSingleton.getInstancia();

        for (int i = 0; i < 10; i++) {
            con = ConexionBDSingleton.getInstancia();
            System.out.println("con = " + con);
        }
        ConexionBDSingleton con2 = ConexionBDSingleton.getInstancia();
        ConexionBDSingleton con3 = ConexionBDSingleton.getInstancia();
        boolean b1 = ((con == con2) && (con2 == con3));
        System.out.println("b1 = " + b1);
    }
}
