/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensode.controller;

import com.ensode.ejb.ArregloFloralEJB;
import com.ensode.ejb.ArregloFloralRemote;
import com.ensode.jpa.ArregloFloral;
import com.ensode.jpa.Customer;
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
@Named(value = "arregloFloralController")
@RequestScoped
public class ArregloFloralController {

    @EJB
    private ArregloFloralRemote arregloFEJB;

    public ArregloFloralRemote getArregloFEJB() {
        return arregloFEJB;
    }

    public void setArregloFEJB(ArregloFloralRemote arregloFEJB) {
        this.arregloFEJB = arregloFEJB;
    }
    LanguageSwitcher lenguajeSwitcher = new LanguageSwitcher();

    private DataModel arreglosFlorales;
    private ArregloFloral selectedArreglo;
    private List<ArregloFloral> arregloslist;
    private DataTable tablaArreglos;

    //@Inject
    private ArregloFloral arr = new ArregloFloral();

    public ArregloFloral getArr() {
        return arr;
    }

    public void setArr(ArregloFloral arr) {
        this.arr = arr;
    }

    public DataModel getArreglosFlorales() {
        return arreglosFlorales;
    }

    public void setArreglosFlorales(DataModel arreglosFlorales) {
        this.arreglosFlorales = arreglosFlorales;
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

    public DataTable getTablaArreglos() {
        return tablaArreglos;
    }

    public void setTablaArreglos(DataTable tablaArreglos) {
        this.tablaArreglos = tablaArreglos;
    }
    
    
    

    public String navigateToConfirmation() {
        //Save new customer data to database.
        arregloFEJB.salvar(arr);
        lenguajeSwitcher.recordarIdioma();
        return "void";
    }

    public String navigateToBack() {
        //Save new customer data to database.
        lenguajeSwitcher.recordarIdioma();
        return "void";
    }

    public List<ArregloFloral> obtainArreglos() {
        List<ArregloFloral> lista = arregloFEJB.findAll();
        return lista;
    }

    public String selectCustomer() {
        selectedArreglo = (ArregloFloral) tablaArreglos.getRowData();
        arregloslist = arregloFEJB.findArreglo(selectedArreglo);
        lenguajeSwitcher.recordarIdioma();
        return "void";
    }
}
