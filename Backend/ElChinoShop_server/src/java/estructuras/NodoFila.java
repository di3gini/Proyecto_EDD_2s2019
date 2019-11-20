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
public class NodoFila {

    
    public int codigo_cliente;
    public NodoFila fila;
    public NodoColumna columna;

    public void NodoFila() {
     
        this.codigo_cliente = 0;
        this.columna = null;
        this.fila = null;
    }

    public NodoFila(int codigo_cliente) {
   
        this.codigo_cliente = codigo_cliente;
        this.columna = null;
        this.fila = null;
    }

   

    public int getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(int codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    public NodoFila getFila() {
        return fila;
    }

    public void setFila(NodoFila fila) {
        this.fila = fila;
    }

    public NodoColumna getColumna() {
        return columna;
    }

    public void setColumna(NodoColumna columna) {
        this.columna = columna;
    }

}
