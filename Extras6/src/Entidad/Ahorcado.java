package Entidad;

/**
 *
 * @author Pablo
 */
public class Ahorcado {

    private String palabra;
    private String letra;
    private String[] ahorcado;
    private String jugadas;
    private int intentos;

    public Ahorcado() {
        this.jugadas = "";
    }

    public Ahorcado(String palabra, String letra, String[] ahorcado, int intentos) {
        this.palabra = palabra;
        this.letra = letra;
        this.ahorcado = ahorcado;
        this.intentos = intentos;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String[] getAhorcado() {
        return ahorcado;
    }

    public void setAhorcado() {
        this.ahorcado = new String[this.palabra.length()];
    }

    public String getJugadas() {
        return jugadas;
    }

    public void setJugadas(String jugadas) {
        this.jugadas = jugadas;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public void inicializarAhorcado() {
        for (int i = 0; i < this.palabra.length(); i++) {
            this.ahorcado[i] = "-";
        }
    }

    public void MostrarAhorcado() {
        for (String let : ahorcado) {//bucle de impresion de vector vacio
            System.out.print(let + " ");
        }
    }

    public void llenar() {
        for (int i = 0; i < palabra.length(); i++) {//el bucle itera buscando coincidencias de la letra en el substring de la palabra
            if (palabra.substring(i, i + 1).equalsIgnoreCase(letra)) {
                ahorcado[i] = letra;//si encuentra la coincidencia en la palabra, sobreescribe la posicion correspondiente en el vector
            }
        }
    }

    public void noAdivina() {
        intentos -= 1;
    }

    public boolean gano() {
        return String.join("", ahorcado).matches(palabra);
    }
}
