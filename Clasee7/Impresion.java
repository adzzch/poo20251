package Clasee7;

public class Impresion extends Producto {
    private String color;
    private Foto[] foto;

    public Impresion(int numero, String color, Foto[] foto) {
        super(numero);
        this.color = color;
        this.foto = foto;
    }
    public Impresion(int numero, String color) {
        this(numero, color, new Foto[0]);
    }

    public String getColor() {
        return color;
    }

    public Foto[] getFotos() {
        return foto.clone();
    }

}
