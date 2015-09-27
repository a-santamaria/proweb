/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensode.ejb;

import com.ensode.controller.CustomerController;
import com.ensode.jpa.Customer;
import com.ensode.jpa.Pedido;
import java.util.List;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author alfredo
 */
@Stateful
public class HacerPedidoEJB {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @PersistenceContext(unitName = "ProyectoFloristeriaPU")
    private EntityManager em;
    
    public void salvar(Pedido a) {
        em.persist(a);
        em.flush();
    }
    
    @SuppressWarnings("JPQLValidation")
    public List<Pedido> findPedidoByCustomer(Long id){
        
        return em.createQuery("SELECT p FROM Pedido p WHERE p.id = "
                + "(SELECT c.pedidos_id FROM Customer_pedido c "
                + "WHERE c.customer_id = '" + id + "')").getResultList();
        
    }
}
