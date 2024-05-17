
/**
 * Write a description of class Electrónico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Libro extends Producto {
    private String titulo;
    private String autor;

    public Libro() {
    }

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void mostrarDetalles() {
        System.out.println("Libro - Título: " + titulo + ", Autor: " + autor);
    }
}