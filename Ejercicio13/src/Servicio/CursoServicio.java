/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class CursoServicio {
//importa clase y objeto scanner.
    Curso curso = new Curso();
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
//Funcion devuelve un vector lleno con la dimension y valores requeridos por su llamada.
    private String[] cargarAlumnos(Curso curso) {
        String[] a = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese nombre del alumno " + (i + 1));
            a[i] = scan.next();
        }
        return a;
    }
//Funcion devuelve un string segun corresponda
    private String turnoMt(String a) {
        String turno = "";
        switch (a.toUpperCase()) {
            case "M":
                turno = "Turno Mañana";
                break;
            case "T":
                turno = "Turno Tarde";
                break;
            default:
                System.out.println("Ingrese valor valido");
        }
        return turno;
    }
//Funcion inicializa valores del objeto Curso.

    public Curso crearCurso() {
        System.out.println("Ingrese nombre curso");
        curso.setNombreCurso(scan.next());

        System.out.println("Ingrese horas de cursado por día");
        curso.setHorasDia(scan.nextInt());

        System.out.println("Ingrese numero de dias por semana del cursado");
        curso.setDiasSemana(scan.nextInt());

        System.out.println("Ingrese turno: M mañana, T tarde");
        do {
            curso.setTurno(turnoMt(scan.next()));
        } while (!curso.getTurno().equals("Turno Mañana")
                && !curso.getTurno().equals("Turno Tarde"));

        System.out.println("Ingrese valor hora");
        curso.setPrecioHora(scan.nextDouble());

        System.out.println("El curso tiene un cupo de 5 alumnos");
        curso.setAlumnos(cargarAlumnos(curso));
        return curso;
    }

    public void calcularGananciaSemanal(Curso curso) {
        /*multiplicar la cantidad de horas por 
        día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que 
        se repite el encuentro.
         */
        double total = curso.getHorasDia() * curso.getPrecioHora() * 5 * curso.getDiasSemana();
        System.out.println("La ganancia semanal de el curso " + curso.getNombreCurso() + " es usd"
                + total);
    }
}
