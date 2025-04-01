public class greedyEjCambio {
    
    public static int resolucion(int v){


        int n = 0;
        int s = 0;
        int i = 0;

        int[] vector = {100,50,25,10,5,1};

        while (s < v && i < vector.length) {
            
        
            if (s + vector[i] <= v) {
                
                s = s + vector[i];
                
                System.out.println(s);
                n++;
                
            }
            else{
                i++;
                
            }
        }
        

            if(i < vector.length){
                System.out.println("N: " + n);
                return n;
                

            }
            else{
                return -1;
                
            }
        

    }


    public static void main(String[] args) {
        
        resolucion(175)
        ;
    }


}
