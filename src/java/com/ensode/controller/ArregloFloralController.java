/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensode.controller;

import com.ensode.ejb.ArregloFloralEJB;
import com.ensode.ejb.ArregloFloralRemote;
import com.ensode.jpa.ArregloFloral;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author alfredo
 */
@Named
@RequestScoped
public class ArregloFloralController {
    @EJB
    private ArregloFloralRemote arregloFEJB;
    
    //@Inject
    private ArregloFloral arr = new ArregloFloral();

    public void createArregloFloral(String nombre, Long precio, String descripcion){        

        arregloFEJB.salvar(arr);
    }
    
    
    public ArregloFloral getArr() {
        return arr;
    }

    public void setArr(ArregloFloral arr) {
        this.arr = arr;
    }
    
    public String navigateToConfirmation() {
        //Save new customer data to database.
        arregloFEJB.salvar(arr);

        return "arregloFloralConfirmation";
    }
}
