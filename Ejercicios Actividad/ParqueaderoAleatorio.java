import java.util.Scanner;

public class ParqueaderoAleatorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] bajosCC = new boolean[20];
        boolean[] altosCC = new boolean[10];
        String[] horasEntrada = new String[30];

        while (true) {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Registrar moto");
            System.out.println("2. Cobrar");
            System.out.println("3. Salir");
            System.out.print("Elige: ");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                // --- Validación de tipo (1 o 2) ---
                int tipo;
                do {
                    System.out.print("Tipo (1=Bajo CC / 2=Alto CC): ");
                    tipo = scanner.nextInt();
                    if (tipo < 1 || tipo > 2) {
                        System.out.println("Error: Solo 1 o 2 son válidos");
                    }
                } while (tipo < 1 || tipo > 2);  // Repite hasta que sea válido
                // ----------------------------------

                if (tipo == 1) {
                    System.out.print("Puestos Bajos CC [D=Libre, O=Ocupado]: ");
                    for (int i = 0; i < 20; i++) {
                        System.out.print((i+1) + (bajosCC[i] ? "O " : "D "));
                    }
                } else {
                    System.out.print("Puestos Altos CC [D=Libre, O=Ocupado]: ");
                    for (int i = 0; i < 10; i++) {
                        System.out.print((i+1) + (altosCC[i] ? "O " : "D "));
                    }
                }

                System.out.print("\nElige puesto: ");
                int puesto = scanner.nextInt();

                int horaEntradaMin = 420 + (int)(Math.random() * 901);
                String horaEntrada = String.format("%02d:%02d", horaEntradaMin / 60, horaEntradaMin % 60);
                System.out.println("Hora entrada generada: " + horaEntrada);

                boolean exito = false;
                if (tipo == 1 && puesto <= 20 && !bajosCC[puesto-1]) {
                    bajosCC[puesto-1] = true;
                    horasEntrada[puesto-1] = horaEntrada;
                    exito = true;
                } else if (tipo == 2 && puesto <= 10 && !altosCC[puesto-1]) {
                    altosCC[puesto-1] = true;
                    horasEntrada[20 + (puesto-1)] = horaEntrada;
                    exito = true;
                }
                System.out.println(exito ? "Éxito" : "Error, Este puesto está ocupado");
                
            } else if (opcion == 2) {
                // --- Validación de tipo (1 o 2) ---
                int tipo;
                do {
                    System.out.print("Tipo (1=Bajo CC / 2=Alto CC): ");
                    tipo = scanner.nextInt();
                    if (tipo < 1 || tipo > 2) {
                        System.out.println("Error: Solo 1 o 2 son válidos");
                    }
                } while (tipo < 1 || tipo > 2);
                // ----------------------------------

                System.out.print("Número de puesto: ");
                int puesto = scanner.nextInt();

                int index = (tipo == 1) ? puesto-1 : 20 + (puesto-1);
                String entrada = horasEntrada[index];
                if (entrada == null) {
                    System.out.println("Puesto no ocupado");
                    continue;
                }

                int entradaMin = convertirHoraAMinutos(entrada);
                int salidaMin = entradaMin + 1 + (int)(Math.random() * (1320 - entradaMin));
                if (salidaMin > 1320) salidaMin = 1320;
                String salida = String.format("%02d:%02d", salidaMin/60, salidaMin%60);
                System.out.println("Hora salida generada: " + salida);

                int duracion = salidaMin - entradaMin;
                int pago = (duracion > 60) ? 2000 : (duracion > 30) ? 800 : 0;
                System.out.println("Total a pagar: $" + pago);

                if (tipo == 1) bajosCC[puesto-1] = false;
                else altosCC[puesto-1] = false;
                horasEntrada[index] = null;

            } else if (opcion == 3) {
                System.out.println("Hasta luego");
                break;
            } else {
                System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }

    private static int convertirHoraAMinutos(String hora) {
        String[] partes = hora.split(":");
        return Integer.parseInt(partes[0]) * 60 + Integer.parseInt(partes[1]);
    }
}