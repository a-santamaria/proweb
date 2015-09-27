/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensode.controller;

import com.ensode.jpa.Ciudad;
import java.util.HashMap;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author alfredo
 */
@Named (value="dropDownView")
@RequestScoped
public class DropDownView {
    private HashMap<String, String> cities;

    public HashMap<String, String> getCities() {
        return cities;
    }

    public void setCities(HashMap<String, String> cities) {
        this.cities = cities;
    }
    
    @PostConstruct
    public void init() {
        cities  = new HashMap<String, String>();
        for (Ciudad ci : Ciudad.values()) {
            cities.put(ci.name(), ci.name());
        }
    }
}
