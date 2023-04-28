package Servicio;

import Entidad.Matematica;

/**
 *
 * @author Pablo
 */
public class MatematicaServicio {
    Matematica mat = new Matematica();
    //Funcion creacion de objeto, devuelve inicializacion al main.
    public Matematica crearMatematica(){
        mat.setNum1(Math.random()*10);
        mat.setNum2(Math.random()*10);
        return mat;
    }
    
    public void mostrar(Matematica mat){
        System.out.println("El valor mas grande en el objeto es " + mat.devolverMayor());
        
        System.out.println("Se calculara la potencia del numero mayor elevado al numero menor" + mat.calcularPotencia());
        
        System.out.println("Se mostrara la raiz cuadrada del numero menor" + mat.calcularRaiz());
    }
}
