/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;
import Entidad.Movil;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class MovilServicio {
    Movil m1 = new Movil();
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    //Funcion inicializa y devuelve objeto lleno al Main.
    public Movil cargarCelular(){
        
        System.out.println("Ingrese marca de movil");
        m1.setMarca(scan.next());
        
        System.out.println("Ingrese precio");
        m1.setPrecio(scan.nextDouble());
        
        System.out.println("Ingrese modelo");
        m1.setModelo(scan.next());
        
        System.out.println("Ingrese cantidad memoria Ram");
        m1.setRam(scan.nextInt());
        
        System.out.println("Ingrese codigo");
        int[] codigo = ingresarCodigo();
        m1.setCodigo(codigo);
        
        return m1;
    }
    //Funcion devuelve un arreglo lleno con los valores ingresados por teclado.
    private int[] ingresarCodigo(){
        Scanner scan = new Scanner(System.in);
        int[] c1 = new int[7];
        
        for (int i = 0; i < 7; i++) {
           c1[i] =  scan.nextInt();
        }
        return c1;
    }
}
