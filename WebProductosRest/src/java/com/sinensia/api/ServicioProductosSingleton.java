/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.api;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ServicioProductosSingleton {

    private ArrayList<Producto> listaProductos;
    public ServicioProductosSingleton servProd;

    public void eliminar(String nombre) {

        for (int i = 0; i < listaProductos.size(); i++) {
            Producto p = new Producto();
            p = listaProductos.get(i);
            if (p.getNombre().toLowerCase().trim().equals(nombre.toLowerCase().trim())) {
                listaProductos.remove(i);
            }
        }
    }

    public void insertar(Producto p) {
        listaProductos.add(p);
    }

    public Producto modificar(Producto p) {
        p.setNombre(p.getNombre() + " - Modificado");
        p.setPrecio(p.getPrecio() + " - Modificado");
        return p;
    }

    public ArrayList<Producto> obtenerTodos() {
        return listaProductos;
    }

    private final static ServicioProductosSingleton instancia = new ServicioProductosSingleton();

    private ServicioProductosSingleton() {
        this.listaProductos = new ArrayList();

    }

    public static ServicioProductosSingleton getInstancia() {
        return instancia;
    }
}
