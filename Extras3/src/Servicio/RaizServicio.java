package Servicio;

import Entidad.Raiz;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */

/*
    .En la clase de servicio se emplea la parte lógica del ejercicio
    .Se instancia un objeto scanner y la clase a trabajar la cual se llena mediante la funcion publica crearRacices();
    .La funcion publica calcular recibe el objeto del Main y llama a los != metodos privados en esta clase para la resolución del ejercicio.

 */

public class RaizServicio {

    Scanner leer = new Scanner(System.in);

//funcion que devuelve un objeto lleno al Main.
    public Raiz crearRaices() {

        System.out.println("Ingrese el valor a:");
        int a = leer.nextInt();
        System.out.println("Ingrese el valor b:");
        int b = leer.nextInt();
        System.out.println("Ingrese el valor c:");
        int c = leer.nextInt();
        return new Raiz(a, b, c);
    }
    
/*Método getDiscriminante(): devuelve el valor del discriminante (double).
 *       El discriminante tiene la siguiente formula: (b^2)-4*a*c*/
    
    private double getDiscriminante(Raiz r1) {

        return (double) (Math.pow(r1.getB(), 2) - 4 * r1.getA() * r1.getC());

    }

    /*Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0. */
    
    private boolean tieneRaices(Raiz r1) {

        return getDiscriminante(r1) > 0;
    }

    /* Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.*/
    
    private boolean tieneRaiz(Raiz r1) {

        return getDiscriminante(r1) == 0;
    }

    /*Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones. */
    
    private void obtenerRaices(Raiz r1) {
        if (tieneRaices(r1)) {
            double x1 = (-r1.getB() + Math.sqrt((Math.pow(r1.getB(), 2)) - (4 * r1.getA() * r1.getC()))) / (2 * r1.getA());
            System.out.println("x1=" + x1);
            double x2 = (-r1.getB() - Math.sqrt((Math.pow(r1.getB(), 2)) - (4 * r1.getA() * r1.getC()))) / (2 * r1.getA());
            System.out.println("x2=" + x2);
        }

    }

    /*Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una
 * única raíz. Es en el caso en que se tenga una única solución posible. */
    
    private void obtenerRaiz(Raiz r1) {
        if (tieneRaiz(r1)) {
            double x = -r1.getB() / (2 * r1.getA());
            System.out.println("x=" + x);

        }

    }

    /* Método
 * calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
 * pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
 * obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en
 * caso de no existir solución, se mostrará un mensaje*/
    
    public void calcular(Raiz r1) {
        if (tieneRaices(r1)) {

            obtenerRaices(r1);
        } else if (tieneRaiz(r1)) {
            obtenerRaiz(r1);
        } else {
            System.out.println("No existe solución");
        }

    }
}
