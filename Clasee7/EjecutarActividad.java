package Clasee7;
import java.util.Date;

public class EjecutarActividad {
    public static void main(String[] args) {

        Cliente objCliente1 = new Cliente(1112042217, "Daniel Zamora", "Cra69b Oeste #3-24", 3136656914l);


        Foto[] fotos = new Foto[2];
        fotos[0] = new Foto("familia.jpg");
        fotos[1] = new Foto("hongkong2006.jpg");


        Producto[] productos = new Producto[2];
        productos[0] = new Camara ("Camara", 4999.00 , "FJH-660", "Cannon");
        productos[1] = new Impresion ("Impresion Fotos", 100.00, "A color", fotos);


        Pedido pedido = new Pedido(objCliente1, productos, new Date(), 8813212);


        double total = pedido.calcularTotal();


        System.out.println("------Información del Pedido------");
        System.out.println(pedido);
        System.out.println("------Total------");
        System.out.println("Total a pagar: " + total);
    }
}
// Falta realizar pago y cobrar todo