package Clase6;

public class Banco {
    private String nombre;
    private String direccion;
    private Cuenta cuenta;

    public Banco(String nombre, String direccion, Cuenta cuenta) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuenta = cuenta;
    }

    public String consultarCliente(Cliente cliente) {
        return cliente.toString();
    }

    public String toString() {
        return "Banco: " + nombre +
                " Dirección: " + direccion +
                " Cuenta: " + cuenta + "}";
    }
}
