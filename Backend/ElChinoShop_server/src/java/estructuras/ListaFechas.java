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
public class ListaFechas {

    public NodoSiguiente siguiente;
    boolean bandera = false;
    //public String fecha;
    public matriz ventas;

    private static ListaFechas instancia = null;

    public static ListaFechas getInstancia() {
        if (instancia == null) {
            instancia = new ListaFechas();

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

    public void insertarFecha(String fecha) {

        ventas = new matriz();

        NodoSiguiente n = new NodoSiguiente(fecha, ventas);

        if (Vacia()) {
            siguiente = n;
        } else {

            NodoSiguiente aux = siguiente;

            while (aux.getSiguiente() != null) {

                aux = aux.getSiguiente();

            }
            aux.setSiguiente(n);
        }

    }

    public String ImprimirFechas() {
        String datos = "";
        NodoSiguiente aux = siguiente;
        while (aux != null) {

            datos += aux.getFecha() + "," + aux.getVentas().tamano() + "\n";

            //System.out.println(datos);
            aux = aux.getSiguiente();

        }
        System.out.println(datos);
        return datos;
    }

    public String ImprimirClientesfila(String fecha) {

        String datos = "";
        NodoSiguiente aux = siguiente;

        while (aux != null) {
            if (aux.getFecha().equals(fecha)) {
                datos+=aux.getVentas().ImprimirColumnaCliente();
                break;
            }
            aux = aux.getSiguiente();

        }
        return datos;
    }
    
    public String ImprimirClientesfilaColumna(String fecha, int codigo) {

        String datos = "";
        NodoSiguiente aux = siguiente;

        while (aux != null) {
            if (aux.getFecha().equals(fecha)) {
                datos+=aux.getVentas().ImprimirFilaCliente(codigo);
                break;
            }
            aux = aux.getSiguiente();

        }
        return datos;
    }

    public boolean buscar_fecha(String fecha) {

        NodoSiguiente aux = siguiente;

        while (aux != null) {
            if (aux.getFecha().equals(fecha)) {
                bandera = true;
                break;
            }
            aux = aux.getSiguiente();

        }
        return bandera;
    }

    public void venta(String fecha, String data, int codigo) {
        NodoSiguiente aux = siguiente;
        while (aux != null) {

            if (aux.getFecha().equals(fecha)) {
                System.out.println("se encontro fecha");
                aux.getVentas().insertar_cliente_venta(codigo, data);
            }
            //System.out.println(datos);
            aux = aux.getSiguiente();
        }
    }

}
