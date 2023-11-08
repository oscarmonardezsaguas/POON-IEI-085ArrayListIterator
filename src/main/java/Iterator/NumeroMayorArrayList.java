
package Iterator;

import java.util.ArrayList;
import java.util.Iterator;


public class NumeroMayorArrayList {

    /**
     * Encontrar el número mayor
     */
    public static void main(String[] args) {
     ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(8);
        numeros.add(2);
        numeros.add(10);

        int mayor = Integer.MIN_VALUE;
        Iterator<Integer> iterador = numeros.iterator();

        while (iterador.hasNext()) {
            int numero = iterador.next();
            if (numero > mayor) {
                mayor = numero;
            }
        }

        System.out.println("El número mayor es: " + mayor);
    }
    
}
