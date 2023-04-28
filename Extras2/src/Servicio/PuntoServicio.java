
package Servicio;

import Entidad.Punto;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */

/*
    .En la clase de servicio se importa objeto scanner y clase a trabajar.
    .Se crea funcion publica que devuelve un objeto Punto lleno al Main.
    .Funcion publica calcularDistancia lleva a cabo la ecuación correspondiente al ejercicio.
*/
public class PuntoServicio {

    Scanner scan = new Scanner(System.in);

    public Punto crearPuntos() {
        Punto p1 = new Punto();
        System.out.println("Ingrese el valor x del punto");
        p1.setX(scan.nextInt());
        System.out.println("Ingrese el valor y del punto");
        p1.setY(scan.nextInt());
        return p1;
    }

    /* //otra alternativa a la creacion del objeto
    public Puntos crearPuntos() {
           
        System.out.println("Ingrese el valor x del punto");
       int x =leer.nextInt();
        System.out.println("Ingrese el valor y del punto");
       int y = leer.nextInt();
        return new Puntos(x, y);
    }
     */
    public double calcularDistacia(Punto p1, Punto p2) {
        //retorno ecuacion la cual se calcula con los valores getter de ambos objetos.
        return Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()), 2));
    }
}
