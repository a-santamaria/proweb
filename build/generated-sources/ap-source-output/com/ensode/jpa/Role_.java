package com.ensode.jpa;

import com.ensode.jpa.UserRole;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-26T13:12:25")
@StaticMetamodel(Role.class)
public class Role_ { 

    public static volatile ListAttribute<Role, UserRole> userRoles;
    public static volatile SingularAttribute<Role, Long> id;
    public static volatile SingularAttribute<Role, String> nombre;

}