/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensode.ejb;

import com.ensode.jpa.ArregloFloral;

/**
 *
 * @author alfredo
 */
public interface ArregloFloralRemote {
    public String echo(String saying);
    public void salvar(ArregloFloral a);
}
