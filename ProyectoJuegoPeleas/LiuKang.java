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
        

    }


}

