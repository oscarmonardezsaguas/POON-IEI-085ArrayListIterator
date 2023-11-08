package ArrayList;

import java.util.ArrayList;

public class SumaArrayList {

    /**
    * Suma Elementos
     */
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        System.out.println("La suma de los elementos es: " + suma);
    
    }
    
}
