package funciones;

import java.util.logging.Logger;

public class EjFunciones {
    public String tema="Funciones o Métodos";
    public static final Logger log=
            Logger.getLogger(EjFunciones.class.getName());

    //tipoRetorno /nombreFuncion / (tipoParametro1)
    public static void main(String[] args) {
        double x= 5.5;
        double suma = sumarDosNumeros(5,x);
        mostrarMensaje(suma);
        mostrarMensajeBienvenida("William");
        mostrarMensajeBienvenida("William","Gonzales");
        log.info(mostrarMensajeBienvenida("William",2));
        mostrarNroDeCreciente(3);

    }
    static double sumarDosNumeros(int nro1, double nro2){

        double resultado= nro1+nro2;
        nro2=10;
        return resultado;
    }

    static void mostrarMensaje(double resultado){
        log.info("El resultado de la suma es: "+resultado);
    }

     //SOBRECARGA DE METODOS: Las funciones se llaman igual pero tienen diferente cantidad de parámetros
    static void mostrarMensajeBienvenida (){
        log.info("Bienvenido a la clase 2 de Funciones");
    }
    static void mostrarMensajeBienvenida (String nombre){
        log.info("Bienvenido a la clase 2 de Funciones " + nombre);
    }
    static void mostrarMensajeBienvenida (String nombre, String apellido){
        log.info("Bienvenido a la clase 2 de Funciones " + nombre+" "+ apellido);
    }
    static String mostrarMensajeBienvenida(String nombre, int curso){
        return "Bienvenido a la clase 2 de Funciones: "+ nombre +" curso:"+curso;
    }
    //funcion recursiva
    static void mostrarNroDeCreciente (int nro){
        if (nro>0){
            nro--;
            log.info("El nro es:"+nro);
            mostrarNroDeCreciente(nro); //la funcion se llama a si misma
        }
    }
}
