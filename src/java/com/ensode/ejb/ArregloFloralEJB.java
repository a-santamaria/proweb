/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensode.ejb;

import com.ensode.jpa.ArregloFloral;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author alfredo
 */
@Stateless
public class ArregloFloralEJB implements ArregloFloralRemote{
    
    @PersistenceContext(unitName = "ProyectoFloristeriaPU")
    private EntityManager em;
    
    @Override
    public String echo(String saying) {
        return "echoing: " + saying;
    }
    
    @Override
    public void salvar(ArregloFloral a) {
        em.persist(a);
        em.flush();
    }
    
}
