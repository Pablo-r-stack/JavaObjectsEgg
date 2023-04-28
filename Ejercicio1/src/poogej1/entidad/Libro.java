/*
 * Ejercicios de practica y estudio referentes al curso de fullstack egg coop.
 */
package poogej1.entidad;

/**
 *
 * @author Pablo
 */
public class Libro {
    private String titulo;
    private int isbn;
    private String autor;
    private int nroPaginas;
    //constructores
    public Libro(String titulo, int isbn, String autor, int nroPaginas){
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.nroPaginas = nroPaginas;
    }
    
    public Libro(){
    }
    
    //setters

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNroPaginas(int nroPaginas) {
        this.nroPaginas = nroPaginas;
    }
    
    //getters

    public String getTitulo() {
        return titulo;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getAutor() {
        return autor;
    }

    public int getNroPaginas() {
        return nroPaginas;
    }

    //metodo toString
    
    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", isbn=" + isbn + ", autor=" + autor + ", nroPaginas=" + nroPaginas + '}';
    }
      
    
}
