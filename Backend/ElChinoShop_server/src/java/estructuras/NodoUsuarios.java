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
public class NodoUsuarios {
    private String usuario;
    private String pass;
    private String sucursal;
    private NodoUsuarios siguiente;
    public void NodoSiguiente() {
        this.usuario = "";
        this.pass = "";
        this.sucursal = "";
        this.siguiente = null;
    }

    public NodoUsuarios(String usuario, String pass, String sucursal) {
        this.usuario = usuario;
        this.pass = pass;
        this.sucursal = sucursal;
        this.siguiente = null;
    }

    public NodoUsuarios getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoUsuarios siguiente) {
        this.siguiente = siguiente;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return this.pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public void setSucursal(String sucursal){
        this.sucursal = sucursal;
    }
    public String getSucursal(){
        return this.sucursal;
    }
}
