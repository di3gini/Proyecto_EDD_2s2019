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
public class ListaProductos {

    public NodoCategoriaProducto abajo;
    public NodoProducto siguiente;
    int tamano;

    private static ListaProductos instancia = null;

    public static ListaProductos getInstancia() {
        if (instancia == null) {
            instancia = new ListaProductos();

        }
        return instancia;
    }

    public boolean Vacia() {
        if (abajo == null) {
            return true;
        } else {
            return false;
        }
    }

    public int tamano() {
        return tamano;
    }

    public void insertar_categoria(int codigo, String data) {
        NodoCategoriaProducto n = new NodoCategoriaProducto(data, codigo);

        if (buscar_categoria(codigo) == true) {

        } else {
            if (Vacia()) {
                abajo = n;

            } else {

                NodoCategoriaProducto aux = abajo;

                while (aux.getAbajo() != null) {

                    aux = aux.getAbajo();

                }
                aux.setAbajo(n);

            }

        }

        tamano++;
    }

    public boolean buscar_categoria(int codigo) {
        boolean bandera = false;

        NodoCategoriaProducto aux = abajo;

        while (aux != null) {
            if (aux.getCodigo_categoria() == codigo) {
                bandera = true;
                break;
            }
            aux = aux.getAbajo();

        }
        return bandera;
    }
    
    public boolean buscar_categoria_nombre(String categoria) {
        boolean bandera = false;

        NodoCategoriaProducto aux = abajo;

        while (aux != null) {
            if (aux.getNombre_categoria().equals(categoria)) {
                bandera = true;
                break;
            }
            aux = aux.getAbajo();

        }
        return bandera;
    }

    public void insertar_Producto(int codigo_producto, int precio_compra, int precio_venta, int cantidad_producto, String descripcion, String categoria) {
        NodoProducto n = new NodoProducto(codigo_producto, precio_compra, precio_venta, cantidad_producto, descripcion, categoria);

        siguiente = buscarNodo(categoria);

        if (siguiente == null) {

            siguiente = n;
            insertar_nodo_siguiente(categoria, n);
        } else {

            NodoProducto aux = siguiente;

            while (aux.getSiguiente() != null) {

                aux = aux.getSiguiente();

            }
            aux.setSiguiente(n);

        }
    }

    private NodoProducto buscarNodo(String categoria) {
        NodoProducto l = null;
        NodoCategoriaProducto aux = abajo;

        while (aux != null) {

            if (aux.getNombre_categoria().equals(categoria)) {
                System.out.println("se econtro origen");
                l = aux.getSiguiente();
                break;
            }
            //System.out.println(datos);
            aux = aux.getAbajo();
        }
        return l;
    }

    private void insertar_nodo_siguiente(String categoria, NodoProducto n) {
        NodoCategoriaProducto aux = abajo;

        while (aux != null) {

            if (aux.getNombre_categoria().equals(categoria)) {
                System.out.println("se econtro origen");
                aux.setSiguiente(n);
                break;
            }
            //System.out.println(datos);
            aux = aux.getAbajo();
        }
    }
    
    public String ImprimirCategorias() {
        String datos = "";
        NodoCategoriaProducto aux = abajo;
        while (aux != null) {

            datos += aux.getCodigo_categoria()+ "," + aux.getNombre_categoria()+ "\n";

            //System.out.println(datos);
            aux = aux.getAbajo();

        }
        System.out.println(datos);
        return datos;
    }
    
    public String ImprimirProductoCategoria(String categoria) {
        String datos = "";
        siguiente = buscarNodo(categoria);

        NodoProducto aux = siguiente;

        while (aux != null) {

            datos += aux.getCodigo_producto()+", "+aux.getDescripcion()+", "+ aux.getPrecio_venta()+"\n";

            //System.out.println(datos);
            aux = aux.getSiguiente();

        }
        System.out.println(datos);
        return datos;
    }
}
