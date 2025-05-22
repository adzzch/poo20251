import java.util.Random;

/**
 * Clase que representa a Raiden.
 * Tiene 3 habilidades de daño fijo.
 */
class Raiden extends Personaje {
    private final String[] habilidades = {
            "Puños Eléctricos - Daño: 20",
            "Patada Voladora - Daño: 24",
            "Tormenta de Rayos - Daño: 35"
    };

    public Raiden(String nombre) {
        super(nombre, 110);
    }

    /**
     * Ataca usando una habilidad aleatoria.
     */
    @Override
    public void atacar(Personaje oponente) {
        Random rand = new Random();
        int indice = rand.nextInt(habilidades.length);
        String habilidad = habilidades[indice];
        int dano = 0;
        switch (indice) {
            case 0:
                dano = 20;
                break;
            case 1:
                dano = 24;
                break;
            case 2:
                dano = 35;
                break;
        }
        oponente.recibirDano(dano);
        System.out.println(this.nombre + " (Raiden) usa " + habilidad + ", causando " + dano + " puntos de daño.");
    }

    @Override
    public String[] getHabilidades() {
        return habilidades.clone();
    }
}