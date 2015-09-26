package com.ensode.jpa;

import com.ensode.jpa.CreditCardType;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-26T13:12:25")
@StaticMetamodel(Pedido.class)
public class Pedido_ { 

    public static volatile SingularAttribute<Pedido, Integer> creditCardExpiryMonth;
    public static volatile SingularAttribute<Pedido, Date> fecha;
    public static volatile SingularAttribute<Pedido, String> creditCardName;
    public static volatile SingularAttribute<Pedido, String> creditCardNumber;
    public static volatile SingularAttribute<Pedido, Integer> unidades;
    public static volatile SingularAttribute<Pedido, Integer> creditCardExpiryYear;
    public static volatile SingularAttribute<Pedido, Long> valor;
    public static volatile SingularAttribute<Pedido, Long> id;
    public static volatile SingularAttribute<Pedido, CreditCardType> creditCardType;

}