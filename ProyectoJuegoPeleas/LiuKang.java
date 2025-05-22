/**
 * Clase que representa a Liu Kang, un personaje del juego de lucha.
 * Liu Kang tiene habilidades específicas que puede usar para atacar a su oponente.
 */

public class LiuKang extends Personaje {
    // Arreglo que contiene las habilidades de Liu Kang con su daño correspondiente
     private final String[] habilidades = {
        "Patada Bicicleta - Daño: 26",
        "Combo Shaolin - Daño: 22",
        "Dragón de Fuego - Daño: 38"
    };

    public LiuKang(String nombre) {
        super(nombre, 90, new String[]{
            "Patada Bicicleta - Daño: 26",
            "Combo Shaolin - Daño: 22",
            "Dragón de Fuego - Daño: 38"
        });
    }
     /**
     * Constructor de LiuKang.
     * 
     * para nombre El nombre del personaje.
     */
    
    /**
     * Método que permite a Liu Kang atacar a un oponente.
     * Selecciona aleatoriamente una habilidad y aplica el daño correspondiente.
     * 
     * para oponente El personaje que recibe el ataque.
     * retorna el daño causado al oponente.
     */

    public int atacar(Personaje oponente) {
            Random rand = new Random();
        int habilidadIndex = rand.nextInt(habilidades.length);
        String habilidad = habilidades[habilidadIndex];
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
        return dano;

    }


}

