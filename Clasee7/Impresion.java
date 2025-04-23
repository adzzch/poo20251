package Clasee7;

public class Impresion extends Producto {
    private String color;
    private String[] fotos;

    public Impresion(String nombre, double precio, String color, String[] fotos) {
        super(nombre, precio, 102);
        this.color = color;
        this.fotos = fotos;
    }
    public void print() {
        for (String foto : fotos) {
            System.out.println("Imprimiendo foto" + foto + " en color: " + color);
        }
    }
    public String toString() {
        return super.toString() + ", Color " + color;
    }
}
