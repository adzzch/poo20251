package Clasee7;
import java.util.Date;

public class EjecutarActividad {
    public static void main(String[] args) {

        Cliente objCliente1 = new Cliente(1112042217, "Daniel Zamora", "Cra69b Oeste #3-24", 3136656914l);

        Producto objProducto1 = new Producto(101);

        Foto[] f = { new Foto("familia.jpg"), new Foto("hongkong2006.jpg")};


        Pedido pedido = new Pedido(objCliente1,
                        new Date(), 78623421);

        System.out.println("Información del Pedido");
        System.out.println(pedido);
    }
}
// Falta realizar pago y cobrar todo