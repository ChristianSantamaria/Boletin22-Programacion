/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin22;


/**
 *
 * @author csantamariacameselle
 */
public class Libros {
    public String titulo;
    public String autor;
    public String ISBN;
    public int prezo;
    public int n_unidades;

    public Libros(String titulo, String autor, String ISBN, int prezo, int n_unidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.prezo = prezo;
        this.n_unidades = n_unidades;
    }

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

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPrezo() {
        return prezo;
    }

    public void setPrezo(int prezo) {
        this.prezo = prezo;
    }

    public int getN_unidades() {
        return n_unidades;
    }

    public void setN_unidades(int n_unidades) {
        this.n_unidades = n_unidades;
    }
    
    
    
    @Override
    public String toString() {
        return "Titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", prezo=" + prezo + ", n_unidades=" + n_unidades;
    }
    
    
    
    
    
}
