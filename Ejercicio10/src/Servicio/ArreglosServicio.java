/*
 * Clase servicio, inicializa objeto  con lo pedido por el ejercicio y devuelve su valor al Main.
 */
package Servicio;

import Entidad.Arreglos;
import java.util.Arrays;

/**
 *
 * @author Pablo
 */
public class ArreglosServicio {

    Arreglos arr = new Arreglos();

    public Arreglos inicializarArreglos() {
        //Inicializa vector local en base a vector en objeto, lo llena de numeros aleatorios
        double[] largo = arr.getA1();
        for (int i = 0; i < largo.length; i++) {
            largo[i] = Math.random() * 100;
        }
        //ordena vector local
        Arrays.sort(largo);
        //Setea el vector local lleno y ordenado al vector vacío del objeto.
        arr.setA1(largo);

        //Inicializa vector local con la dimensión del vector2 del objeto.
        double[] largo2 = arr.getA2();
        //Bucle for inicializa las primeras 10 posiciones con los primeros 10 numeros del vector1
        //las ultimas 10 posiciones se llenan con 0.5 como pide el ejercicio
        for (int i = 0; i < largo2.length; i++) {
            if (i >= 0 && i < 9) {
                largo2[i] = largo[i];
            } else {
                largo2[i] = 0.5;
            }
        }
        //Setea el vector2 local al vector2 del objeto
        arr.setA2(largo2);
        
        System.out.println("A1 inicializado y lleno");
        System.out.println("A2 inicializado y lleno");
        //Bucles de salida por pantalla.
        for (double num : arr.getA1()) {
            System.out.println(num);
        }

        for (double num : arr.getA2()) {
            System.out.println(num);
        }
        return arr;
    }
}
