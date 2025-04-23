package Clasee7;

import java.util.*;

public class Pedido {
    private Cliente cliente;
    private Producto[] producto;
    private Date fecha;
    private int numeroTarjetaCredito;
    private int tarjetaOculta;

    // Constructor
    public Pedido(Cliente cliente, Producto[] producto, Date fecha, int numeroTarjetaCredito) {
        this.cliente = cliente;
        this.producto = producto;
        this.fecha = fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
        this.tarjetaOculta = numeroTarjetaCredito % 10000;
    }

    // Metodos
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
        return (int) (numeroTarjetaCredito % 10000);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : producto) {
            total += p.getPrecio();
        }
        return total;
    }

    public String toString() {
        StringBuilder productosStr = new StringBuilder();
        for (Producto p : producto) {
            productosStr.append(String.format("%-30s", p.toString())).append("\n");
        }

        return String.format("Pedido\n" +
                "Cliente: %s\n" +
                "Fecha: %s\n" +
                "Tarjeta: ****%d\n" +
                "Productos:\n%s",
                cliente.toString(),
                fecha.toString(),
                getTarjeta4Oculta(),
                productosStr.toString());
    }

}
