package Clasee7;
import java.util.Date;

public class EjecutarActividad {
    public static void main(String[] args) {

        Cliente objCliente1 = new Cliente(1112042217, "Daniel Zamora", "Cra69b Oeste #3-24", 3136656914l);

        Producto[] p = new Producto[2];
        p[0] = new Camara ("Camara", 4999.00 , "FJH-660", "Cannon");
        p[1] = new Impresion ("Impresion Fotos", 100.00, "A color", Foto[]);

        Foto[] fotos = {
            new Foto("familia.jpg"),
            new Foto("hongkong2006.jpg")};


        Pedido pedido = new Pedido(objCliente1,
                        new Date(), 78623421);

        System.out.println("Información del Pedido");
        System.out.println(pedido);
    }
}
// Falta realizar pago y cobrar todo