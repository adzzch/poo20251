package Clasee7;

public class Cliente {
    private long cedula;
    private String nombre;

    public Cliente(long cedula, String nombre){
        this.cedula = cedula;
        this.nombre = nombre;
    }
    public String toString(){
        return "{ CC: " + cedula +
                " Nombre: " + nombre + "}";
 
    }
}
