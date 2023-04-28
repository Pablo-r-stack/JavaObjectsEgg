/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;
import java.util.Scanner;
import java.util.Date;
import Entidad.Persona;
/**
 *
 * @author Pablo
 */

public class ServicioPersona {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    Persona p1 = new Persona();
    //Funcion inicializa valores del objeto.
    public Persona crearPersona(){
        System.out.println("Como es tu nombre?");
        String nombre = scan.next();
        System.out.println("En que año naciste?");
        int anio = scan.nextInt();
        System.out.println("En que mes naciste?");
        int mes = scan.nextInt();
        System.out.println("Que numero de dia naciste?");
        int dia = scan.nextInt();
        return new Persona(nombre, new Date(anio-1900, mes-1, dia));
    }
    //Funcion devuelve un int con la edad de la persona, un ifelse valida que el el mes y dia sea >= a la fecha de nacimiento,
    //de lo contrario aun NO CUMPLE AÑOS
    public int calcularEdad(Persona p1){
        Date date = new Date();
        if((p1.getFechaNacimiento().getMonth()< date.getMonth() || (p1.getFechaNacimiento().getMonth()== date.getMonth() && p1.getFechaNacimiento().getDate()<= date.getDate()))){
            return (date.getYear()-p1.getFechaNacimiento().getYear());
        } else{
            return ((date.getYear()-p1.getFechaNacimiento().getYear())-1);
        }
    }
    //Retorna true o false segun la comparación pedida
    public boolean menorQue(Persona p1, int edad2){
        int edad = calcularEdad(p1);
        return edad < edad2; 
    }
    //Subproceso muestra los datos requeridos por el ejercicio.
    public void mostrarPersona(Persona p1){
        System.out.println("Ingrese edad a comparar ");
        if(menorQue(p1, scan.nextInt())){
            System.out.println("La edad ingresada es mayor que " + p1.getNombre());
        }else{
            System.out.println(p1.getNombre() + " es mayor!");
        }
        System.out.println("Nombre : " + p1.getNombre() + "\n edad : " + calcularEdad(p1));
    }
}