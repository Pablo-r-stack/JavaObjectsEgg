/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;
import Entidad.Operacion;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class OperacionServicio {
    Operacion op = new Operacion();
    Scanner scan = new Scanner(System.in);
    //funcion devuelve un objeto lleno al main.
    public Operacion crearOperacion(){
        System.out.println("Ingrese valor número 1");
        op.setNum1(scan.nextInt());
        System.out.println("Ingrese valor número 2");
        op.setNum2(scan.nextInt());
        return op;
    }
    
    //funcion suma
    public int sumar(Operacion op){
        return  op.getNum1() + op.getNum2();
    }
    //funcion resta
    public int restar(Operacion op){
        return op.getNum1() - op.getNum2();
    }
    //funcion multiplicar
    public int multiplicar(Operacion op){
        if(op.getNum1() == 0 || op.getNum2() == 0){
            System.out.println("Error");
            return 0;
        } else{
            return op.getNum1() * op.getNum2();
        }
    }
    //funcion dividir
    public double dividir(Operacion op){
        if(op.getNum1() == 0 || op.getNum2() == 0){
            System.out.println("Error");
            return 0;
        }else{
            return ((double)op.getNum1()/(double)op.getNum2());
        }
    }
}
