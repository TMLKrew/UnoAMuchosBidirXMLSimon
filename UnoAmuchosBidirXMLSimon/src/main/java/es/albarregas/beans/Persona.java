/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.beans;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Simon
 */
public class Persona implements Serializable{
    
    private Long idPerso;
    private String nombre;
    private List<Libro> libros;

    public Long getIdPerso() {
        return idPerso;
    }

    public void setIdPerso(Long idPerso) {
        this.idPerso = idPerso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
       
}
