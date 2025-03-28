package Clase6;

public class EjecutarComposicionAgregacion {
    public static void main(String[] args) {
        Cuenta objCuenta1 = new Cuenta(1024314, "Ahorros", 2000.0);
        Cuenta objCuenta2 = new Cuenta(202501255, "Corriente", 5000.0);

        Cliente objCliente1 = new Cliente(1012323113, "Byron Cano");
        Cliente objCliente2 = new Cliente(111242217, "Alejandro Zamora");

        Banco objBanco1 = new Banco("Bancarota", "Calle 5ta", objCuenta1);
        System.out.println(objBanco1);
        System.out.println(objBanco1.consultarCliente(objCliente2));
    }
}
