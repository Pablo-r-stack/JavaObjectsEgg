/*
 * Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
 * definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
 * vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
 * además definir los métodos getters y setters correspondientes.
 */
package Entidad;

/**
 *
 * @author Pablo
 */
public class Cancion {
    //atributos
    private String titulo;
    private String autor;

    //Constructor sin parametros (inicializa atributos vacios como pide el ejercicio(aunque se inicializen vacios por defecto).
    public Cancion() {
        this.titulo = "";
        this.autor = "";
    }

    //Constructor con parametros
    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    
    //Getter&Setter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    //Metodo ToString se modifico levemente para mayor legibilidad e interpretación.
    @Override
    public String toString() {
        return "Objeto : Cancion{" + "titulo: " + titulo + ", autor: " + autor + '}';
    }
    
}
