/*
 * Ejercicios de practica y estudio referentes al curso de fullstack egg coop.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Circunferencia {

    private double radio;
//Constructores

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }
//Setter

    public void setRadio(double radio) {
        this.radio = radio;
    }
//getter

    public double getRadio() {
        return radio;
    }
//Metodo crear circunferencia

    public void crearCircunferencia() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese valor del radio");
        setRadio(sc.nextDouble());
    }
//Metodo area

    public void area() {
        System.out.println("El area de la circunferencia es: " + (3.14 * (radio * radio)));
    }
//Metodo perimetro

    public void perimetro() {
        System.out.println("El perimetro de la circunferencia es: " + (2 * 3.14 * radio));
    }
//Metodo toString()

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }

}
