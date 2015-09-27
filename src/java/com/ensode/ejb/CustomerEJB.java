/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensode.ejb;

import com.ensode.jpa.Customer;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author heffel
 */
@Stateless
public class CustomerEJB implements CustomerRemote {
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @PersistenceContext(unitName = "ProyectoFloristeriaPU")
    private EntityManager em;

    @Override
    public String echo(String saying) {
        return "echoing: " + saying;
    }
    
    @Override
    public void salvar(Customer c) {
        em.persist(c); 
    }
    
    @Override
    public List<Customer> findAll(){
        TypedQuery<Customer> query =  
                em.createNamedQuery("Customer.findAll", Customer.class);
        List<Customer> results = query.getResultList();
        return results;
    }
    
    @Override
    @SuppressWarnings("JPQLValidation")
    public List<Customer> findCustomer(Customer selected){
        Long id = selected.getId();
        return em.createQuery("SELECT c FROM Customer c WHERE c.id = '"+id+ "'").getResultList();
        
    }
    
}
