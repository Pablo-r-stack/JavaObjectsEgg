/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class CafeteraServicio {

    //nombreobj nombVar = new nombrobj();
    Cafetera caf = new Cafetera();
    Scanner scan = new Scanner(System.in);

    //modAcceso objeto nombrefuncion(){}
    public Cafetera crearCafetera() {
        System.out.println("Ingrese capacidad maxima");
        caf.setCapMax(scan.nextInt());
        System.out.println("Ingrese capacidad Actual");
        caf.setCantActual(scan.nextInt());
        return caf;
    }

    //METODOS > FUNCIONES > MODIFICAR VALORES O EJECUTAN CODIGO
    public void llenarCafetera(Cafetera caf) {
        caf.setCantActual(caf.getCapMax());
    }

    public void llenarTaza(Cafetera caf, int taza) {
        if (taza > caf.getCantActual()) {
            taza = caf.getCantActual();
        
            System.out.println("La taza no se lleno, alcanzo para " + taza);
            caf.setCantActual(0);
        } else {
            caf.setCantActual(caf.getCantActual() - taza);
            System.out.println("Se lleno la taza, cantidad actual " + caf.getCantActual());
        }
    }

    public void vaciarCafetera(Cafetera caf) {
        caf.setCantActual(0);
        System.out.println("Se vacio la cafetera");
    }

    public void agregarCafe(Cafetera caf, int cafe) {
        caf.setCantActual(cafe);
        if (caf.getCantActual() > caf.getCapMax()) {
            System.out.println("Te excediste de cafe, te sobró " + (caf.getCantActual() - caf.getCapMax()));
            caf.setCantActual(caf.getCapMax());
        } else {
            caf.setCantActual(caf.getCantActual() + cafe);
            System.out.println("Ingresaste cafe");
        }
    }
}
