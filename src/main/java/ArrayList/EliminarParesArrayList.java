
package ArrayList;
import java.util.ArrayList;

public class EliminarParesArrayList {

    /**
     * Eliminar elementos pares
     * 
     * 
     */
    public static void main(String[] args) {
     ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
       

        for (int i = numeros.size() - 1; i >= 0; i--) {
            if (numeros.get(i) % 2 == 0) {
                numeros.remove(i);
            }
        }

        System.out.println("ArrayList después de eliminar pares: " + numeros);
    }
      
}
