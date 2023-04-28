/*
 * a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
 * frase ingresada.
 * b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
 * ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
 * c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
 * contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
 * d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
 * e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
 * compone la clase con otra nueva frase ingresada por el usuario.
 * f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
 * con una nueva frase ingresada por el usuario y mostrar la frase resultante.
 * g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
 * encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
 * la frase resultante.
 * h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
 * ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class CadenaServicio {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    //Metodo de creacion de objeto
    public Cadena crearCadena() {
        System.out.println("Ingrese una palabra o frase");
        String frase = scan.next();
        return new Cadena(frase);
    }
    //Metodo usa regex y un contador para contar las vocales en el String del objeto
    private void mostrarVocales(Cadena cadena) {
        String frase = cadena.getFrase();
        int vocales = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (frase.substring(i, i + 1).matches(".*[aeiouAEIOU].*")) {
                vocales++;
            }
        }
        System.out.println("Se encontraron: " + vocales + " en la palabra/frase ingresada");
    }
    //Metodo imprime por pantalla el String del objeto en sentido inverso
    private void invertirFrase(Cadena cadena) {
        for (int i = (cadena.getLongitud()-1); i > -1; i--) {
            System.out.print(cadena.getFrase().charAt(i));
        }
    }
    //Metodo recibe una letra en substring 0,1 a buscar y cuenta cuantas veces se repite
    private void vecesRepetido(Cadena cadena, String letra) {
        int contador = 0;
        if (cadena.getFrase().toLowerCase().contains(letra.toLowerCase())) {
            for (int i = 0; i < cadena.getLongitud(); i++) {
                if (cadena.getFrase().substring(i, i + 1).equalsIgnoreCase(letra)) {
                    contador++;
                }
            }
        }
        System.out.println(contador == 0 ? "No se encontro la letra Ingresada" : "Se encontro la letra ingresada " + contador + " veces");
    }
    //Metodo recibe un String secundario a comparar con el String del atributo del Objeto
    private void compararLongitud(Cadena cadena, String frase2) {
        int longitud = frase2.length();
        System.out.println(cadena.getLongitud() > longitud ? "La frase ingresada es menor" : "La frase ingresada es mayor");
    }
    //Metodo que recibe un String secundario y lo muestra por pantalla concatenado al String del objeto
    private void unirFrases(Cadena cadena, String frase2) {
        System.out.println("el resultado de unir ambas frases es :\n" + cadena.getFrase() + " " + frase2);
    }
    /*Metodo recibe una letra en substring(0,1) y la reemplaza por todas las letras 'a' que contenga el String del objeto
      De ser true se muestra el resultado por pantalla,de lo contrario, se informa que no se realiza operacion */
    private void reemplazar(Cadena cadena, String letra) {
        String frase = cadena.getFrase().toLowerCase();
        if (frase.contains("a")) {
            frase = frase.replace("a", letra);
        System.out.println(frase);
        }else{
            System.out.println("La palabra o frase ingresada no contiene letras 'a'");
        }
    }
    //Metodo devuelve true o false validando si la letra ingresada por teclado esta contenida en el atributo del objeto.
    private boolean contiene(Cadena cadena, String letra) {
        return cadena.getFrase().toLowerCase().contains(letra.toLowerCase());
    }
    //Menu tipo interfaz permite mayor legibilidad y comprension del ejercicio, una estructura selectiva itera dentro de un bucle while.
    public void menu(Cadena cadena) {
        String opcion = "";
        while (!opcion.equals("8")) {
            System.out.println("\nIngrese opcion deseada:");
            System.out.println("1-Mostrar cantidad de vocales en la frase\n2-Mostrar frase invertida"
                    + "\n3-Buscar cuantas veces se repite una letra\n4-Comparar longitud\n5-Unir frases"
                    + "\n6-Reemplazar 'a' con otra letra" + "\n7-Buscar si una letra está en la frase ingresada\n8-Salir");
            opcion = scan.next();
            switch (opcion) {
                case "1":
                    mostrarVocales(cadena);
                    break;
                case "2":
                    invertirFrase(cadena);
                    break;
                case "3":
                    System.out.println("Ingrese una letra a buscar");
                    vecesRepetido(cadena, scan.next().substring(0, 1));
                    break;
                case "4":
                    System.out.println("Ingrese una frase a comparar");
                    compararLongitud(cadena, scan.next());
                    break;
                case "5":
                    System.out.println("Ingrese una palabra o frase a unir");
                    unirFrases(cadena, scan.next());
                    break;
                case "6":
                    System.out.println("Ingrese letra a reemplazar");
                    reemplazar(cadena, scan.next().substring(0, 1));
                    break;
                case "7":
                    System.out.println("Ingrese letra y te dire si está incluida o no");
                    System.out.println(contiene(cadena, scan.next().substring(0, 1)) ? "Esta incluida" : "No se encontró la letra");
                    break;
                case "8":
                    System.out.println("Hasta la próxima!");
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
            }
        }
    }
}
