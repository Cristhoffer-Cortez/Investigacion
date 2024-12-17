package com.mycompany.investigacion;

class Perro extends Animal implements Mascota {
    
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    // Implementación de métodos abstractos de Animal
    void Comer() {
        System.out.println(nombre + " está comiendo croquetas.");
    }

    void Dormir() {
        System.out.println(nombre + " está durmiendo en su caseta.");
    }

    // Implementación de métodos de la interfaz Mascota
    public void Jugar() {
        System.out.println(nombre + " está jugando con una rama.");
    }

    public void MostrarCariño() {
        System.out.println(nombre + " mueve la cola mostrando cariño.");
    }
    
}
