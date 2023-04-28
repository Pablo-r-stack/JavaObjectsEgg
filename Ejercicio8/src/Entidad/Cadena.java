/*
* Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
* String) y su longitud.
 */
package Entidad;

/**
 *
 * @author Pablo
 */

/**
 * Como pide el ejercicio se declaran 2 atributos privados String frase e int longitud
 * La longitud del objeto se dimensiona de manera automatica en el constructor en base al .length del String.
*/
public class Cadena {
    private String frase;
    private int longitud;

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longitud=" + longitud + '}';
    }
    
    
}
