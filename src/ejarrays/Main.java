package ejarrays;

public class Main {
    public static void main(String[] args) {
        //tipoDato[] nombreArray = new tipoDato[tamaño];

        //creo el array
        String[] asistencia;

        //reservamos el espacio en memoria
        asistencia= new String[3];//tamaño 3
        //asignamos valores
        asistencia[0]="Heber";
        asistencia[1]="Rodrigo";
        asistencia[2]="Santiago";

        //creamos, reservamos espacio y asignamos valores
        int notas[]={6,8,9,10,5};//tamaño 5

        //length es un atributo que me indica el tamaño del array
        for (int i=0;i<asistencia.length;i++){
            System.out.println("El alumno "+asistencia[i]);
        }

        double sumaNotas=0;
        for (int j=0;j<=notas.length-1;j++){
            sumaNotas+=notas[j];
        }
        System.out.println("El promedio de notas es :"+sumaNotas/notas.length);
    }
}