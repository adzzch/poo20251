public class Ejercicio3 {
    public static void main(String[] args) {

        /*
         * Dado un arreglo lineal de numeros sumar separadamente
         * los números pares e impares
         *
         * Análisis: Declarar un arreglo, en dos varibales ir guardando
         * la suma de los números pares e impares, lo anterior
         * debe iterra en un "for" con la condición de validar
         * si el número es par o impar (n%2 == 0 -> par)
         */

        int[] b = { 5, 2, 6, 5, 9, 90, 1, 8, 15, 4 };
        int sumaPares = 0, sumaImpares = 0;

        for (int i = 0; i < b.length; i++) {
            if (b[i] % 2 == 0) {
                sumaPares += b[i];
            } else {
                sumaImpares += b[i];
            }
        }
        System.out.println("La suma de los números pares es: " + sumaPares);
        System.out.println("La suma de los números impares es: " + sumaImpares);
    }
}
