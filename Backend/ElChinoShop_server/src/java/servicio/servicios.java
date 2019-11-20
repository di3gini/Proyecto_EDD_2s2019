/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import estructuras.ListaFechas;
import estructuras.LIstaClientes;
import estructuras.ListaProductos;
import estructuras.ListaUsuarios;

/**
 *
 * @author WORKSTATION
 */
@WebService(serviceName = "servicios")
public class servicios {

    /**
     * This is a sample web service operation
     */
    
    
    /*
    ============================================================================================================
    ============================================================================================================
    ====================================== cubo de operaicones de compras ======================================
    ============================================================================================================
    ============================================================================================================
    */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    @WebMethod(operationName = "insertar_venta_fecha", action = "insertar_venta_fecha")
    public boolean InsertarVenta(@WebParam(name = "fecha") String fecha, @WebParam(name = "codigo") int cod_cliente, @WebParam(name = "data") String data) {
        ListaFechas ad = ListaFechas.getInstancia();
        ad.venta(fecha, data, cod_cliente);
        return true;
    }

    @WebMethod(operationName = "insertar_fecha", action = "insertar_fecha")
    public boolean InsertarFecha(@WebParam(name = "fecha") String fecha) {
        ListaFechas ad = ListaFechas.getInstancia();
        ad.insertarFecha(fecha);
        return true;
    }

    @WebMethod(operationName = "verificar_fecha", action = "verificar_fecha")
    public boolean VerificarFecha(@WebParam(name = "fecha") String fecha) {
        ListaFechas ad = ListaFechas.getInstancia();
        boolean bandera = ad.buscar_fecha(fecha);
        return bandera;
    }

    @WebMethod(operationName = "imprimir_fechas", action = "imprimir_fechas")
    public String ImprimirArbolB() {
        ListaFechas btr = ListaFechas.getInstancia();
        return btr.ImprimirFechas();
    }
    
    @WebMethod(operationName = "imprimir_cliente_fila", action = "imprimir_cliente_fila")
    public String ImprimirClientesFila(@WebParam(name = "fecha") String fecha) {
        ListaFechas btr = ListaFechas.getInstancia();
        return btr.ImprimirClientesfila(fecha);
    }
    
    @WebMethod(operationName = "imprimir_cliente_filacolumna", action = "imprimir_cliente_filacolumna")
    public String ImprimirClientesFilaColumna(@WebParam(name = "fecha") String fecha,@WebParam(name = "codigo") int codigo) {
        ListaFechas btr = ListaFechas.getInstancia();
        return btr.ImprimirClientesfilaColumna(fecha,codigo);
    }
    /*
    ============================================================================================================
    ============================================================================================================
    ========================================== matriz de producto ==============================================
    ============================================================================================================
    ============================================================================================================
    */
    
     @WebMethod(operationName = "insertar_categoria", action = "insertar_categoria")
    public boolean InsertarCategoria(@WebParam(name = "nombre_categoria") String nombre,@WebParam(name = "codigo") int codigo) {
        ListaProductos btr = ListaProductos.getInstancia();
        btr.insertar_categoria(codigo,nombre);
        return true;
    }
    
    @WebMethod(operationName = "insertar_productos", action = "insertar_productos")
    public boolean InsertarProductos(@WebParam(name = "codigo_producto") int codigo,@WebParam(name = "precio_compra") int precio_compra,@WebParam(name = "precio_venta") int precio_venta,@WebParam(name = "cantidad_producto") int cantidad_producto,@WebParam(name = "descripcion") String descripcion,@WebParam(name = "categoria") String categoria) {
        ListaProductos btr = ListaProductos.getInstancia();
        btr.insertar_Producto(codigo, precio_compra, precio_venta, cantidad_producto, descripcion, categoria);
        return true;
    }
    
    @WebMethod(operationName = "imprimir_categorias", action = "imprimir_categoria")
    public String ImprimirCategorias() {
        ListaProductos btr = ListaProductos.getInstancia();
        return btr.ImprimirCategorias();
    }
    
    @WebMethod(operationName = "imprimir_producto_categoria", action = "imprimir_producto_categoria")
    public String ImprimirProductoCategoria(@WebParam(name = "categoria") String categoria) {
        ListaProductos btr = ListaProductos.getInstancia();
        return btr.ImprimirProductoCategoria(categoria);
    }
    
    @WebMethod(operationName = "verificar_categoria_codigo", action = "verificar_categoria_codigo")
    public boolean VerificarCategoriaCodigo(@WebParam(name = "codigo") int codigo) {
        ListaProductos ad = ListaProductos.getInstancia();
        boolean bandera = ad.buscar_categoria(codigo);
        return bandera;
    }
    @WebMethod(operationName = "verificar_categoria_nombre", action = "verificar_categoria_nombre")
    public boolean VerificarCategoriaNombre(@WebParam(name = "nombre") String nombre) {
        ListaProductos ad = ListaProductos.getInstancia();
        boolean bandera = ad.buscar_categoria_nombre(nombre);
        return bandera;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "validarUsuario")
    public boolean validarUsuario(@WebParam(name = "usuario") String usuario, @WebParam(name = "contrasena") String contrasena) {
        //TODO write your implementation code here:
        ListaUsuarios usr = ListaUsuarios.getInstancia();
        return usr.validarUsuario(usuario, contrasena);
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "insertarUsuario")
    public String insertarUsuario(@WebParam(name = "usuario") String usuario, @WebParam(name = "pass") String pass, @WebParam(name = "sucursal") String sucursal) {
        //TODO write your implementation code here:
        ListaUsuarios usr = ListaUsuarios.getInstancia();
        usr.insertarUsuario(usuario, pass, sucursal);
        return "se inserto";
        
    }
}
