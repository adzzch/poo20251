import java.util.Random;

public class Scorpion extends Personaje {
    private final int MIN_DANO = 20;
    private final int MAX_DANO = 30;
    
    public Scorpion(String nombre) {
        super(nombre, 100);
    }
}