package Servicio;

import Entidad.Nif;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */

/*
    .En la clase de servicio se crea un metodo publico para devolver un objeto Nif lleno
    .Se importa y crea un objeto Scanner para permitir ingresos por teclado
    .El atributo String letra del Objeto Nif se calcula mediante la llamada a funcion letraNif
    .Se devuelve al main el objeto inicializado por constructor con parametros.
 */
public class NifServicio {

    Scanner leer = new Scanner(System.in);

    //Inicializacion de objeto
    public Nif crearNif() {
        System.out.println("Ingrese su numero de documento");
        long DNI = leer.nextLong();
        String letra = letraNif(DNI);

        return new Nif(DNI, letra);
    }

    //Funcion de asignación de letra
    private String letraNif(long dni) {
        String[] letra = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        return letra[(int) dni % 23];

    }

    /*    Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
en mayúscula; por ejemplo: 00395469-F).*/
    
    public void mostrar(Nif doc) {
        System.out.println(doc.getDni() + "-" + doc.getLetra());
    }

}
