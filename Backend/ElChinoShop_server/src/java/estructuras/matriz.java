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
public class matriz {

    public NodoColumna columna;
    public NodoFila fila;
    public int tamano;
//    public String cliente;
//    public int codigo;

    public boolean Vacia() {
        if (fila == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean Vacia2(NodoColumna col) {
        if (col == null) {
            return true;
        } else {
            return false;
        }
    }

    public int tamano() {
        return tamano;
    }

    public void insertar_cliente_venta(int codigo, String data) {
        NodoFila n = new NodoFila(codigo);

        if (buscar_cliente(codigo) == true) {
            insertar_venta(data, codigo);
        } else {
            if (Vacia()) {
                fila = n;
                
            } else {

                NodoFila aux = fila;

                while (aux.getFila() != null) {

                    aux = aux.getFila();

                }
                aux.setFila(n);
                
            }
            insertar_venta(data, codigo);
        }

        tamano++;
    }

    public boolean buscar_cliente(int codigo) {

        boolean bandera = false;

        NodoFila aux = fila;

        while (aux != null) {
            if (aux.getCodigo_cliente() == codigo) {
                bandera = true;
                break;
            }
            aux = aux.getFila();

        }
        return bandera;
    }

    public void insertar_venta(String data, int codigo) {

        NodoColumna n = new NodoColumna(data);

        columna = buscar_nodo(codigo);

        if (columna == null) {

            columna = n;
            insertar_nodo_fila(codigo, n);
        } else {

            NodoColumna aux = columna;

            while (aux.getColumna() != null) {

                aux = aux.getColumna();

            }
            aux.setColumna(n);

        }
    }

    public String ImprimirColumnaCliente() {
        String datos = "";
        NodoFila aux = fila;
        while (aux != null) {

            datos += aux.getCodigo_cliente() + "," + aux.getColumna() + "\n";

            //System.out.println(datos);
            aux = aux.getFila();

        }
        System.out.println(datos);
        return datos;
    }

    public String ImprimirFilaCliente(int codigo) {
        String datos = "";
        columna = buscar_nodo(codigo);

        NodoColumna aux = columna;

        while (aux != null) {

            datos += aux.getData() + "\n";

            //System.out.println(datos);
            aux = aux.getColumna();

        }
        System.out.println(datos);
        return datos;
    }

    private NodoColumna buscar_nodo(int codigo) {
        NodoColumna l = null;
        NodoFila aux = fila;

        while (aux != null) {

            if (aux.getCodigo_cliente() == codigo) {
                System.out.println("se econtro origen");
                l = aux.getColumna();
                break;
            }
            //System.out.println(datos);
            aux = aux.getFila();
        }
        return l;
    }

    private void insertar_nodo_fila(int codigo, NodoColumna col) {

        NodoFila aux = fila;

        while (aux != null) {

            if (aux.getCodigo_cliente() == codigo) {
                System.out.println("se econtro origen");
                aux.setColumna(col);
                break;
            }
            //System.out.println(datos);
            aux = aux.getFila();
        }
        
    }
}
