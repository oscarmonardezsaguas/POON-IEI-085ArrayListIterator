
package Iterator;
import java.util.ArrayList;
import java.util.Iterator;

public class EliminarParesArrayList {

    /**
     * Eliminar elementos pares
     */
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        Iterator<Integer> iterador = numeros.iterator();

        while (iterador.hasNext()) {
            if (iterador.next() % 2 == 0) {
                iterador.remove();
            }
        }

        System.out.println("ArrayList después de eliminar pares: " + numeros);
    }
    
}
