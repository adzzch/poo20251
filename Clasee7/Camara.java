package Clasee7;

public class Camara extends Producto {
    
    //Atributos
    private String marca;
    private String modelo;

    public Camara(String nombre, double precio, String modelo, String marca) {
        super(nombre, precio, 101);
        this.marca = marca;
        this.modelo = modelo;
    }
    public String toString() {
        return super.toString() +
               ", Modelo: " + modelo +
               ", Marca: " + marca;
    }

}
