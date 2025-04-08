import java.util.Arrays;

public class ejCintas {

    public static int cintas(int[] vector) {
        int movimientos = 0;
        Arrays.sort(vector);

        while (vector.length > 1) {
            // Sumamos los dos menores
            int suma = vector[0] + vector[1];
            movimientos += suma;

            // Creamos un nuevo vector
            int[] nuevoVector = new int[vector.length - 1];

            // Insertamos la suma en la primera posición
            nuevoVector[0] = suma;

            // Copiamos el resto de los elementos (desde la posición 2 del vector original)
            for (int i = 2; i < vector.length; i++) {
                nuevoVector[i - 1] = vector[i];
            }

            // Ordenamos de nuevo
            Arrays.sort(nuevoVector);

            // Actualizamos el vector
            vector = nuevoVector;
        }

        return movimientos;
    }

    public static void main(String[] args) {
        int[] cintas = {30, 20, 10};
        int resultado = cintas(cintas);
        System.out.println("Movimientos totales: " + resultado);
    }
}
