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
public class ListaUsuarios {
    public NodoUsuarios siguiente;
    boolean bandera = false;
    //public String fecha;

    private static ListaUsuarios instancia = null;
    
    public static ListaUsuarios getInstancia(){
        if (instancia == null){
            instancia = new ListaUsuarios();
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

    public void insertarUsuario(String usuario, String pass, String sucursal) {

        NodoUsuarios n = new NodoUsuarios(usuario, pass, sucursal);

        if (Vacia()) {
            siguiente = n;
        } else {

            NodoUsuarios aux = siguiente;

            while (aux.getSiguiente() != null) {

                aux = aux.getSiguiente();

            }
            aux.setSiguiente(n);
        }

    }

    public String verUsuario() {
        String datos = "";
        NodoUsuarios aux = siguiente;
        while (aux != null) {

            datos += aux.getUsuario() + "," + aux.getSucursal() + "\n";

            //System.out.println(datos);
            aux = aux.getSiguiente();

        }
        System.out.println(datos);
        return datos;
    }
    public boolean validarUsuario(String usuario, String pass){
        
        NodoUsuarios aux = siguiente;
        while (aux != null) {

            if(aux.getUsuario() == usuario && aux.getPass() == pass){
                return true;
            }
            //System.out.println(datos);
            aux = aux.getSiguiente();
        }
        return false;
        
    }

}
