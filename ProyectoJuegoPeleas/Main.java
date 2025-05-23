import java.util.Scanner;

public class Main {
    private static final String[][] personajes = {
            // Arreglo que contiene la información de los personajes y sus habilidades
            {
                    "Scorpion - Zoner / Rushdown - 100 HP",
                    "Puño Infernal/ Un golpe potenciado con fuego directo al torso. Daño: 18",
                    "Patada Giratoria/ Gira con una patada baja que derriba al oponente. Daño: 22",
                    "Lanza Infernal (\"Get Over Here!\") / Especial: Lanza su cadena, atrae al enemigo y lo deja expuesto. Daño: 30 + anula el próximo turno del oponente"
            },
            {
                    "Sub-Zero  Zoner / Tank / 130 HP",
                    "Patada Deslizante / Se lanza por el suelo tumbando al rival. Daño: 16",
                    "Golpe de Hielo / Impacto con puño helado que ralentiza al oponente. Daño: 20",
                    "Bola de Hielo / Especial: Congela al enemigo completamente. Daño: 25 + congela 1 turno"
            },
            {
                    "Raiden / Balanceado / Zoner / 110 HP",
                    "Puños Eléctricos / Serie de golpes cargados con electricidad. Daño: 20",
                    "Patada Voladora / Se lanza a toda velocidad golpeando en lí nea recta. Daño: 24",
                    "Tormenta de Rayos / Especial: Invoca rayos sobre el enemigo. Daño: 35"
            },
            {
                    "Liu Kang - Rushdown / Glass Cannon / 90 HP",
                    "Patada Bicicleta - Golpea al enemigo repetidamente en el aire. Daño: 26",
                    "Combo Shaolin - Cadena de tres golpes veloces. Daño: 22",
                    "Dragón de Fuego - Especial: Lanza una bola de fuego explosiva o se transforma brevemente. Daño: 38"
            },
            {
                    "Kitana - Zoner / Mix-up - 95 HP",
                    "Corte de Abanico - Ataque corto y veloz con abanicos metálicos. Daño: 17",
                    "Tornado de Viento - Ataque giratorio aéreo que confunde al oponente. Daño: 20",
                    "Lanzamiento de Abanicos - Especial: Lanza varios abanicos con precisión mortal. Daño: 28"
            }
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Introduce el nombre del jugador 1: ");
            String nombre1 = scanner.nextLine();
            System.out.print("Introduce el nombre del jugador 2: ");
            String nombre2 = scanner.nextLine();

            System.out.println("Elige un personaje para " + nombre1 + ":");
            mostrarPersonajes();
            int eleccion1 = obtenerEleccion(scanner);
            Personaje jugador1 = crearPersonaje(eleccion1, nombre1);
            System.out.println("Elige un personaje para " + nombre2 + ":");
            mostrarPersonajes();
            int eleccion2 = obtenerEleccion(scanner);
            Personaje jugador2 = crearPersonaje(eleccion2, nombre2);

            JuegoLucha juego = new JuegoLucha(jugador1, jugador2);
            juego.iniciarPelea();
        } finally {
            scanner.close();
        }
    }

    private static void mostrarPersonajes() {
        for (int i = 0; i < personajes.length; i++) {
            System.out.println((i + 1) + ". " + personajes[i][0]);
            for (int j = 1; j < personajes[i].length; j++) {
                System.out.println("   - " + personajes[i][j]);
            }
        }
    }

    private static Personaje crearPersonaje(int eleccion, String nombre) {
        switch (eleccion) {
            case 1:
                return new Scorpion(nombre);
            case 2:
                return new SubZero(nombre);
            case 3:
                return new Raiden(nombre);
            case 4:
                return new LiuKang(nombre);
            case 5:
                return new Kitana(nombre);
            default:
                System.out.println("Elección no válida, se asignará a Scorpion por defecto.");
                return new Scorpion(nombre);
        }
    }

    private static int obtenerEleccion(Scanner scanner) {
        int eleccion = -1;
        while (eleccion < 1 || eleccion > 5) {
            System.out.print("Elige un personaje (1-5): ");
            if (scanner.hasNextInt()) {
                eleccion = scanner.nextInt();
                if (eleccion < 1 || eleccion > 5) {
                    System.out.println("Por favor, elige un número entre 1 y 5.");
                }
            } else {
                System.out.println("Entrada no válida. Por favor, ingresa un número.");
                scanner.next(); // Limpiar entrada no válida
            }
        }
        return eleccion;
    }
}