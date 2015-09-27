/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensode.controller;

import com.ensode.ejb.HacerPedidoEJB;
import com.ensode.jpa.ArregloFloral;
import com.ensode.jpa.Pedido;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.DataModel;
import javax.inject.Named;
import org.primefaces.component.datatable.DataTable;

/**
 *
 * @author alfredo
 */
@Named(value = "hacerPedidoController")
@RequestScoped
public class HacerPedidoController {
    LanguageSwitcher lenguajeSwitcher = new LanguageSwitcher();
    private DataModel arreglosFlorales;
    private ArregloFloral selectedPedido;
    private List<ArregloFloral> arregloslist;
    private DataTable tablaPedidos;
    
    @EJB
    private HacerPedidoEJB hacerPedidoEJB; 
    
    
     public List<Pedido> obtainPedidos() {
        Long id;
        //id = CustomerController.selectedCust2.getId();
        //List<Pedido> lista = hacerPedidoEJB.findPedidoByCustomer(id);
        List<Pedido> lista = new ArrayList<Pedido>();
        return lista;
    }
     
    public String navigateToBack() {
        //Save new customer data to database.
        lenguajeSwitcher.recordarIdioma();
        return "void";
    }
     
    public LanguageSwitcher getLenguajeSwitcher() {
        return lenguajeSwitcher;
    }

    public void setLenguajeSwitcher(LanguageSwitcher lenguajeSwitcher) {
        this.lenguajeSwitcher = lenguajeSwitcher;
    }

    public DataModel getArreglosFlorales() {
        return arreglosFlorales;
    }

    public void setArreglosFlorales(DataModel arreglosFlorales) {
        this.arreglosFlorales = arreglosFlorales;
    }

    public ArregloFloral getSelectedPedido() {
        return selectedPedido;
    }

    public void setSelectedPedido(ArregloFloral selectedPedido) {
        this.selectedPedido = selectedPedido;
    }

    public List<ArregloFloral> getArregloslist() {
        return arregloslist;
    }

    public void setArregloslist(List<ArregloFloral> arregloslist) {
        this.arregloslist = arregloslist;
    }

    public DataTable getTablaPedidos() {
        return tablaPedidos;
    }

    public void setTablaPedidos(DataTable tablaPedidos) {
        this.tablaPedidos = tablaPedidos;
    }

    public HacerPedidoEJB getHacerPedidoEJB() {
        return hacerPedidoEJB;
    }

    public void setHacerPedidoEJB(HacerPedidoEJB hacerPedidoEJB) {
        this.hacerPedidoEJB = hacerPedidoEJB;
    }
     
     
}
