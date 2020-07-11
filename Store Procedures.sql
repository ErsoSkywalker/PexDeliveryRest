#Store Procedures

drop procedure if exists spCambiarStatusPyme;
delimiter //

	create procedure spCambiarStatusPyme(in idPymexd int)
    BEGIN
		declare Validacion int;
        set Validacion = ifnull((Select id from tblPyme where id = idPymexd),0);
        IF(Validacion != 0)
        THEN
        
			IF((Select idStatus from tblPyme where id = idPymexd) = 1)
			THEN
				update tblPyme set idStatus = 2 where id = idPymexd;
			ELSE
				update tblPyme set idStatus = 1 where id = idPymexd;
			END IF;
		
			Select idPymexd as Mensaje;
        
        ELSE
        
			Select 0 as Mensaje;
        
        END IF;
		
    
    END //

delimiter ;

drop procedure if exists spEditarPyme;
delimiter //

	create procedure spEditarPyme(in idPymexd int, in NombrePymexd nvarchar(60))
    BEGIN
    
		declare idValidacion int;
        set idValidacion = (Select id from tblPyme where id = idPymexd);
        
        IF(idValidacion is null)
        THEN
        
			Select 0 as Mensaje;
        
        ELSE
			
            update tblPyme set NombrePyme = NombrePymexd where id = idPymexd;
			Select idPymexd as Mensaje;
        
        END IF;
    
    END //

delimiter ;

drop procedure if exists spCambiarStatusDireccionPyme;

delimiter //

	create procedure spCambiarStatusDireccionPyme(in idDireccionPyme int)
    BEGIN
    
		declare Validacion int;
        set Validacion = (Select id from tbldireccionespyme where id = idDireccionPyme);
        IF(Validacion is not null)
        THEN
        
			IF((Select idStatus from tbldireccionespyme where id = idDireccionPyme) = 1)
            THEN
            
				update tbldireccionespyme set idStatus = 2 where id = idDireccionPyme;
            
            ELSE
				
                update tbldireccionespyme set idStatus = 1 where id = idDireccionPyme;
            
            END IF;
            
			Select 1 as Mensaje;
        
        ELSE
        
			Select 0 as Mensaje;
        
        END IF;
    
    END //

delimiter ;


drop procedure if exists spEditarDireccionesPyme;
delimiter //

	create procedure spEditarDireccionesPyme(in idDireccionPyme int, in Callexd nvarchar(60), in Coloniaxd nvarchar(60), in Delegacionxd nvarchar(60), in CodigoPostalxd int, in Estadoxd nvarchar(60), in Paisxd nvarchar(60), in NumeroExteriorxd int, in NumeroInteriorxd int)
    BEGIN
    
		IF((Select id from tbldireccionespyme where id = idDireccionPyme) is null)
		THEN
        
			Select 0 as Mensaje;
        
        ELSE
        
			update tbldireccionespyme set Calle = Callexd, Colonia = Coloniaxd, Delegacion = Delegacionxd, CodigoPostal = CodigoPostalxd, Estado = Estadoxd, Pais = Paisxd, NumeroExterior = NumeroExteriorxd, NumeroInterior = NumeroInteriorxd where id = idDireccionPyme;
			Select 1 as Mensaje;
        
        END IF;

    
    END //

delimiter ;