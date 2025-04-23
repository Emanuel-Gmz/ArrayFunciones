package ejarrays;

import java.util.Arrays;

public class MetodosArray {
    public static void main(String[] args) {

        int[] alfajores={1,3,3,2,1,0,10,3,5,2,1,0,10};

        //Arrays.copyOf hace una copia del array
        int[] alfajoresPagos= Arrays.copyOf(alfajores,alfajores.length);

        //equals indica V o F comparando los arrays por igualdad
        boolean sonIguales = Arrays.equals(alfajores,alfajoresPagos);
        System.out.println("Los array son iguales "+sonIguales);

        //ordenar
        Arrays.sort(alfajoresPagos);

        boolean sonIguales2 = Arrays.equals(alfajores,alfajoresPagos);
        System.out.println("Los array son iguales "+sonIguales2);


        for (int i=0;i<alfajores.length;i++){
            System.out.println("En la posicion "+i+" es "+alfajoresPagos[i]);
        }

        //copio un rango de valores desde otro array
        int otros[]= Arrays.copyOfRange(alfajores,2,7);
        for (int i=0;i<otros.length;i++){
            System.out.println("En la posicion en OTRO "+i+" es "+otros[i]);
        }
        //obtengo el array como string
        System.out.println(Arrays.toString(alfajores));



    }
}
