/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
/*
    Clase servicio, instancia un objeto scanner e importa la clase Persona a trabajar.
    crearPersona() inicializa valores del objeto y lo devuelve (sera almacenado en != posiciones en un vector en el Main)
    solonum() fuerza la entrada de numeros a fin de evitar missInput
    genero() valida que el ingreso sea solo 'H'|| 'M'|| 'O', segun pide el ejercicio
    calcularImc() devuelve un int -1, 0, 1 segun el algoritmo matematico correspondiente a los atributos de cada objetoç
    esMayorEdad() devuelve un booleano segun el atributo edad de cada objeto
    mostrar() muestra el estado de los != atributos de cada objeto
    imcPercent() muestra el porcentaje segun valor devuelto por funcion calcularImc()
    edadPercent() muestra porcentaje de dad segun valor devuelto por esMayorEdad()
*/
public class PersonaServicio {

    
    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona p1 = new Persona();
        System.out.println("Ingrese su nombre");
        p1.setNombre(scan.next());

        System.out.println("Ingrese su edad");
        p1.setEdad((int)soloNum());

        System.out.println("Ingrese su genero ('H' hombre, 'M' mujer, 'O' otro)");
        p1.setGenero(genero());

        System.out.println("Ingrese su peso");
        p1.setPeso(soloNum());

        System.out.println("Ingrese su altura");
        p1.setAltura(soloNum());

        return p1;

    }
    
    private double soloNum(){
        double num = 0;
        while(!scan.hasNextDouble()){
            System.out.println("Debes ingresarsolo numeros");
            scan.next();
        }
        num = scan.nextDouble();
        return num;
    }
    
    private String genero() {
        String genero = "";
        do {
            genero = scan.next().substring(0, 1).toUpperCase();
            if (genero.equals("H") || genero.equals("M") || genero.equals("O")) {
                break;
            } else {
                System.out.println("Valor no válido.\n Ingrese ('H' hombre, 'M' mujer, 'O' otro)");
            }
        } while (true);
        return genero;
    }

    private int calcularIMC(Persona p1) {
        //(peso en kg/(altura^2 en mt2)
        int pesoi = 0;
        double IMC = p1.getPeso() / ((p1.getAltura() / 100) * (p1.getAltura() / 100));
        if (IMC < 20) {
            pesoi = -1;
        } else if (IMC >= 20 && IMC <= 25) {
            pesoi = 0;
        } else {
            pesoi = 1;
        }
        return pesoi;

    }

    private boolean esMayorEdad(Persona p1) {

        return p1.getEdad() >= 18;

    }

    public void mostrar(Persona[] lista) {
        for (Persona persona : lista) {
            System.out.println(persona.getNombre() + ":\n");
            switch (calcularIMC(persona)) {
                case -1:
                    System.out.println("Estás por debajo de tu peso ideal");
                    break;
                case 0:
                    System.out.println("Estás en tu peso ideal");
                    break;
                case 1:
                    System.out.println("Estás por encima de tu peso ideal");
                    break;
            }
            System.out.println((esMayorEdad(persona)) ? "Sos mayor de edad" : "Sos menor e edad");
        }
    }

    public void imcPercent(Persona[] lista) {
        int bajo = 0;
        int normal = 0;
        int alto = 0;
        for (Persona persona : lista) {
            switch (calcularIMC(persona)) {
                case -1:
                    bajo++;
                    break;
                case 0:
                    normal++;
                    break;
                case 1:
                    alto++;
                    break;
            }
        }
        
        System.out.println((bajo > 0) ? ("El " + ((bajo * 100) / 4) + "% esta bajo su peso normal")
                : "No se encontro gente con peso bajo en el grupo ingresado");

        System.out.println((normal > 0) ? ("El " + ((normal * 100) / 4) + "% esta en su peso normal")
                : "No se encontro gente con peso normal en el grupo ingresado");

        System.out.println((alto > 0) ? ("El " + ((alto * 100) / 4) + "% esta en sobrepeso")
                : "No se encontro gente con sobrepeso en el grupo ingresado");
    }

    public void edadPercent(Persona[] lista) {
        int mayor = 0;
        int menor = 0;
        for (Persona persona : lista) {
            if (esMayorEdad(persona)) {
                mayor++;
            } else {
                menor++;
            }
        }
        System.out.println((mayor > 0) ? ((mayor * 100) / 4) + "% son Mayores de edad"
                : "No se encontraron perosnas mayores de edad");
        System.out.println((menor > 0) ? ((menor * 100) / 4) + "% son Menores de edad" : "No se encontraron personas menores de edad");
    }
}
