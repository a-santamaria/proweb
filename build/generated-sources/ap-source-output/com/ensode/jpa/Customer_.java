package com.ensode.jpa;

import com.ensode.jpa.Ciudad;
import com.ensode.jpa.Pedido;
import com.ensode.jpa.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-27T20:15:34")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, String> firstName;
    public static volatile SingularAttribute<Customer, String> lastName;
    public static volatile SingularAttribute<Customer, String> address;
    public static volatile SingularAttribute<Customer, String> phone;
    public static volatile SingularAttribute<Customer, Ciudad> city;
    public static volatile SingularAttribute<Customer, String> middleName;
    public static volatile SingularAttribute<Customer, Usuario> usuario;
    public static volatile SingularAttribute<Customer, Long> id;
    public static volatile ListAttribute<Customer, Pedido> pedidos;
    public static volatile SingularAttribute<Customer, String> email;

}