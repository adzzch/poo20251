public class Ejercicio10 {
    public static void main(String[] args) {
        /* Comenzamos dando los valores dados en el punto #10
        */
        int[] A = {8, 5, 3, 10, 2, 8, 1};
        // Asginar tamaño del nuevo arreglo
        int N = A.length;
        int M = (N + 1) / 2;
        
        int[] B = new int[M];

        // Llenar elementos opuestos
        for (int i = 0; i < M; i++) {
            // Opuestos
            B[i] = A[i] + A[N - 1 - i]; // Suma de opuestos
        }

        // Mostrar Resultados
        System.out.println("Arreglo A: ");
        for (int num : A) {
            System.out.print(num + " ");
        }

        System.out.println("\nArreglo B: ");
        for (int num : B) {
            System.out.print(num + " ");
        }
    }
}