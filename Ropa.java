
/**
 * Write a description of class Ropa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ropa extends Producto{
    private String tipo;
    private String talla;

    public Ropa() {
    }

    public Ropa(String tipo, String talla) {
        this.tipo = tipo;
        this.talla = talla;
    }
    
    public void mostrarDetalles() {
        System.out.println("Ropa - Tipo: " + tipo + ", Talla: " + talla);
    }
}
