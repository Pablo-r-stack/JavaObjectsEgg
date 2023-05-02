/**
 * Clase de servicio del objeto Buscaminas, se encarga de:
 *  .metodo crearBuscaminas() devuelve al main un objeto inicializado
 *  .metodo menu() se encarga del proceso lógico del ejercicio:
 *      -llama al metodo mostrar() el cual muestra el campoJuego al usuario vacio
 *      -pregunta coordenadas a buscar en la matriz mediante el metodo coordenadas():
 *          *coordenadas devuelve un valor que no salga del rango de la matriz[10][10]
 *      -se llama al metodo cavar:
 *          *cavar recibe al objeto y ambas coordenadas y analiza la posicion con el campoFinal del objeto
 *          *si la coordenada corresponde a -1 devuelve false y termina el juego mostrando la matriz final.
 *          *si la coordenada no es -1 actualiza dicha posicion en campoJuego y valida si dicho numero es un 0
 *          *si la posicion contiene un 0, mostrara todos los valores adyacentes a este actualizando el campoJuego que se muestra al usuario
 *          *devuelve true continuando el juego
 *          *tras cualquier estructura selectiva, se setea el campoJuego actualizado en el objeto.
 *      -se llama al metodo ganar(objeto) el cual compara ambas matrices validando si son iguales:
 *          *si son iguales se informa al usuario que gano y se rompe el bucle terminando el programa
 *          *de lo contrario se continua la ejecucion while del metodo menu.
 */
package Servicio;

import Entidad.Buscaminas;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class BuscaminasServicio {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public Buscaminas crearBuscaminas() {
        Buscaminas b = new Buscaminas();
        return b;
    }

    public void menu(Buscaminas b) {
        System.out.println("Campo minado, a jugar!!!! d(e_e)b ");
        while (true) {
            mostrarCampo(b.getCampoJuego());
            System.out.println("Ingresa coordenada x a buscar");
            int x = coordenada();
            System.out.println("Ingresa coordenada y a buscar");
            int y = coordenada();
            if (!cavar(b, x, y)) {
                System.out.println("X_X !!! \nPerdiste!");
                b.mostrar(b.getCampoFinal());
                break;
            } else if (gano(b)) {
                System.out.println("^_^!!!!\nGanaste! felicidades!");
                b.mostrar(b.getCampoFinal());
                break;
            }
        }
    }

    private int coordenada() {
        int coordenada = scan.nextInt();
        while (coordenada < 1 || coordenada > 10) {
            System.out.println("Valor invalido, intenta de nuevo");
            coordenada = scan.nextInt();
        }
        return (coordenada - 1);
    }

    private void mostrarCampo(int[][] campoJuego) {
        int aux = 0;
        for (int[] is : campoJuego) {
            if (aux == 9) {
                System.out.print(String.valueOf(aux + 1) + " |");
            } else if (aux == 0) {
                System.out.print("    1 2 3 4 5 6 7 8 9 10"
                        + "\n    _ _ _ _ _ _ _ _ _ _\n1  |");
            } else {
                System.out.print(String.valueOf(aux + 1) + "  |");
            }
            for (int i : is) {
                if (i == 9 || i == -1) {
                    System.out.print("x|");
                } else if (i >= 0) {
                    System.out.print("\u001B[32m" + i + "\u001B[0m" + "|");
                }
            }
            System.out.println("");
            aux++;
        }
        System.out.println("    ¯ ¯ ¯ ¯ ¯ ¯ ¯ ¯ ¯ ¯");
    }

    public boolean cavar(Buscaminas b, int x, int y) {
        int[][] campoFinal = b.getCampoFinal();
        int[][] campoJuego = b.getCampoJuego();
        if (campoFinal[x][y] == -1) {
            campoJuego[x][y] = campoFinal[x][y];
            b.setCampoJuego(campoJuego);
            return false;
        } else if (campoFinal[x][y] == 0 && campoJuego[x][y] != campoFinal[x][y]) {
            // Marcamos la posición actual como descubierta
            campoJuego[x][y] = campoFinal[x][y];
            // Exploramos las celdas adyacentes
            for (int i = x - 1; i <= x + 1; i++) {
                for (int j = y - 1; j <= y + 1; j++) {
                    if (i >= 0 && i < campoFinal.length && j >= 0 && j < campoFinal[0].length) {
                        // Si la celda adyacente es un 0 y aún no ha sido descubierta, la exploramos
                        if (campoFinal[i][j] == 0 && campoJuego[i][j] != campoFinal[i][j]) {
                            cavar(b, i, j);
                        } else {
                            // Si la celda adyacente no es un 0, simplemente la marcamos como descubierta
                            campoJuego[i][j] = campoFinal[i][j];
                        }
                    }
                }
            }
            b.setCampoJuego(campoJuego);
            return true;
        } else {
            campoJuego[x][y] = campoFinal[x][y];
            b.setCampoJuego(campoJuego);
            return true;
        }

    }

    private boolean gano(Buscaminas b) {
        int[][] campoFinal = b.getCampoFinal();
        int[][] campoJuego = b.getCampoJuego();
        boolean check = true;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (campoJuego[i][j] != campoFinal[i][j]) {
                    check = false;
                    break;
                }
            }
        }
        return check;
    }
}
