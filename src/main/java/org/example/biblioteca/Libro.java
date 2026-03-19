package org.example.biblioteca;

public class Libro extends MaterialBiblioteca {
    private String genero;

    public Libro() {}

    public Libro(String titulo, String autor, int año, String genero) {
        super(titulo, autor, año);
        this.genero = genero;
    }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Género: " + genero);
    }
}
