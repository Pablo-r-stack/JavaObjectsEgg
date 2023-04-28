/*
    Como pide el ejercicio en la Clase Nif se declaran dos atributos privados
    long dni
    String letra
 */
package Entidad;

/**
 *
 * @author Pablo
 */
public class Nif {

    private long dni;
    private String letra;

    public Nif() {
    }

    public Nif(long DNI, String letra) {
        this.dni = DNI;
        this.letra = letra;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "Nif{" + "DNI: " + dni + ", letra :" + letra + '}';
    }
    
}
