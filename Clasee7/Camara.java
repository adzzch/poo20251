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

    // Getters básicos
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    // toString() en tu estilo consistente
    public String toString() {
        return super.toString() + // Usa toString() de Producto
               ", Marca: " + marca +
               ", Modelo: " + modelo;
    }

}
