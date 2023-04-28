/*
 * Esta clase contiene dos atributos vector tipo double privados.
 */
package Entidad;

/**
 *
 * @author Pablo
 */
public class Arreglos {
    private double[] a1 = new double[50];
    private double[] a2 = new double[20];

    public Arreglos() {
    }

    public double[] getA1() {
        return a1;
    }

    public void setA1(double[] a1) {
        this.a1 = a1;
    }

    public double[] getA2() {
        return a2;
    }

    public void setA2(double[] a2) {
        this.a2 = a2;
    }

    @Override
    public String toString() {
        return "Arreglos{" + "a1=" + a1 + ", a2=" + a2 + '}';
    }
    
    
    
}
