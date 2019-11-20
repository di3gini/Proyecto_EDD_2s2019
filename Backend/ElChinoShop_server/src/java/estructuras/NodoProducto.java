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
public class NodoProducto {

    private int codigo_producto;
    private int precio_compra;
    private int precio_venta;
    private int cantidad_producto;
    private String descripcion;
    private String categoria;
    private NodoProducto siguiente;

    public void NodoProducto() {
        this.cantidad_producto = 0;
        this.codigo_producto = 0;
        this.precio_compra = 0;
        this.precio_venta = 0;
        this.categoria = "";
        this.descripcion="";
        this.siguiente = null;
    }

    public NodoProducto(int codigo_producto, int precio_compra, int precio_venta, int cantidad_producto,String descripcion ,String categoria) {
        this.codigo_producto = codigo_producto;
        this.precio_compra = precio_compra;
        this.precio_venta = precio_venta;
        this.cantidad_producto = cantidad_producto;
        this.categoria = categoria;
        this.descripcion=descripcion;
        this.siguiente = null;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(int codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public int getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(int precio_compra) {
        this.precio_compra = precio_compra;
    }

    public int getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(int precio_venta) {
        this.precio_venta = precio_venta;
    }

    public int getCantidad_producto() {
        return cantidad_producto;
    }

    public void setCantidad_producto(int cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public NodoProducto getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoProducto siguiente) {
        this.siguiente = siguiente;
    }

}
