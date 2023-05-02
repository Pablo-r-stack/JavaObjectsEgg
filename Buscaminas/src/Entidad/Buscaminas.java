package Entidad;

/**
 *
 * @author Pablo
 */
/**
 * Esta clase contiene 2 matrices privadas:
 *  .CampoFinal [][] se inicializara completo el cual sera el vector a validar
 *  .CampoJuego [][] se inicializara solo con las posiciones minadas y se mostrara vacio al usuario.
 *  .minarCampo() es un metodo privado propio de la case, es llamado con el constructor por defecto:
 *      -Este elige coordenadas aleatorias en la matriz y posiciona un valor -1 correspondiente a una mina.
 *      -En total itera 20 veces (cantidad de minas en la matriz)
 *      -Luego de posicionar las minas, se llama al metodo privado llenarCampo:
 *              *llenarCampo() inicializa el resto de la matriz, sumando posiciones adyacentes a coordenadas minadas.
 *  .mostrar(matriz[][]) se encarga de mostrar la matriz pasada por parametro (completa).
*/
public class Buscaminas {

    private int[][] campoFinal = new int[10][10];
    private int[][] campoJuego = new int[10][10];
    private int restantes = 15;

    public Buscaminas() {
        minarCampo();
    }

    public int[][] getCampoFinal() {
        return campoFinal;
    }

    public int[][] getCampoJuego() {
        return campoJuego;
    }

    public void setCampoJuego(int[][] campoJuego) {
        this.campoJuego = campoJuego;
    }

    public int getRestantes() {
        return restantes;
    }

    public void setRestantes(int restantes) {
        this.restantes = restantes;
    }

    private void minarCampo() {
        for (int i = 0; i < restantes; i++) {
            int x = (int) (Math.random() * 10);
            int y = (int) (Math.random() * 10);
            while (campoFinal[x][y] != 0) {
                x = (int) (Math.random() * 10);
                y = (int) (Math.random() * 10);
            }
            campoFinal[x][y] = -1;
            campoJuego[x][y] = -1;
        }
        llenarCampo();
    }

    private void llenarCampo() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                // Si la celda actual no tiene una mina (-1)
                if (campoFinal[i][j] != -1) {
                    campoJuego[i][j] = 9;
                    int contadorMinas = 0;
                    // Recorre las 8 celdas adyacentes a la celda actual
                    for (int k = i - 1; k <= i + 1; k++) {
                        for (int l = j - 1; l <= j + 1; l++) {
                            // Si la celda adyacente está dentro de la matriz y tiene una mina (-1)
                            if (k >= 0 && k < 10 && l >= 0 && l < 10 && campoFinal[k][l] == -1) {
                                contadorMinas++;
                            }
                        }
                    }
                    campoFinal[i][j] = contadorMinas;
                }
            }
        }
    }

    public void mostrar(int[][] campo) {
        int aux = 0;
        for (int[] is : campo) {
            if (aux == 9) {
                System.out.print(String.valueOf(aux + 1) + " |");
            } else if (aux == 0) {
                System.out.print("    1 2 3 4 5 6 7 8 9 10"
                        + "\n    _ _ _ _ _ _ _ _ _ _\n1  |");
            } else {
                System.out.print(String.valueOf(aux + 1) + "  |");
            }
            for (int i : is) {
                if (i >= 0) {
                    System.out.print( i + "|");
                } else {
                    System.out.print("\u001B[31m"+"O"+"\u001B[0m"+"|");
                }
            }
            System.out.println("");
            aux++;
        }
        System.out.println("    ¯ ¯ ¯ ¯ ¯ ¯ ¯ ¯ ¯ ¯");
    }

}
