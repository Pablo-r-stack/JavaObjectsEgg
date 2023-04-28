/*
 *  Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la 
 *  clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase 
 *  Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al 
 *  usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date, 
 *  deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que 
 *  se puede conseguir instanciando un objeto Date con constructor vacío. 
 *  Ejemplo fecha: Date fecha = new Date(anio, mes, dia); 
 *  Ejemplo fecha actual: Date fechaActual = new Date(); 
 */
package poogej11;

import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author Pablo
 */
public class PooGej11 {

    static Scanner scan = new Scanner(System.in).useDelimiter("\n");

    /**
     * Ejercicio de clase DATE, se tiene en cuenta la logica pedida por el mismo
     * cabe aclarar que al setear un Date por constructor se debe restar 1900 al año y el mes en 1 (El get de la clase lo indexa 1 mes menos)
     */
    public static void main(String[] args) {
        Date date = new Date();

        int dia, mes, anio;
        System.out.println("Ingrese dia");
        dia = scan.nextInt();
        System.out.println("Ingrese mes");
        mes = scan.nextInt();
        System.out.println("Ingrese año");
        anio = anio4();
        Date date1 = new Date((anio-1900), (mes-1), dia);

        System.out.println(date1.getDate()+ "/" + (date1.getMonth()+1) + "/" + (date1.getYear()+1900));
        
        System.out.println("La diferencia entre la fecha ingresada y la actual son :" + (date.getDay()-date1.getDay())+ " dias, "+
               (date.getMonth()-date1.getMonth())+" meses, y " + (date.getYear()-date1.getYear())+ " años");
        
        System.out.println(date.toString());
        System.out.println(date1.toString());

    }

    public static int anio4() {
        int anio = scan.nextInt();
        if(String.valueOf(anio).length()<4){
            System.out.println("El formato del año debe ser de 4 digitos 'YYYY'");
            anio = scan.nextInt();
        }
        return anio;
    }
}
