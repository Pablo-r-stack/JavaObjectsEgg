/*
 * Ejercicio de practica.
    * Se busco recrear el juego de buscaminas
    * Cada seccion esta comentada con el proceso logico del mismo
 */
package buscaminas;
import Entidad.Buscaminas;
import Servicio.BuscaminasServicio;
/**
 *
 * @author Pablo
 */
public class BuscaminasMain {

    /**
     * prog principal inicia servicio y objeto que se llena apartir de clase servicio
     * Se llama al metodo menu el cual posee el hilo logico del programa.
     */
    public static void main(String[] args) {
        BuscaminasServicio bs = new BuscaminasServicio();
        Buscaminas b = bs.crearBuscaminas();
        bs.menu(b);
    }
    
}
