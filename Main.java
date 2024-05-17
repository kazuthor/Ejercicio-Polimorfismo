
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main {
    public static void main(String[] args) {
        Producto libro = new Libro("El Gran Gatsby", "F. Scott Fitzgerald");
        Producto ropa = new Ropa("Camisa", "S");
        Producto electronico = new Electronico("Smartphone", "Motorola");

        libro.mostrarDetalles();
        ropa.mostrarDetalles();
        electronico.mostrarDetalles();
    }
    
}
