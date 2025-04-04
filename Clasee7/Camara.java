package Clasee7;

public class Camara extends Producto {
    //Atributos
    private String marca;
    private String modelo;

    public Camara (String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }

}
