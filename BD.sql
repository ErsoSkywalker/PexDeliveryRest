drop database if exists dbPexDelivery;
create database dbPexDelivery;

use dbPexdelivery;

SET SQL_SAFE_UPDATES = 0;

create table tblestatus(

	id int primary key not null auto_increment,
    Estatus nvarchar(60) not null

);

select * from tblestatus;

create table tblTipoContacto(

	id int primary key not null auto_increment,
    TipoContacto nvarchar(60) not null

);

create table tblPyme(

	id int primary key not null auto_increment,
    NombrePyme nvarchar(60) not null,
    idStatus int not null,
    foreign key (idStatus) references tblestatus(id)

);

create table tblContactosPyme(

	id int primary key not null auto_increment,
	Contacto nvarchar(60) not null,
    idTipoContacto int not null,
    idStatus int not null,
    idPyme int not null,
    foreign key (idPyme) references tblPyme(id),
    foreign key (idStatus) references tblestatus(id),
    foreign key (idTipoContacto) references tblTipoContacto(id)
    
);

create table tblEmpleadosPyme(

	id int primary key not null auto_increment,
    Nombre nvarchar(60) not null,
    ApellidoP nvarchar(60) not null,
    ApellidoM nvarchar(60) not null,
    Cargo nvarchar(60) not null,
    idPyme int not null,
    idStatus int not null,
    foreign key (idStatus) references tblestatus(id),
    foreign key (idPyme) references tblPyme(id)

);

create table tblDireccionesPyme(

	id int primary key not null auto_increment,
    Calle nvarchar(60) not null,
    Colonia nvarchar(60) not null,
    Delegacion nvarchar(60) not null,
    CodigoPostal int not null,
    Estado nvarchar(60) not null,
    Pais nvarchar(60) not null,
    NumeroExterior int not null,
    NumeroInterior int not null,
    idPyme int not null,
    idStatus int not null,
    foreign key (idPyme) references tblPyme(id),
    foreign key (idStatus) references tblestatus(id)

);

create table tblProductos(
	id int primary key not null auto_increment,
    Nombre nvarchar(60) not null,
    Descripcion nvarchar(60) not null,
    Cantidad int not null,
    idPyme int not null,
    idStatus int not null,
    Costo float not null,
    foreign key (idPyme) references tblPyme(id),
    foreign key (idStatus) references tblestatus(id)
);

create table tblProductosEnviados(

	id int primary key not null auto_increment,
    Nombre nvarchar(60) not null,
    Descripcion nvarchar(60) not null,
    Costo nvarchar(60) not null
    
);

create table tblCodigosPostales(

	id int primary key not null auto_increment,
    CodigoPostal int not null

);



create table tblDireccionEnvio(

	id int primary key not null auto_increment,
    Calle nvarchar(60) not null,
    Colonia nvarchar(60) not null,
    Delegacion nvarchar(60) not null,
    idCodigoPostal int not null,
    Estado nvarchar(60) not null,
    Pais nvarchar(60) not null,
    NumeroExterior int not null,
    NumeroInterior int not null,
    foreign key (idCodigoPostal) references tblCodigosPostales(id)

);

create table tblPersona(

		id int primary key not null auto_increment,
        Nombre nvarchar(60) not null,
        ApellidoP nvarchar(60) not null,
        ApellidoM nvarchar(60) not null

);

create table tblContactosPersona(

	id int primary key not null auto_increment,
    Contacto nvarchar(60) not null,
    idTipoContacto int not null,
    idPersona int not null,
    idStatus int not null,
    foreign key (idTipoContacto) references tblTipoContacto(id),
    foreign key (idPersona) references tblPersona(id),
    foreign key (idStatus) references tblestatus(id)

);

create table tblDireccionesPersona(

	id int primary key not null auto_increment,
    Calle nvarchar(60) not null,
    Colonia nvarchar(60) not null,
    Delegacion nvarchar(60) not null,
    Estado nvarchar(60) not null,
    Pais nvarchar(60) not null,
    CodigoPostal int not null,
    NumeroExterior int not null,
    NumeroInterior int not null,
    idPersona int not null,
    idStatus int not null,
    foreign key (idStatus) references tblestatus(id),
    foreign key (idPersona) references tblPersona(id)

);

create table tblTamano(

	idTamano int primary key auto_increment,
    Tamano nvarchar(60) not null

);

Insert into tblTamano values(1,'Grande');

create table tblMensajero(

	idMensajero int primary key auto_increment,
    Nombre nvarchar(60) not null,
    ApellidoP nvarchar(60) not null,
    ApellidoM nvarchar(60) not null,
    usuario nvarchar(60) not null,
    contrasena nvarchar(60) not null,
    idTamano int not null,
    foreign key (idTamano) references tblTamano(idTamano)
    
);



create table tblEnvio(

	id int primary key not null auto_increment,
    idPyme int not null,
    idPersona int not null,
    idDireccionEnvio int not null,
    idProducto int not null,
    idStatus int not null,
    Instrucciones Text not null,
    CodigoSeguimiento nvarchar(60) not null,
    CodigoEnvio nvarchar(60) not null,
    CodigoRecepcion nvarchar(60) not null,
    idTamano int not null,
    idMensajero int not null,
    foreign key(idMensajero) references tblMensajero(idMensajero),
    foreign key (idTamano) references tblTamano(idTamano),
    foreign key (idPyme) references tblPyme(id),
    foreign key (idPersona) references tblPersona(id),
    foreign key (idDireccionEnvio) references tblDireccionEnvio(id),
    foreign key (idProducto) references tblProductosEnviados(id),
    foreign key (idStatus) references tblestatus(id)

);

 create table tblContactoMensajero(
 
	idContactoMensajero int primary key auto_increment,
    ContactoMensajero nvarchar(60) not null,
    idTipoContacto int not null,
    idMensajero int not null,
    idStatus int not null,
    foreign key(idMensajero) references tblMensajero(idMensajero),
    foreign key (idTipoContacto) references tblTipoContacto(id),
    foreign key(idStatus) references tblestatus(id)
 
 );
 
 ALTER DATABASE dbPexDelivery CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci;


