/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensode.controller;

import java.io.IOException;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author alfredo
 */

@ManagedBean
@SessionScoped  
public class UserController {
    private String username;
    private String password;
    private String originalURL;
 
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
   
    @PostConstruct
    /** 
     * construye el url de la pagina protegida a la cual se quiere ir
     * en el momento de la autenticacion
     */
    public void init() {
        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        originalURL = (String) externalContext.getRequestMap().get(RequestDispatcher.FORWARD_REQUEST_URI);
        System.out.println("originalURL=" + originalURL);
        
        /* EN GENERAL NO SE REQUIERE LO SIGUIENTE:
        if (originalURL == null) {
            originalURL = externalContext.getRequestContextPath() + "/faces/home.xhtml";
        } 
        else {
            String originalQuery = (String) externalContext.getRequestMap().get(RequestDispatcher.FORWARD_QUERY_STRING);
            if (originalQuery != null) {
                originalURL += "?" + originalQuery;
            }
        }
        */
    }
    
    public void login(ActionEvent event) {
        FacesContext context = FacesContext.getCurrentInstance();
        ExternalContext externalContext = context.getExternalContext();
        HttpServletRequest request = (HttpServletRequest) externalContext.getRequest();       
        
        try {
            System.out.println("conectando..."+username+ "  " +password);  
            request.login(username, password);
            System.out.println("login exitoso");
            externalContext.redirect(originalURL);
        
        } catch(ServletException ex) {
            // Handle unknown username/password in request.login().
            context.addMessage(null, 
                    new FacesMessage("Excepcion de autenticacion:" + ex.getMessage()));
            System.out.println("Excepcion de autenticacion:" + ex.getMessage()); 
            String errorURL = externalContext.getRequestContextPath() + "/faces/error.xhtml";
            try {
              externalContext.redirect(errorURL);
            }
            catch (Exception exxx){
              System.out.println("No pudo redireccionar a error.xhtml");
            }
             
        } catch(Exception ex) {
            System.out.println("Excepcion inesperada:" + ex.getMessage()); 
        }
    } 
    
    
    /**
     * cerrar la sesion
     * @throws IOException 
     */
    public void logout() throws IOException {
        System.out.println("logout");
        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        externalContext.invalidateSession();
        System.out.println("logout exitoso");
        externalContext.redirect(externalContext.getRequestContextPath() + "/faces/login.xhtml");
    }
    
    /** 
     * pregunta si el usuario autenticado pertenece a un rol
     * @param rol
     * @return
     * @throws IOException 
     */
    public boolean isUserInRole(String rol) throws IOException {
        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        return externalContext.isUserInRole(rol);
    }
}
