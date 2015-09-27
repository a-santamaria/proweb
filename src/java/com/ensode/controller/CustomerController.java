/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensode.controller;

import com.ensode.ejb.CustomerRemote;
import com.ensode.jpa.Customer;
import java.awt.BorderLayout;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Named;
import org.primefaces.component.datatable.DataTable;

/**
 *
 * @author heffel
 */
@Named (value="customerController")
@RequestScoped
public class CustomerController {
    
    @EJB
    private CustomerRemote customerEJB;
    LanguageSwitcher lenguajeSwitcher = new LanguageSwitcher();
    private DataModel customers;
    private Customer selectedCust;
    public static Customer selectedCust2;
    private List<Customer> customerslist;
    private DataTable tablaCustomers;

    public List<Customer> getCustomerslist() {
        return customerslist;
    }

    public void setCustomerslist(List<Customer> customerslist) {
        this.customerslist = customerslist;
    }

    public DataTable getTablaCustomers() {
        return tablaCustomers;
    }

    public void setTablaCustomers(DataTable tablaCustomers) {
        this.tablaCustomers = tablaCustomers;
    }
   
    
    //@Inject
    private Customer cust = new Customer();

    public String navigateToConfirmation() {
        //Save new customer data to database.
        customerEJB.salvar(cust);
        lenguajeSwitcher.recordarIdioma();
        return "void";
    }
    
    public String navigateToBack() {
        //Save new customer data to database.
        lenguajeSwitcher.recordarIdioma();
        return "void";
    }

    
    public  List<Customer> obtainCustomers(){
        List<Customer> lista = customerEJB.findAll();
        return lista;
    }
    
    public String selectCustomer(){
        
        selectedCust = (Customer) tablaCustomers.getRowData();
        selectedCust2 = selectedCust;
        customerslist = customerEJB.findCustomer(selectedCust);
        lenguajeSwitcher.recordarIdioma();
        return "void";
    }
    
     public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }
    
    public CustomerRemote getCustomerEJB() {
        return customerEJB;
    }

    public void setCustomerEJB(CustomerRemote customerEJB) {
        this.customerEJB = customerEJB;
    }

    public DataModel getCustomers() {
        return customers;
    }

    public void setCustomers(DataModel customers) {
        this.customers = customers;
    }

    public Customer getSelectedCust() {
        return selectedCust;
    }

    public void setSelectedCust(Customer selectedCust) {
        this.selectedCust = selectedCust;
    }
}
