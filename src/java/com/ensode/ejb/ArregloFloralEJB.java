/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensode.ejb;

import com.ensode.jpa.ArregloFloral;
import com.ensode.jpa.Customer;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

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
    
    @Override
    public List<ArregloFloral> findAll(){
        TypedQuery<ArregloFloral> query =  
                em.createNamedQuery("ArregloFloral.findAll", ArregloFloral.class);
        List<ArregloFloral> results = query.getResultList();
        return results;
    }
    
    @SuppressWarnings("JPQLValidation")
    @Override
    public List<ArregloFloral> findArreglo(ArregloFloral selected){
        Long id = selected.getId();
        return em.createQuery("SELECT c FROM ArregloFloral c WHERE c.id = '"+id+ "'").getResultList();
        
    }
    
}
