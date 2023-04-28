/**
 * Ejercicio de practica, Se intenta recrear el juego de mesa "Batalla Naval".
 * El mismo es planteado en modalidad 'un jugador'.
 */
package batalla.naval;
import  Entidad.BatallaNaval;
import Servicio.ServicioBatallaNaval;
/**
 *
 * @author Pablo
 */
public class BatallaNavalMain {

    /**
     * Se importa el objeto y clase servicio.
     * El objeto almacenara los valores devueltos por el servicio (crearJuego) devuelve un objeto construido.
     * Se llama al servicio para iniciar el proceso lógico de juego.
     */
    public static void main(String[] args) {
        ServicioBatallaNaval sn = new ServicioBatallaNaval();
        BatallaNaval bn = sn.crearJuego();
        sn.iniciarJuego(bn);
    }
    
}
