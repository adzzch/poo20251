/**
 * Clase abstracta que representa un personaje en la lucha.
 * Cada personaje tiene un nombre, puntos de vida y habilidades.
 */
abstract class Personaje {
    protected String nombre;
    protected int puntosDeVida;
    public Personaje(String nombre, int puntosDeVida) {
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
    }

    /**
     * Ejecuta un ataque contra el oponente.
     * Selecciona una habilidad aleatoria y la usa.
     * 
     * @param oponente Otro personaje que recibe el ataque.
     */
    public abstract void atacar(Personaje oponente);

    /**
     * Devuelve las descripciones de las habilidades del personaje.
     * 
     * @return Array con descripciones de habilidades.
     */
    public abstract String[] getHabilidades();

    /**
     * Recibe daño, restando puntos de vida.
     * Puntos de vida no bajan de 0.
     * 
     * @param dano Cantidad de daño a recibir.
     */
    public void recibirDano(int dano) {
        this.puntosDeVida -= dano;
        if (this.puntosDeVida < 0) {
            this.puntosDeVida = 0;
        }
    }

    /**
     * Indica si el personaje sigue con vida (puntos de vida > 0).
     * 
     * @return true si está vivo.
     */
    public boolean estaVivo() {
        return this.puntosDeVida > 0;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getPuntosDeVida() {
        return this.puntosDeVida;
    }
}