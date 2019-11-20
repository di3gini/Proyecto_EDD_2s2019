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
public class LIstaClientes {
    public NodoCliente siguiente;
    boolean bandera = false;
    //public String fecha;

    private static LIstaClientes instancia = null;
    
    public static LIstaClientes getInstancia(){
        if (instancia == null){
            instancia = new LIstaClientes();
            
        }
        return instancia;
    }
    
    public boolean Vacia() {
        if (siguiente == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insertarCliente(String nombre, String nit) {

        NodoCliente n = new NodoCliente(nombre, nit);

        if (Vacia()) {
            siguiente = n;
        } else {

            NodoCliente aux = siguiente;

            while (aux.getSiguiente() != null) {

                aux = aux.getSiguiente();

            }
            aux.setSiguiente(n);
        }

    }

    public String verCliente() {
        String datos = "";
        NodoCliente aux = siguiente;
        while (aux != null) {

            datos += aux.getNit() + "," + aux.getNombre() + "\n";

            //System.out.println(datos);
            aux = aux.getSiguiente();

        }
        System.out.println(datos);
        return datos;
    }
}
