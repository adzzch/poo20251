package Clasee7;

public class Impresion extends Producto {
    private String color;
    private Foto[] fotos;

    // Herencia de la clase madre (Producto)
    public Impresion(String nombre, double precio, String color, Foto[] fotos) {
        super(nombre, precio, 102);
        this.color = color;
        this.fotos = fotos;
    }

    public void print() {
        for (Foto foto : fotos) {
            System.out.println("Imprimiendo foto: " + foto.getFichero() + " a " + color);
        }
    }

    public String toString() {
        return super.toString() + ", Color " + color;
    }
}
