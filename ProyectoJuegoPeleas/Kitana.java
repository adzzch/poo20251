/**
 * Clase que representa a Kitana.
 * Tiene 3 habilidades, la última con posibilidad de ataque doble.
 */
class Kitana extends Personaje {
    private final String[] habilidades = {
        "Corte de Abanico - Daño: 17",
        "Tornado de Viento - Daño: 20",
        "Lanzamiento de Abanicos - Daño: 28 + posibilidad de ataque doble"
    };

     public Kitana(String nombre) {
        super(nombre, 95);
    }


    /**
     * Ataca usando una habilidad aleatoria.
     * Última habilidad tiene 20% de probabilidad de causar daño extra.
     */
    @Override
    public void atacar(Personaje oponente) {
        Random rand = new Random();
        int indice = rand.nextInt(habilidades.length);
        String habilidad = habilidades[indice];
        int dano = 0;

        switch (indice) {
            case 0: dano = 17; break;
            case 1: dano = 20; break;
            case 2:
                dano = 28;
                if (rand.nextInt(100) < 20) {
                    int danoExtra = 10;
                    dano += danoExtra;
                    System.out.println(this.nombre + " realiza un ataque doble causando " + danoExtra + " puntos de daño extra.");
                }
                break;
        }
        oponente.recibirDano(dano);
        System.out.println(this.nombre + " (Kitana) usa " + habilidad + ", causando " + dano + " puntos de daño.");
    }

    @Override
    public String[] getHabilidades() {
        return habilidades.clone();
    }





}