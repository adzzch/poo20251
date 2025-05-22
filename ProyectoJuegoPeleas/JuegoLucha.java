/**
 * Clase que controla la logica del juego de lucha.
 */

public class JuegoLucha {
    private Personaje jugador1;
    private Personaje jugador2;
    private boolean jugador1SaltaTurno = false;
    private boolean jugador2SaltaTurno = false;



    public JuegoLucha(Personaje jugador1, Personaje jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    /**
     * Inicia la pelea y gestiona los turnos hasta que alguien pierde
     */

    public void iniciarPelea() {
        System.out.println("La pelea comienza entre " + jugador1.getNombre() + " y " + jugador2.getNombre() + "...");

        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            // Turno jugador 1, verificar si pierde turno especial
            if (jugador1SaltaTurno) {
                System.out.println(jugador1.getNombre() + " pierde este turno.");
                jugador1SaltaTurno = false;
            } else {
                turno(jugador1, jugador2);
            }
            if (jugador2.estaVivo()) {
                // Turno jugador 2
                if (jugador2SaltaTurno) {
                    System.out.println(jugador2.getNombre() + " pierde este turno.");
                    jugador2SaltaTurno = false;
                } else {
                    turno(jugador2, jugador1);
                }
            }
        }

        if (jugador1.estaVivo()) {
            System.out.println(jugador1.getNombre() + " ha ganado la pelea.");
        } else {
            System.out.println(jugador2.getNombre() + " ha ganado la pelea.");
        }
    }
    private void turno(Personaje atacante, Personaje defensor) {
        System.out.println("Turno de " + atacante.getNombre() + ". Puntos de vida de " + defensor.getNombre() + ": " + defensor.getPuntosDeVida());
        atacante.atacar(defensor);
        System.out.println(defensor.getNombre() + " ahora tiene " + defensor.getPuntosDeVida() + " puntos de vida.");
    }
}