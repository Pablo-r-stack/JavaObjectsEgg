
package Servicio;

import Entidad.Meses;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */

/*
    .Se importa e instancia clase Scanner y objeto Meses
    .El metodo crearMes se devuelve un objeto inicializado:
        -La misma funcion elige un numero al azar entre 0 y 11 a fin de obtener un mes del vector String[](atributo) del objeto.
        -Una vez generado el int alteatorio, se devuelve el constructor pasando por parametro el int
        -El constructor recibe el int y asigna el equivalente a su indice guardado en el vector constante lleno de Strings.
    .El metodo adivinar pide al usuario que ingrese un mes en texto y valida si es el generado de forma aleatoria.
*/
public class MesServicio {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    public Meses crearMes(){
        int nroMes = (int) ((Math.random()*11));
        return new Meses(nroMes);
    }
    //
    public void adivinar(Meses mes){
        String intento = "";
        do{
            System.out.println("Adivina el mes secreto!");
            intento = scan.next();
            if (intento.equalsIgnoreCase(mes.getMesSecreto())){
                System.out.println("Adivinaste el mes secreto!!");
                break;
            }else{
                System.out.println("No adivinaste, intenta de nuevo");
            }
        }while(!intento.equalsIgnoreCase(mes.getMesSecreto()));
    }
}
