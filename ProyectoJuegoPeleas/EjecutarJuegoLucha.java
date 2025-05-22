import java.util.Scanner;

/**
 * Clase principal que gestiona el juego de lucha.
 * Permite a los jugadores elegir personajes y realizar una pelea.
 */
public class EjercurtadorJuegoLucha {
    // Arreglo que contiene la información de los personajes y sus habilidades
    private static final String[][] personajes = {
        {
            "Scorpion - Zoner / Rushdown - 100 HP",
            "Puño Infernal / Un golpe potenciado con fuego directo al torso. Daño: 18",
            "Patada Giratoria / Gira con una patada baja que derriba al oponente. Daño: 22",
            "Lanza Infernal (\"Get Over Here!\") / Especial: Lanza su cadena, atrae al enemigo y lo deja expuesto. Daño: 30 + anula el próximo turno del oponente"
        },
        {
            "Sub-Zero - Zoner / Tank - 130 HP",
            "Patada Deslizante / Se lanza por el suelo tumbando al rival. Daño: 16",
            "Golpe de Hielo / Impacto con puño helado que ralentiza al oponente. Daño: 20",
            "Bola de Hielo / Especial: Congela al enemigo completamente. Daño: 25 + congela 1 turno"
        },
        {
            "Raiden - Balanceado / Zoner - 110 HP",
            "Puños Eléctricos / Serie de golpes cargados con electricidad. Daño: 20",
            "Patada Voladora / Se lanza a toda velocidad golpeando en línea recta. Daño: 24",
            "Tormenta de Rayos / Especial: Invoca rayos sobre el enemigo. Daño: 35"
        },
        {
            "Liu Kang - Rushdown / Glass Cannon - 90 HP",
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
            // Solicitar el nombre del jugador 1
            System.out.print("Introduce el nombre del jugador 1: ");
            String nombre1 = scanner.nextLine();
            // Solicitar el nombre del jugador 2
            System.out.print("Introduce el nombre del jugador 2: ");
            String nombre2 = scanner.nextLine();

             // Mostrar opciones de personajes para el jugador 1
            System.out.println("Elige un personaje para " + nombre1 + ":");
            mostrarPersonajes();
            int eleccion1 = obtenerEleccion(scanner); // Obtener elección del jugador 1
            Personaje jugador1 = crearPersonaje(eleccion1, nombre1); // Crear personaje para jugador 1
            // Mostrar opciones de personajes para el jugador 2
            System.out.println("Elige un personaje para " + nombre2 + ":");
            mostrarPersonajes();
            int eleccion2 = obtenerEleccion(scanner); // Obtener elección del jugador 2
            Personaje jugador2 = crearPersonaje(eleccion2, nombre2); // Crear personaje para jugador 2
            // Iniciar el juego con los personajes seleccionados
            JuegoLucha juego = new JuegoLucha(jugador1, jugador2);
            juego.iniciarPelea();
        } finally {
            scanner.close(); // Cerrar el scanner para evitar fugas de recursos
        }
    }

    
}
   