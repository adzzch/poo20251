package Clasee7;
import java.util.*;

public class Pedido {
    private Cliente cliente;
    private Producto[] producto;
    private Date fecha;
    private int numeroTarjetaCredito;
    private int tarjetaOculta;

    //Constructor
    public Pedido(Cliente cliente, Producto[] producto, Date fecha, int numeroTarjetaCredito ){
        this.cliente = cliente;
        this.producto = producto;
        this.fecha = fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
        this.tarjetaOculta = numeroTarjetaCredito % 10000;
    }
    //Metodos
    public Cliente getCliente() {
        return cliente;
    }
    public Producto[] getProducto() {
        return producto;
    }

    public Date getFecha() {
        return fecha;
    }
    public int getNumeroTarjetaCredito() {
        return tarjetaOculta;
    }
    public int getTarjeta4Oculta() {
        return (int)(numeroTarjetaCredito % 10000);
    }
    
    public String toString() {
        return "Pedido {Cliente: " + cliente +
               ", Fecha: " + fecha +
               ", Tarjeta: ****" + getTarjeta4Oculta() +
               ", Productos: [" + listarProductos() + "]}";
    }
    
    
    private String listarProductos() {
        String lista = "";
        for (int i = 0; i < producto.length; i++) {
            lista += producto[i];
            if (i < producto.length - 1) lista += ", ";
        }
        return lista;
    }
    
}
