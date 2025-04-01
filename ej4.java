public class ej4 {

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Tomamos el último elemento como pivote
        int i = low - 1; // Índice del menor elemento

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) { // Si el elemento es menor que el pivote
                i++;
                // Intercambiar arr[i] y arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Colocar el pivote en su posición correcta
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Retornar la posición del pivote
    }
    

    public static int k_esimo(int[] s,int inicio,int fin, int k){


        if (k > 0 && inicio <= k && inicio <= fin) {

            int indice = partition(s, inicio, fin);
                
            if (indice == k) {
                return s[indice];
            }
    
        
        };

        
        

        return -1;
    }
}
