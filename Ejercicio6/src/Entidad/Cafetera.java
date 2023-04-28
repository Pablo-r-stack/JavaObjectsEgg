/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Pablo
 */
public class Cafetera {
    //ATRIBUTOS
    private int capMax;
    private int cantActual;
    //CONSTRUCTOR INICIALIZA VARIABLES POR DEFECTO.

    public Cafetera() {
        capMax = 1000;
        cantActual = 100;
    }

    public Cafetera(int capMax, int cantActual) {
        this.capMax = capMax;
        this.cantActual = cantActual;
    }
    
    //SETTER  ASIGNA VALOR

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    public void setCantActual(int cantActual) {
        this.cantActual = cantActual;
    }
    
    //GETTER  DEVUELVE VALOR

    public int getCapMax() {
        return capMax;
    }

    public int getCantActual() {
        return cantActual;
    }
    
    //TO STRING

    @Override
    public String toString() {
        return "Cafetera{" + "capMax=" + capMax + ", cantActual=" + cantActual + '}';
    }
    

    
    }
    
    
    
    
    
    

