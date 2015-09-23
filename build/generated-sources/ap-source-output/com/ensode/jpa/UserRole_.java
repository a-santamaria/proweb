package com.ensode.jpa;

import com.ensode.jpa.Role;
import com.ensode.jpa.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-23T16:33:40")
@StaticMetamodel(UserRole.class)
public class UserRole_ { 

    public static volatile SingularAttribute<UserRole, Role> role;
    public static volatile SingularAttribute<UserRole, Usuario> usuario;
    public static volatile SingularAttribute<UserRole, Long> id;

}