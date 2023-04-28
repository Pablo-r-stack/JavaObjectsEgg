/*
 * Ejercicios de practica y estudio referentes al curso de fullstack egg coop.
 */
package poogej1.Servicios;
import java.util.Scanner;
import poogej1.entidad.Libro;
/**
 *
 * @author Pablo
 */
public class ServicioLibro {
    Scanner sc = new Scanner(System.in);
    
    public Libro crearLibro(){
        System.out.println("Ingrese titulo del libro");
        String titulo = sc.nextLine();
        
        System.out.println("Ingrese autor del Libro");
        String autor = sc.nextLine();
        
        System.out.println("Ingrese nro de paginas");
        int nroPaginas = sc.nextInt();
        
        System.out.println("Ingrese ISBN");
        int isbn = sc.nextInt();
        
        return new Libro(titulo, isbn, autor, nroPaginas);
    }
    
}
