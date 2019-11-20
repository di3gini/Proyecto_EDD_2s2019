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
public class NodoCliente {
    private String Nombre;
    private String Nit;
    private NodoCliente siguiente;
    public void NodoSiguiente() {
        this.Nombre = "";
        this.Nit = "";
        this.siguiente = null;
    }

    public NodoCliente(String usuario, String nit) {
        this.Nombre = usuario;
        this.Nit = nit;
        ;
        this.siguiente = null;
    }

    public NodoCliente getSiguiente() {
        return this.siguiente;
    }

    public void setSiguiente(NodoCliente siguiente) {
        this.siguiente = siguiente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setUsuario(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNit() {
        return this.Nit;
    }

    public void setPass(String nit) {
        this.Nit = nit;
    }
   
}
