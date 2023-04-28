/*
 * Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos,
 * sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un
 * objeto puntos usando un método crearPuntos() que le pide al usuario los dos
 * números y los ingresa en los atributos del objeto. Después, a través de otro
 * método calcular y devolver la distancia que existe entre los dos puntos que
 * existen en la clase Puntos. Para conocer como calcular la distancia entre dos
 * puntos consulte el siguiente link:
 * http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
 *
 */
package poogex2;

import Entidad.Punto;
import Servicio.PuntoServicio;

/**
 *
 * @author Pablo
 */
public class PooGex2 {

    /**
     * En el main, importamos clase de servicio y objeto a trabajar.
     * Se crean dos objetos de la misma clase (Punto) los cuales se inicializan y llenan con la funcion del servicio crearPuntos();
     * Se imprime por pantalla el resultado de la ecuacion calcularDistancia pasando como argumento ambos objetos.
     */
    public static void main(String[] args) {
        PuntoServicio ps = new PuntoServicio();
        Punto punto1 = ps.crearPuntos();
        Punto punto2 = ps.crearPuntos();
        
        System.out.println("La distancia entre los dos puntos es: " + ps.calcularDistacia(punto1, punto2));
    }
    
}
