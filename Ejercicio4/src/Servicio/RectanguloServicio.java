/*
 * Esta clase se encarga de todo el proceso lógico del ejercicio.
 */
package Servicio;
import Entidad.Rectangulo;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */

//Funcion devuelve un objeto lleno al Main.

public class RectanguloServicio {
    Rectangulo r1 = new Rectangulo();
    Scanner scan = new Scanner(System.in);
    public Rectangulo crearRectangulo(){
        System.out.println("Ingrese base rectangulo");
        r1.setBase(scan.nextInt());
        System.out.println("Ingrese altura rectangulo");
        r1.setAltura(scan.nextInt());
        return r1;
    }
    //Subproceso muestra superficie del objeto que toma como parametro
    public void superficie(Rectangulo r1){
        System.out.println("La superficie de este rectangulo es de: " + r1.getBase()*r1.getAltura());
    }
    //Subproceso muestra el perimetro del objeto que toma como parametro
    public void perimetro(Rectangulo r1){
        System.out.println("El perímetro de este rectangulo es de: " + (r1.getBase() + r1.getAltura())*2);
    }
    //Subproceso dibuja bordes del objeto que toma como parametro
    public void dibujar(Rectangulo r1){
        for (int i = 0; i < r1.getAltura(); i++) {
            for (int j = 0; j < r1.getBase(); j++) {
                if( i == 0 || i == (r1.getAltura()-1)){
                    System.out.print(" * ");
                }else if (j == 0 || j == (r1.getBase()-1)){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }
}
