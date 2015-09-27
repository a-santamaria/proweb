INSERT INTO role (nombre) VALUES ('administradorNegocio');
INSERT INTO role (nombre) VALUES ('registraPedidos');


INSERT INTO usuario (login, username, password)
 VALUES ('admin', 'Administra Aplicacion',
 '827ccb0eea8a706c4c34a16891f84e7b');

INSERT INTO usuario (login, username, password)
 VALUES ('alfredo', 'Alfredo Santamaria',
 '827ccb0eea8a706c4c34a16891f84e7b');

INSERT INTO usuario (login, username, password)
 VALUES ('daniel', 'Daniel Arias',
 '827ccb0eea8a706c4c34a16891f84e7b');

INSERT INTO UserRole (id, usuario_login, role_nombre)
 VALUES (1, 1, 1);

INSERT INTO UserRole (id, usuario_login, role_nombre)
 VALUES (2, 2, 2);

INSERT INTO UserRole (id, usuario_login, role_nombre)
 VALUES (3, 3, 2);