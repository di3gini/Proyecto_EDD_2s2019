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
public class NodoColumna {
    public String data;
    public NodoColumna columna;
    
    public void Nodocolumna(){
        this.data="";
        this.columna=null;
    }
    
    public NodoColumna(String data){
        this.data=data;
        this.columna=null;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public NodoColumna getColumna() {
        return columna;
    }

    public void setColumna(NodoColumna columna) {
        this.columna = columna;
    }
    
    
    
}
