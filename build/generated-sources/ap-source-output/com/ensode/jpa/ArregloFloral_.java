package com.ensode.jpa;

import com.ensode.jpa.Pedido;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-27T20:15:34")
@StaticMetamodel(ArregloFloral.class)
public class ArregloFloral_ { 

    public static volatile SingularAttribute<ArregloFloral, Long> precio;
    public static volatile SingularAttribute<ArregloFloral, byte[]> foto;
    public static volatile SingularAttribute<ArregloFloral, String> elementos;
    public static volatile SingularAttribute<ArregloFloral, Long> id;
    public static volatile ListAttribute<ArregloFloral, Pedido> pedidos;
    public static volatile SingularAttribute<ArregloFloral, String> nombre;

}