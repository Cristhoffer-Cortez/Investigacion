package com.mycompany.investigacion;

public class Investigacion {

    public static void main(String[] args) {
        Perro miPerro = new Perro("Rex", 5);
        System.out.println("Acciones de " + miPerro.nombre + ":");
        miPerro.Comer();
        miPerro.Dormir();
        miPerro.Jugar();
        miPerro.MostrarCariño();

        System.out.println("");

        // Crear un pez
        Pez miPez = new Pez("Nemo", 2);
        System.out.println("Acciones de " + miPez.nombre + ":");
        miPez.Comer();
        miPez.Dormir();
    }
}
