/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensode.controller;

import com.ensode.ejb.CustomerRemote;
import com.ensode.jpa.Customer;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author heffel
 */
@Named
@RequestScoped
public class CustomerController {
    
    @EJB
    private CustomerRemote customerEJB;
    
    //@Inject
    private Customer cust = new Customer();

    public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }

    public String navigateToConfirmation() {
        //Save new customer data to database.
        customerEJB.salvar(cust);

        return "confirmation";
    }
}
