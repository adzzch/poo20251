import java.util.Random;

public class LiuKang extends Personaje {
    private final String[] habilidadesLocal = {
        "Patada Bicicleta - Daño: 26",
        "Combo Shaolin - Daño: 22",
        "Dragón de Fuego - Daño: 38"
    };

    public LiuKang(String nombre) {
        super(nombre, 90); // Solo pasa nombre y puntos de vida
    }

    @Override
    public void atacar(Personaje oponente) {
        Random rand = new Random();
        int habilidadIndex = rand.nextInt(habilidadesLocal.length);
        String habilidad = habilidadesLocal[habilidadIndex];
        int dano = 0;

        switch (habilidadIndex) {
            case 0: // Patada Bicicleta
                dano = 26;
                break;
            case 1: // Combo Shaolin
                dano = 22;
                break;
            case 2: // Dragón de Fuego
                dano = 38;
                break;
        }

        oponente.recibirDano(dano);
        System.out.println(this.nombre + " (Liu Kang) usa " + habilidad + " causando " + dano + " puntos de daño.");
    }

    @Override
    public String[] getHabilidades() {
        return habilidadesLocal; // Devuelve las habilidades
    }
}