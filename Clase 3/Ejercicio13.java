public class Ejercicio13 {

    public static void main(String[] args) {

        /*
         * Dado un arreglo A de N elementos, almacenar los elementos mayores y menores
         * que la media, almacenarlos en arreglos diferentes.
         * 
         * Análisis: Necesitamos crear el arreglo de tamaño aleatorio y generar números
         * aleatorios para qye sean almacenados en el arreglo, posteriormente obtenemos
         * la media del arreglo y comparamos cada posicion del arrelgo para determinar
         * si s mayor o mejor a la media
         */
        // n será el numero aleatorio para el tamaño del arreglo
        int n = (int) (Math.random() * (15 - 5)) + 5;
        // Declarar el arreglo
        int[] a = new int[n];
        //Llenar el arreglo
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (50 - 0 )) + 0;
        }
      //Calcular media
    int sumaArreglo = 0;
    for (int i = 0; i < a.length; i++) {
        sumaArreglo += a[i];
    }
    double media = sumaArreglo / a.length;
    System.out.println("Media del arreglo... " + media);
    //Definir la cantidad de elementos que tiene el arreglo por encima de la media y por debajo de la media
    int contadorMayorMedia = 0, contadorMenorMedia = 0;
    for (int i = 0; i < a.length; i++) {
        if(a[i] >= media){
            contadorMayorMedia++;
        }else{
            contadorMenorMedia++;
        }
        
    }
    //Creacion de los arreglos que almacenarán los números mayores y menores
    //a la media
    int[] mayores = new int[contadorMayorMedia];
    int[] menores = new int[contadorMenorMedia];
    }
}