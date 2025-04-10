package Clasee7;
import java.util.Date;

public class EjecutarActividad {
    public static void main(String[] args) {

        Cliente objCliente1 = new Cliente(1112042217, "Daniel Zamora");

        Producto objProducto1 = new Producto(101);

        Camara objCamara1 = new Camara(665, "Sony", "ZRG-606");

        Foto[] f = { new Foto("familia.jpg"), new Foto("hongkong2006.jpg")};

        Impresion objImpresion1 = new Impresion (601, "Color", f);

        Producto[] productosPedido = {objProducto1, objCamara1, objImpresion1};

        Pedido pedido = new Pedido(objCliente1, productosPedido, new Date(), 78623421);

        System.out.println("Información del Pedido");
        System.out.println(pedido);
        System.out.println("Fotos a Imprimir");
        objImpresion1.imprimirTodasFotos();
    }
}
