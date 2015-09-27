/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensode.ejb;

import com.ensode.jpa.ArregloFloral;
import java.util.List;

/**
 *
 * @author alfredo
 */
public interface ArregloFloralRemote {
    public String echo(String saying);
    public void salvar(ArregloFloral a);

    public List<ArregloFloral> findAll();


    public List<ArregloFloral> findArreglo(ArregloFloral selected);
}
