package com.mycompany.investigacion;

public class Pez extends Animal {
    public Pez(String nombre, int edad) {
        super(nombre, edad);
    }

    // Implementación de métodos abstractos de Animal
    void Comer() {
        System.out.println(nombre + " está comiendo hojuelas.");
    }

    void Dormir() {
        System.out.println(nombre + " está descansando flotando en el agua.");
    }
}
