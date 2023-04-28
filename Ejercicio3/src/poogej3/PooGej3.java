/*
 *Crear una clase llamada Operacion que tenga como atributos privados numero1 y 
 *numero2. A continuación, se deben crear los siguientes métodos: 
    a) Método constructor con todos los atributos pasados por parámetro. 
    b) Metodo constructor sin los atributos pasados por parámetro. 
    c) Métodos get y set. 
    d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda 
       en los atributos del objeto. 
    e) Método sumar(): calcular la suma de los números y devolver el resultado al main. 
    f) Método restar(): calcular la resta de los números y devolver el resultado al main 
    g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si 
     fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. 
     Si no, se hace la multiplicación y se devuelve el resultado al main 
    h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar 
     una división por cero, el método devuelve 0 y se le informa al usuario el error se le 
     informa al usuario. Si no, se hace la división y se devuelve el resultado al main. 
 */
package poogej3;

import Servicio.OperacionServicio;
import Entidad.Operacion;
/**
 *
 * @author Pablo
 */
public class PooGej3 {

    /**
     * Se importa servicio y objeto
     * El servicio realiza la lógica del ejercicio
     * Se imprimen resultados en base a valores ingresados.
     */
    public static void main(String[] args) {
        OperacionServicio os = new OperacionServicio();
        Operacion op = os.crearOperacion();
        
        System.out.println("el resultado de " + op.getNum1() + " + " + op.getNum2() + " = " + os.sumar(op));
        
        System.out.println("el resultado de " + op.getNum1() + " - " + op.getNum2() + " = " + os.restar(op));
        
        System.out.println("el resultado de " + op.getNum1() + " * " + op.getNum2() + " = " + os.multiplicar(op));
        
        System.out.println("el resultado de " + op.getNum1() + " / " + op.getNum2() + " = " + os.dividir(op));
    }
    
}
