package Actividad;

import java.util.Scanner;

public class actividad {
    static String[] motosBajocc = new String[20];
    static String[] motosAltocc = new String[20];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        iniciarParqueadero();

        while (true) {
            System.out.println("Bienvenido a ParkingNow");
            System.out.println("Registre las placas de moto: ");
            System.out.println("Que Cilindraje es su moto?: ");
        }
    }
}
