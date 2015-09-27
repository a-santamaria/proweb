/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensode.ejb;

import com.ensode.jpa.Customer;
import java.util.List;

/**
 *
 * @author consuelofranky
 */
public interface CustomerRemote {
    public String echo(String saying);
    public void salvar(Customer c);
    public List<Customer> findAll();
    public List<Customer> findCustomer(Customer selected);
}
