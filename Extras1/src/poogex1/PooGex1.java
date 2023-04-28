/*
 * Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
 * definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
 * vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
 * además definir los métodos getters y setters correspondientes.
 */
package poogex1;

import Entidad.Cancion;
import Servicio.CancionServicio;

/**
 *
 * @author Pablo
 */

/*
En el Main se importa y crea un objeto servicio y el objeto del ejercicio en si
El objeto se llena a partir de la llamada a funcion crearCancion que se encuentra en el servicio
se muestra por pantalla el metodo toString del objeto para observar sus valores.
*/
public class PooGex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CancionServicio cs = new CancionServicio();
        Cancion cancion1 = cs.crearCancion();
        System.out.println(cancion1);
    }
    
}
