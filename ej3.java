public class ej3 {

    public static int k(int[] s, int inicio, int fin, int cont) {
        int medio = (inicio + fin) / 2;

        if (inicio > fin || medio == s[medio]) {
            return s[medio];

        } 
        
            
          else if (s[medio] > medio) { // izquierda
            System.out.println("izquierda");
            return k(s, inicio, medio - 1, cont);
        } else if (s[medio] < medio) { // derecha
            System.out.println("derecha");
            return k(s, medio + 1, fin, cont);
        }

        return s[medio];
    }

    public static void main(String[] args) {
        int[] s = {-1, 0, 1, 2, 4, 9, 10, 111};

        System.out.println(k(s, 0, s.length - 1, 0));
    }
}
