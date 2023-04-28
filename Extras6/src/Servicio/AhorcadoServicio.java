
package Servicio;

import java.util.Scanner;
import Entidad.Ahorcado;

/**
 *
 * @author Pablo
 */
public class AhorcadoServicio {
    
    Ahorcado juego = new Ahorcado();
    Scanner scan = new Scanner(System.in);
    
    public Ahorcado crearAhorcado() {
        System.out.println("Ingrese palabra");//Se pide palabra por teclado
        juego.setPalabra(scan.next().toUpperCase());
        juego.setIntentos(10);
        juego.setAhorcado();
        juego.inicializarAhorcado();
        return juego;
    }
    
    public void iniciarJuego(Ahorcado juego) {
        do {
            juego.MostrarAhorcado();//muestra estado de palabra a adivinar
            
            //muestra letras jugadas e intentos restantes
            System.out.println("letras jugadas :" + juego.getJugadas() +"\n intentos restantes: " + juego.getIntentos());
            
            System.out.println("Ingrese una Letra :");
            juego.setLetra(scan.next().toUpperCase());//se lee letra
            juego.setJugadas(juego.getJugadas() + " " + juego.getLetra());
            
            if (juego.getPalabra().contains(juego.getLetra())) {//el if valida si en la palabra a adivinar se encuentra la letra
                juego.llenar();//si es true se llama a la funcion llenar que llena las posiciones correctas
            } else {//false ejecuta mensaje y descuenta el contador
                System.out.println("No se encontro la palabra! un intento menos");
                juego.noAdivina();
                System.out.println("Intentos restantes : " + juego.getIntentos());
            }
            if (juego.gano()) {//valida en cada vuelta si el vector es igual a la palabra a adivinar
                break;
            }
            
        } while (juego.getIntentos() > 0);//se ejecuta hasta que intentos sea > a 0 o suceda el break del if en la linea de arriba.
        
        if (juego.getIntentos() <= 10 && juego.getIntentos() > 0) {//segun la salida del bucle valida el valor del contador, si alcanzo 10 perdio.
            juego.MostrarAhorcado();
            System.out.println("Felicidades ganaste esta vez!!");
        } else {
            System.out.println("La palabra era: " + juego.getPalabra());
            System.out.println("JAJAJA PERDISTE!!");
        }
        System.out.println("Termino el juego!");
    }
    
}
