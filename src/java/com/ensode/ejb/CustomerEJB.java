/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensode.ejb;

import com.ensode.jpa.Customer;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author heffel
 */
@Stateless
public class CustomerEJB implements CustomerRemote {
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @PersistenceContext(unitName = "demoJEE6PU")
    private EntityManager em;

    public String echo(String saying) {
        return "echoing: " + saying;
    }
    
    public void salvar(Customer c) {
        em.persist(c); 
    }
    
}
