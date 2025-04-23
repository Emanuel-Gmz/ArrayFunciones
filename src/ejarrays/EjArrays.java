package ejarrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

public class EjArrays {
    public static final Logger log=
            Logger.getLogger(EjArrays.class.getName());
    public static void main(String[] args) {

        String[] materias= new String[9];

        Scanner sc= new Scanner(System.in);

        for (int i=0; i<materias.length;i++){
            log.info("Ingrese el nombre de la materia "+(i+1));
            materias[i]=sc.nextLine();
        }
        Arrays.sort(materias);//ordeno
        //obtengo 1 solo string y lo muestro
        log.info("Las materias son: " + Arrays.toString(materias));
    }
}
