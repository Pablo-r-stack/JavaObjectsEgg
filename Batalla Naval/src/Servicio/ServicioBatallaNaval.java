/**
 * En esta clase se desarrolla la logica de inicialización de el objeto devolviendo su valor al main.
 * además controla el desarrollo logico del juego una vez llamado.
 */
package Servicio;

import Entidad.BatallaNaval;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class ServicioBatallaNaval {
    //Se importan objeto y Scanner
    BatallaNaval b1 = new BatallaNaval();
    Scanner scan = new Scanner(System.in);
    //Metodo de inicializacion, seteo y devolucion del objeto lleno al main.
    public BatallaNaval crearJuego() {
        System.out.println("Bienvenido! inicializaremos el juego en un instante: ");
        System.out.println("Colocando navíos");
        b1.asignarBarcos();
        System.out.println("barcos listos!\nPreparando proyectiles y campo de juego");
        b1.setCampoOculto(campoOculto());
        b1.setTorpedos(40);
        System.out.println("Proyectiles y campo listo! tienes 25 intentos!\n\n");
        return b1;
    }
   
    /*Metodo privado inicializa el campoOculto (el que vera el usuario) en espacios vacios donde hay null. 
    Devuelve el campo lleno.*/
    
    private String[][] campoOculto() {
        String[][] campo = new String[10][10];
        for (int i = 0; i < campo.length; i++) {
            for (int j = 0; j < campo.length; j++) {
                campo[i][j] = " ";
            }
        }
        return campo;
    }
    //Metodo privado, es llamado dentro del desarrollo del juego, devuelve coordenada x/y ingresada por usuario.
    
    private int coordenada() {
        int coordenada = scan.nextInt();
        while (coordenada < 1 && coordenada > 10) {
            System.out.println("Valor invalido, intenta de nuevo");
            coordenada = scan.nextInt();
        }
        return (coordenada - 1);
    }
    /**
     * Metodo privado es llamado desde iniciarJuego, recibe al objeto y las dos coordenadas x/y que ingresa el usuario
     * Valida si en la matriz campoBatalla la coordenada 'golpeo' un barco enemigo.
     *  Si es correcto (golpe true) se muestra un mensaje y actualiza el valor en la matriz que ve el usuario campoOculto
     *  Si es falso (golpe false) se muestra mensaje 'Agua' descontando en uno el valor torpedos del objeto y actualizando ambas matrices
    
    */
    private void averiadoAgua(BatallaNaval b1, int x, int y) {
        String[][] c1 = b1.getCampoBatalla();
        String[][] c2 = b1.getCampoOculto();
        if (c1[x][y].equalsIgnoreCase(" ")) {
            System.out.println("Agua!! un proyectil menos...");
            c2[x][y] = "a";
            c1[x][y] = "a";
            b1.setTorpedos(b1.getTorpedos() - 1);
        } else {
            System.out.println("Navío averiado! sigue así!!");
            c2[x][y] = c1[x][y];
        }
    }
    /**
     * Esta funcion tiene por objetivo validar cuando gana el usuario:
     *  Recibe el valor de las dos matrices del objeto de forma local
     *  Las recorre comparando sus elementos.
     *  Si ambas son iguales (se da por entendido que el usuario golpeo todos los barcos)
     *      devuelve true y el juego termina.
     *      sino devuelve false continuando el bucle en iniciarJuego.
    */
    private boolean gano(BatallaNaval b1) {
        String[][] c2 = b1.getCampoOculto();
        String[][] c1 = b1.getCampoBatalla();
        boolean check = true;
        for (int i = 0; i < c2.length; i++) {
            for (int j = 0; j < c2.length; j++) {
                if (!c2[i][j].equalsIgnoreCase(c1[i][j])) {
                    check = false;
                    break;
                }
            }
        }
        return check;
    }

    /**
     * Este metodo recorre el campoOculto en busca de los elementos del array barcos (final)
     * Si encuentra en dicha matriz uno de sus elementos, concatena el mismo al String hundidos del objeto.
     * un booleano se asegura de que no se concatenen los elementos mas de una vez.
    */
    private void hundidos(BatallaNaval b1) {
        String[] lista = b1.getBarcos();
        String[][] c1 = b1.getCampoOculto();
        String vertical = "";
        String horizontal = "";
        for (String navio : lista) {
            boolean encontrado = false; // bandera para verificar si ya se encontró el navío
            for (int i = 0; i < c1.length; i++) {
                for (int j = 0; j < c1.length; j++) {
                    vertical += c1[j][i];
                    horizontal += c1[i][j];
                }
            }
            if (vertical.contains(navio) && !b1.getHundidos().contains(navio)) {
                b1.setHundidos(b1.getHundidos() + navio);
                encontrado = true;
            } else if (horizontal.contains(navio) && !b1.getHundidos().contains(navio)) {
                b1.setHundidos(b1.getHundidos() + " " + navio);
                encontrado = true;
            }
            if (encontrado) { // si se encontró el navío, no seguir buscando en la matriz
                break;
            }
        }
    }
    /**
     * Este metodo una vez llamado, es el principal hilo 'logico' del programa.
     * Un bucle itera mostrando la matriz campoOculto que sera actualizada en cada vuelta, cantidad de barcos hundidos y municion restante(intentos).
     * se piden coordenadas x/y al usuario
     * se llama a funcion averiadoAgua (se informa si golpea o erra segun la coordenada ingresada)
     * se llama a hundidos (actualiza la lista de barcos hundidos )
     * Llama a la funcion gano que informa true o false (verifica si rompe el bucle de ser true)
     * el bucle se rompe bajo dos condiciones: gano == true -> break, o el jugador se queda sin proyectiles (torpedos).
     * Si gana, se muestra mensaje de ganar, si pierde (torpedos == 0) se muestra la posicion de los barcos restantes y mensaje de perdida.
     */
    public void iniciarJuego(BatallaNaval b1) {
        do {
            b1.mostrar(b1.getCampoOculto());
            System.out.println("Navíos hundidos : " + b1.getHundidos());
            System.out.println("Proyectiles restantes : " + b1.getTorpedos());
            System.out.println("\nIngresa coordenada de ataque en Eje X");
            int x = coordenada();
            System.out.println("Ingresa coordenada de ataque en Eje Y");
            int y = coordenada();
            System.out.println("Lanzando ataque en coordenada" + x + y);
            averiadoAgua(b1, x, y);
            hundidos(b1);
            if (gano(b1)) {
                System.out.println("Ganaste!!");
                break;
            }
        } while (b1.getTorpedos() > 0);

        if (b1.getTorpedos() == 0) {
            System.out.println("Te quedaste sin munición! esta era la posición enemiga");
            b1.mostrar(b1.getCampoBatalla());
            System.out.println("Perdiste, intenta de nuevo!!");
        }
    }
}
