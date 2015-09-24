/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensode.controller;

import java.io.Serializable;
import java.util.Locale;
import javax.enterprise.context.Dependent;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author alfredo
 */
//@ManagedBean (name= "languageSwitcher")
@Named("languageSwitcher")
@Dependent
public class LanguageSwitcher implements Serializable {

    public Locale locale = FacesContext
            .getCurrentInstance().getViewRoot().getLocale();

    public Locale getLocale() {
        return locale;
    }

    public String getLanguage() {
        return locale.getLanguage();
    }

    public void changeLanguage(String language) {
        locale = new Locale(language);
        FacesContext.getCurrentInstance()
                .getViewRoot().setLocale(locale);
    }

    private void recordarIdioma() {
        // recuerda idioma establecido
        FacesContext.getCurrentInstance()
                .getViewRoot().setLocale(locale);
    }
}
