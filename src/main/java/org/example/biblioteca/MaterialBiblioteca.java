package org.example.biblioteca;

public class MaterialBiblioteca {
    private String titulo;
    private String autor;
    private int año;

    // Constructor vacío
    public MaterialBiblioteca() {}

    // Constructor con parámetros
    public MaterialBiblioteca(String titulo, String autor, int año) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
    }

    // Getters y Setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public int getAño() { return año; }
    public void setAño(int año) { this.año = año; }

    // Método mostrarInfo
    public void mostrarInfo() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Año: " + año);
    }
}
