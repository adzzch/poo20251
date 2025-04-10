package Clasee7;

public class Camara extends Producto {
    
    //Atributos
    private String marca;
    private String modelo;

    public Camara(int numero, String marca, String modelo) {
        super(numero);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String toString() {
        return super.toString() +
               ", Marca: " + marca +
               ", Modelo: " + modelo;
    }

}
