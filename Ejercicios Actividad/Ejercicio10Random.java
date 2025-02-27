public class Ejercicio10Random {
    public static void main(String[] args) {
        /* 
         Elaborar un programa que lea 30 números y que imprima el número mayor
         menor y el número de veces que se repiten ambos.
         */

        // Creacion de arreglo de 30 espacios
        int [] n = new int[20];

        // LLenar el arreglo con numeros random
        for (int i = 0; i < n.length; i++) {
           n[i] = (int) (Math.random() * 20) + 1;

        }
        
        /* Variables encargadas de entregar el numero
        mayor, menor y cada repeticion
        */
        int numeroMayor = n[0], numeroMenor = n[0], repMayor = 0, repMenor = 0;

        // Calcular mayor y menor y asigna el valor correspondiente a cada variable
        for (int num : n) {
            if (num > numeroMayor) {
                numeroMayor = num;
            }
        }
        for (int num : n) {
            if (num < numeroMenor){
                numeroMenor = num; 
            }
        }
        for (int num : n) {
            if (num == numeroMayor) repMayor++;
            if (num == numeroMenor) repMenor++;     
        }
       
        // Mostramos los arreglos
        for (int num : n) {
            System.out.print(num + " " );
        }
        System.out.println("El número mayor es: " + numeroMayor + " y la cantidad de veces que se repite es: " + repMayor + ".");
        System.out.println("El número menor es: " + numeroMenor + " y la cantidad de veces que se repite es: " + repMenor + ".");
    }   
    
}