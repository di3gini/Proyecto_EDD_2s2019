/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

/**
 *
 * @author di3go
 */
public class NodoCategoriaProducto {

    private String nombre_categoria;
    private int codigo_categoria;
    private NodoCategoriaProducto abajo;
    private NodoProducto siguiente;

    public void NodoCategoriaProducto() {
        this.nombre_categoria = "";
        this.codigo_categoria = 0;
        this.abajo = null;
        this.siguiente = null;
    }

    public NodoCategoriaProducto(String nombre_categoria, int codigo_categoria) {
        this.nombre_categoria = nombre_categoria;
        this.codigo_categoria = codigo_categoria;
        this.abajo = null;
        this.siguiente = null;
    }

    public String getNombre_categoria() {
        return nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }

    public int getCodigo_categoria() {
        return codigo_categoria;
    }

    public void setCodigo_categoria(int codigo_categoria) {
        this.codigo_categoria = codigo_categoria;
    }

    public NodoCategoriaProducto getAbajo() {
        return abajo;
    }

    public void setAbajo(NodoCategoriaProducto abajo) {
        this.abajo = abajo;
    }

    public NodoProducto getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoProducto siguiente) {
        this.siguiente = siguiente;
    }
}
