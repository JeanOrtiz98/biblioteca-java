package org.example.biblioteca;

public class Tesis extends MaterialBiblioteca {
    private String universidad;

    public Tesis() {}

    public Tesis(String titulo, String autor, int año, String universidad) {
        super(titulo, autor, año);
        this.universidad = universidad;
    }

    public String getUniversidad() { return universidad; }
    public void setUniversidad(String universidad) { this.universidad = universidad; }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Universidad: " + universidad);
    }
}
