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
@Named (value="arregloFloralController")
@RequestScoped
public class ArregloFloralController {
    @EJB
    private ArregloFloralRemote arregloFEJB;
    LanguageSwitcher lenguajeSwitcher = new LanguageSwitcher();
    
    //@Inject
    private ArregloFloral arr = new ArregloFloral();

    
    public ArregloFloral getArr() {
        return arr;
    }

    public void setArr(ArregloFloral arr) {
        this.arr = arr;
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
}
