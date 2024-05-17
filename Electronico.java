
/**
 * Write a description of class Libro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Electronico extends Producto {
    private String nombre;
    private String marca;

    public Electronico() {
    }

    public Electronico(String nombre, String marca) {
        this.nombre = nombre;
        this.marca = marca;
    }
    
    public void mostrarDetalles() {
        System.out.println("Electrónico - Nombre: " + nombre + ", Marca: " + marca);
    }

}
