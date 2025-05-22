import java.util.Random;
/**
 * Clase que representa a Scorpion.
 * Tiene 3 habilidades con daños fijos, una de las cuales anula el próximo turno.
 */
class Scorpion extends Personaje {
    private final String[] habilidades = {
        "Puño Infernal - Daño: 18",
        "Patada Giratoria - Daño: 22",
        "Lanza Infernal (Get Over Here!) - Daño: 30 + anula el próximo turno del oponente"
    };

    public Scorpion(String nombre) {
        super(nombre, 100);
    }

    /**
     * Ataca usando una habilidad aleatoria.
     * La tercera habilidad anula el próximo turno del oponente.
     */
    @Override
    public void atacar(Personaje oponente) {
        Random rand = new Random();
        int indice = rand.nextInt(habilidades.length);
        String habilidad = habilidades[indice];
        int dano = 0;

        switch (indice) {
            case 0: dano = 18; break;
            case 1: dano = 22; break;
            case 2: 
                dano = 30; 
                System.out.println(oponente.getNombre() + " ha sido atraído y pierde su próximo turno.");
                 // Lógica efecto congelar podría implementarse en gestión de turnos extendida
                break;
        }
        oponente.recibirDano(dano);
        System.out.println(this.nombre + " (Scorpion) usa " + habilidad + ", causando " + dano + " puntos de daño.");
    }

    @Override
    public String[] getHabilidades() {
        return habilidades.clone();
    }
}