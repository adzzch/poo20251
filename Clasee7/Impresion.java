package Clasee7;

public class Impresion extends Producto {
    private String color;
    private Foto[] foto;

    public Impresion(int numero, String color, Foto[] fotos) {
        super(numero);
        this.color = color;
        this.foto = fotos != null ? fotos : new Foto[0];
    }
    public void imprimirTodasFotos() {
        for (Foto foto : foto) {
            foto.print();
        }
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
