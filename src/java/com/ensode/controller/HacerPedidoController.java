/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensode.controller;

import static com.ensode.controller.CustomerController.selectedCust2;
import com.ensode.ejb.HacerPedidoEJB;
import com.ensode.jpa.ArregloFloral;
import com.ensode.jpa.Customer;
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
    private ArregloFloral selectedArreglo;
    private List<ArregloFloral> arregloslist;
    private DataTable tablaPedidos;
    private DataTable tablaArreglos;
    
    @EJB
    private HacerPedidoEJB hacerPedidoEJB; 
    
    
     public List<Pedido> obtainPedidos() {
        Long id;
        if(selectedArreglo != null){
            id = selectedArreglo.getId();
            List<Pedido> lista = hacerPedidoEJB.findPedidoByCustomer(id);
            return lista;
        }
        return new ArrayList<Pedido>();
    }
    /* 
     public List<ArregloFloral> obtainArreglos() {
        ArregloFloralController arrc = new ArregloFloralController();
        List<ArregloFloral> lista = arrc.obtainArreglos();
        return lista;
    }*/
     
    public String selectArreglo(){
        
        selectedArreglo = (ArregloFloral) tablaArreglos.getRowData();
        lenguajeSwitcher.recordarIdioma();
        return "void";
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

    public DataTable getTablaArreglos() {
        return tablaArreglos;
    }

    public void setTablaArreglos(DataTable tablaArreglos) {
        this.tablaArreglos = tablaArreglos;
    }

    public ArregloFloral getSelectedArreglo() {
        return selectedArreglo;
    }

    public void setSelectedArreglo(ArregloFloral selectedArreglo) {
        this.selectedArreglo = selectedArreglo;
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
