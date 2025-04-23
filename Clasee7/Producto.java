package Clasee7;

public class Producto {
    private String nombre;
    private double precio;
    private int numero;

    public Producto(String nombre, double precio, int numero) {
        this.nombre = nombre;
        this.precio = precio;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getNumero() {
        return numero;
    }

    public String toString() {
        return nombre + ", Precio: $" + precio + ", Codigo del producto: " + numero;
    }
}
