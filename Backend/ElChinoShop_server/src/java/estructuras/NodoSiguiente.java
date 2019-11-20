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
public class NodoSiguiente {

    private String fecha;
    private matriz ventas;
    private NodoSiguiente siguiente;

    public void NodoSiguiente() {
        this.fecha = "";
        this.ventas = null;
        this.siguiente = null;
    }

    public NodoSiguiente(String fecha, matriz ventas) {
        this.fecha = fecha;
        this.ventas = ventas;
        this.siguiente = null;
    }

    public NodoSiguiente getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSiguiente siguiente) {
        this.siguiente = siguiente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public matriz getVentas() {
        return ventas;
    }

    public void setVentas(matriz ventas) {
        this.ventas = ventas;
    }

}
