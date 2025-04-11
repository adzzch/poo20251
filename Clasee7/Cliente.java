package Clasee7;

public class Cliente {
    private long cedula;
    private String nombre;
    private String direccion;
    private long telefono;

    public Cliente(long cedula, String nombre, String direccion, long telefono){
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    public String toString(){
        return nombre +
                ", CC: " + cedula + 
                ", Dirección " + direccion +
                ", Telefono " + telefono + ".";
 
    }
}
