
public static void main(String[] args) {
        /* 
         Elaborar un programa que lea 30 números y que imprima el número mayor
         menor y el número de veces que se repiten ambos.
         */

        // Creacion de arreglo de 30 espacios
        int [] n = new int[20];

        // LLenar el arreglo con numeros random
        //for (int i = 0; i < n.length; i++) {
           // n[i] = (int) (Math.random() * 20) + 1;

        }
        int[] n = {20, 20, 1, 2, 3, 5, 6, 7, 3, 2, 30, 23, 3, 23, 42, 32, 42, 42, 20, 42};
        
        /* Variables encargadas de entregar el numero
        mayor, menor y cada repeticion
        */
        int numeroMayor = n[0], numeroMenor = n[0], repMayor = 0, repMenor = 0;

        // Calcular mayor y menor y asigna el valor correspondiente a cada variable
        for (int i : n) {
            if (i > numeroMayor) {
                numeroMayor = i;
            }
        }
        for (int i : n) {
            if (i < numeroMenor){
                numeroMenor = i; 
            }
        }
        for (int  : n) {
            if (i == numeroMayor) repMayor++;
            if (i == numeroMenor) repMenor++;     
        }
       
        // Mostramos los arreglos
        for (int i : n) {
            System.out.print(i + " " );
        }
        System.out.println("El número mayor es: " + numeroMayor + " y la cantidad de veces que se repite es: " + repMayor + ".");
        System.out.println("El número menor es: " + numeroMenor + " y la cantidad de veces que se repite es: " + repMenor + ".");
    }   
