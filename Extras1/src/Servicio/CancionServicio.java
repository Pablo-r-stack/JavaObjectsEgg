/*
 * Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
 * definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
 * vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
 * además definir los métodos getters y setters correspondientes.
 */
package Servicio;

import Entidad.Cancion;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
/*
Clase de servicio, importa y crea un objeto scanner
importa la clase donde se utiliza una funcion publica a fin de devolver un objeto lleno.
*/
public class CancionServicio {
   
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public Cancion crearCancion(){
        
        System.out.println("Ingrese titulo de la canción");
        String titulo = scan.next();
        System.out.println("Ingrese autor/artista");
        String autor = scan.next();
        return new Cancion(titulo, autor);
    }
}
