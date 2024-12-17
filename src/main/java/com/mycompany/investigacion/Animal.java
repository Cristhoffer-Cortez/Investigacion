package com.mycompany.investigacion;

abstract class Animal {
    String nombre;
    int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    abstract void Comer();
    
    abstract void Dormir();
}
