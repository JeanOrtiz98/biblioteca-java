package org.example.biblioteca;

public class Main {

    public static void main(String[] args) {

        // Arreglo de tipo base
        MaterialBiblioteca[] materiales = new MaterialBiblioteca[3];

        // Guardar diferentes objetos
        materiales[0] = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, "Realismo mágico");
        materiales[1] = new Revista("National Geographic", "Varios", 2026, 120);
        materiales[2] = new Tesis("Ingenieria de Software", "Jean Ortiz - Juan Tovar", 2026, "FET");

        // Recorrer con for (POLIMORFISMO)
        for (int i = 0; i < materiales.length; i++) {
            System.out.println("----- MATERIAL " + (i + 1) + " -----");
            materiales[i].mostrarInfo();
            System.out.println();
        }
    }
}