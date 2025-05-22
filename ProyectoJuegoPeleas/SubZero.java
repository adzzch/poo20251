import java.util.Random;
/**
 * Clase que representa a SubZero.
 * Tiene 3 habilidades y la última puede congelar al oponente un turno.
 */
class SubZero extends Personaje {
    private final String[] habilidades = {
        "Patada Deslizante - Daño: 16",
        "Golpe de Hielo - Daño: 20",
        "Bola de Hielo - Daño: 25 + congela 1 turno"
    };

    public SubZero(String nombre) {
        super(nombre, 130);
    }
    /**
     * Ataca usando una habilidad aleatoria.
     * La tercera habilidad congela al oponente.
     */

    @Override
    public void atacar(Personaje oponente) {
        Random rand = new Random();
        int indice = rand.nextInt(habilidades.length);
        String habilidad = habilidades[indice];
        int dano = 0;

        switch (indice) {
            case 0: dano = 16; break;
            case 1: dano = 20; break;
            case 2:
                dano = 25;
                System.out.println(oponente.getNombre() + " ha sido congelado y pierde su próximo turno.");
                // Lógica efecto congelar podría implementarse en gestión de turnos extendida
                break;
        }
        oponente.recibirDano(dano);
        System.out.println(this.nombre + " (Sub-Zero) usa " + habilidad + ", causando " + dano + " puntos de daño.");
    }
    
    @Override
    public String[] getHabilidades() {
        return habilidades.clone();
    }
}