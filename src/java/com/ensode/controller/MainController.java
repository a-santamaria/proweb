/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensode.controller;

import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.swing.text.AbstractDocument;

/**
 *
 * @author alfredo
 */
@Named (value="mainController")
@Dependent
public class MainController {
    LanguageSwitcher lenguajeSwitcher = new LanguageSwitcher();
    
    public String navigateToNewCustomer(){
        lenguajeSwitcher.recordarIdioma();
        return "createNewCustomer";
    }
    
    public String navigateToNewArregloFloral(){
        lenguajeSwitcher.recordarIdioma();
        return "createNewArregloFloral";
    }
    
     public String navigateToIndex(){
        lenguajeSwitcher.recordarIdioma();
        return "index";
    }
}
