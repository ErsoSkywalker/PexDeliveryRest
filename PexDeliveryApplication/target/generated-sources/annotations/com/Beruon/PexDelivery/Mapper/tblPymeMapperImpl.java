package com.Beruon.PexDelivery.Mapper;

import com.Beruon.PexDelivery.Entities.tblCodigosPostalesEntity;
import com.Beruon.PexDelivery.Entities.tblContactoMensajeroEntity;
import com.Beruon.PexDelivery.Entities.tblContactosPersonaEntity;
import com.Beruon.PexDelivery.Entities.tblContactosPymeEntity;
import com.Beruon.PexDelivery.Entities.tblDireccionEnvioEntity;
import com.Beruon.PexDelivery.Entities.tblDireccionesPersonaEntity;
import com.Beruon.PexDelivery.Entities.tblDireccionesPymeEntity;
import com.Beruon.PexDelivery.Entities.tblEmpleadosPymeEntity;
import com.Beruon.PexDelivery.Entities.tblEnvioEntity;
import com.Beruon.PexDelivery.Entities.tblMensajeroEntity;
import com.Beruon.PexDelivery.Entities.tblPersonaEntity;
import com.Beruon.PexDelivery.Entities.tblProductosEntity;
import com.Beruon.PexDelivery.Entities.tblProductosEnviadosEntity;
import com.Beruon.PexDelivery.Entities.tblPymeEntity;
import com.Beruon.PexDelivery.Entities.tblStatusEntity;
import com.Beruon.PexDelivery.Entities.tblTamanoEntity;
import com.Beruon.PexDelivery.Entities.tblTipoContactoEntity;
import com.Beruon.PexDelivery.dto.tblCodigosPostalesDto;
import com.Beruon.PexDelivery.dto.tblContactoMensajeroDto;
import com.Beruon.PexDelivery.dto.tblContactosPersonaDto;
import com.Beruon.PexDelivery.dto.tblContactosPymeDto;
import com.Beruon.PexDelivery.dto.tblDireccionEnvioDto;
import com.Beruon.PexDelivery.dto.tblDireccionesPersonaDto;
import com.Beruon.PexDelivery.dto.tblDireccionesPymeDto;
import com.Beruon.PexDelivery.dto.tblEmpleadosPymeDto;
import com.Beruon.PexDelivery.dto.tblEnvioDto;
import com.Beruon.PexDelivery.dto.tblMensajeroDto;
import com.Beruon.PexDelivery.dto.tblPersonaDto;
import com.Beruon.PexDelivery.dto.tblProductosDto;
import com.Beruon.PexDelivery.dto.tblProductosEnviadosDto;
import com.Beruon.PexDelivery.dto.tblPymeDto;
import com.Beruon.PexDelivery.dto.tblStatusDto;
import com.Beruon.PexDelivery.dto.tblTamanoDto;
import com.Beruon.PexDelivery.dto.tblTipoContactoDto;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-07-11T09:06:08-0500",
    comments = "version: 1.1.0.Beta2, compiler: Eclipse JDT (IDE) 3.22.0.v20200530-2032, environment: Java 1.8.0_251 (Oracle Corporation)"
)
public class tblPymeMapperImpl implements tblPymeMapper {

    @Override
    public tblContactosPymeDto tblContactosPymeEntityTotblContactosPymeDto(tblContactosPymeEntity entidad) {
        if ( entidad == null ) {
            return null;
        }

        tblContactosPymeDto tblContactosPymeDto = new tblContactosPymeDto();

        tblContactosPymeDto.setContacto( entidad.getContacto() );

        return tblContactosPymeDto;
    }

    @Override
    public tblContactosPymeEntity tblContactosPymeDtoTotblContactosPymeEntity(tblContactosPymeDto Dto) {
        if ( Dto == null ) {
            return null;
        }

        tblContactosPymeEntity tblContactosPymeEntity = new tblContactosPymeEntity();

        tblContactosPymeEntity.setContacto( Dto.getContacto() );

        return tblContactosPymeEntity;
    }

    @Override
    public tblPymeDto tblPymeEntityTotblPymeDto(tblPymeEntity entidad) {
        if ( entidad == null ) {
            return null;
        }

        tblPymeDto tblPymeDto = new tblPymeDto();

        tblPymeDto.setIdPyme( entidad.getIdPyme() );
        tblPymeDto.setNombrePyme( entidad.getNombrePyme() );

        return tblPymeDto;
    }

    @Override
    public tblPymeEntity tblPymeDtoTotblPymeEntity(tblPymeDto Dto) {
        if ( Dto == null ) {
            return null;
        }

        tblPymeEntity tblPymeEntity = new tblPymeEntity();

        tblPymeEntity.setIdPyme( Dto.getIdPyme() );
        tblPymeEntity.setNombrePyme( Dto.getNombrePyme() );

        return tblPymeEntity;
    }

    @Override
    public tblStatusDto tblStatusEntityTotblStatusDto(tblStatusEntity entidad) {
        if ( entidad == null ) {
            return null;
        }

        tblStatusDto tblStatusDto = new tblStatusDto();

        tblStatusDto.setEstatus( entidad.getEstatus() );
        tblStatusDto.setIdStatus( entidad.getIdStatus() );

        return tblStatusDto;
    }

    @Override
    public tblStatusEntity tblStatusDtoTotblStatusEntity(tblStatusDto Dto) {
        if ( Dto == null ) {
            return null;
        }

        tblStatusEntity tblStatusEntity = new tblStatusEntity();

        tblStatusEntity.setEstatus( Dto.getEstatus() );
        tblStatusEntity.setIdStatus( Dto.getIdStatus() );

        return tblStatusEntity;
    }

    @Override
    public tblTipoContactoDto tblTipoContactoEntityTotblTipoContactoDto(tblTipoContactoEntity entidad) {
        if ( entidad == null ) {
            return null;
        }

        tblTipoContactoDto tblTipoContactoDto = new tblTipoContactoDto();

        tblTipoContactoDto.setIdTipoContacto( entidad.getIdTipoContacto() );
        tblTipoContactoDto.setTipoContacto( entidad.getTipoContacto() );

        return tblTipoContactoDto;
    }

    @Override
    public tblTipoContactoEntity tblTipoContactoDtoTotblTipoContactoEntity(tblTipoContactoDto Dto) {
        if ( Dto == null ) {
            return null;
        }

        tblTipoContactoEntity tblTipoContactoEntity = new tblTipoContactoEntity();

        tblTipoContactoEntity.setIdTipoContacto( Dto.getIdTipoContacto() );
        tblTipoContactoEntity.setTipoContacto( Dto.getTipoContacto() );

        return tblTipoContactoEntity;
    }

    @Override
    public tblEmpleadosPymeEntity tblEmpleadosPymeDtoTotblEmpleadosPymeEntity(tblEmpleadosPymeDto Dto) {
        if ( Dto == null ) {
            return null;
        }

        tblEmpleadosPymeEntity tblEmpleadosPymeEntity = new tblEmpleadosPymeEntity();

        tblEmpleadosPymeEntity.setApellidoM( Dto.getApellidoM() );
        tblEmpleadosPymeEntity.setApellidoP( Dto.getApellidoP() );
        tblEmpleadosPymeEntity.setCargo( Dto.getCargo() );
        tblEmpleadosPymeEntity.setIdEmpleadosPyme( Dto.getIdEmpleadosPyme() );
        tblEmpleadosPymeEntity.setNombre( Dto.getNombre() );

        return tblEmpleadosPymeEntity;
    }

    @Override
    public tblEmpleadosPymeDto tblEmpleadosPymeEntityTotblEmpleadosPymeDto(tblEmpleadosPymeEntity entidad) {
        if ( entidad == null ) {
            return null;
        }

        tblEmpleadosPymeDto tblEmpleadosPymeDto = new tblEmpleadosPymeDto();

        tblEmpleadosPymeDto.setApellidoM( entidad.getApellidoM() );
        tblEmpleadosPymeDto.setApellidoP( entidad.getApellidoP() );
        tblEmpleadosPymeDto.setCargo( entidad.getCargo() );
        tblEmpleadosPymeDto.setIdEmpleadosPyme( entidad.getIdEmpleadosPyme() );
        tblEmpleadosPymeDto.setNombre( entidad.getNombre() );

        return tblEmpleadosPymeDto;
    }

    @Override
    public tblDireccionesPymeEntity tblDireccionesPymeDtoTotblDireccionesPymeEntity(tblDireccionesPymeDto Dto) {
        if ( Dto == null ) {
            return null;
        }

        tblDireccionesPymeEntity tblDireccionesPymeEntity = new tblDireccionesPymeEntity();

        tblDireccionesPymeEntity.setCalle( Dto.getCalle() );
        tblDireccionesPymeEntity.setCodigoPostal( Dto.getCodigoPostal() );
        tblDireccionesPymeEntity.setColonia( Dto.getColonia() );
        tblDireccionesPymeEntity.setDelegacion( Dto.getDelegacion() );
        tblDireccionesPymeEntity.setEstado( Dto.getEstado() );
        tblDireccionesPymeEntity.setIdDireccionesPyme( Dto.getIdDireccionesPyme() );
        tblDireccionesPymeEntity.setNumeroExterior( Dto.getNumeroExterior() );
        tblDireccionesPymeEntity.setNumeroInterior( Dto.getNumeroInterior() );
        tblDireccionesPymeEntity.setPais( Dto.getPais() );

        return tblDireccionesPymeEntity;
    }

    @Override
    public tblDireccionesPymeDto tblDireccionesPymeEntityTotblDireccionesPymeDto(tblDireccionesPymeEntity entidad) {
        if ( entidad == null ) {
            return null;
        }

        tblDireccionesPymeDto tblDireccionesPymeDto = new tblDireccionesPymeDto();

        tblDireccionesPymeDto.setCalle( entidad.getCalle() );
        if ( entidad.getCodigoPostal() != null ) {
            tblDireccionesPymeDto.setCodigoPostal( entidad.getCodigoPostal() );
        }
        tblDireccionesPymeDto.setColonia( entidad.getColonia() );
        tblDireccionesPymeDto.setDelegacion( entidad.getDelegacion() );
        tblDireccionesPymeDto.setEstado( entidad.getEstado() );
        tblDireccionesPymeDto.setIdDireccionesPyme( entidad.getIdDireccionesPyme() );
        if ( entidad.getNumeroExterior() != null ) {
            tblDireccionesPymeDto.setNumeroExterior( entidad.getNumeroExterior() );
        }
        if ( entidad.getNumeroInterior() != null ) {
            tblDireccionesPymeDto.setNumeroInterior( entidad.getNumeroInterior() );
        }
        tblDireccionesPymeDto.setPais( entidad.getPais() );

        return tblDireccionesPymeDto;
    }

    @Override
    public tblProductosEntity tblProductosDtoTotblProductosEntity(tblProductosDto Dto) {
        if ( Dto == null ) {
            return null;
        }

        tblProductosEntity tblProductosEntity = new tblProductosEntity();

        tblProductosEntity.setCantidad( Dto.getCantidad() );
        tblProductosEntity.setCosto( Dto.getCosto() );
        tblProductosEntity.setDescripcion( Dto.getDescripcion() );
        tblProductosEntity.setIdProducto( Dto.getIdProducto() );
        tblProductosEntity.setNombre( Dto.getNombre() );

        return tblProductosEntity;
    }

    @Override
    public tblProductosDto tblProductosEntityTotblProcutosDto(tblProductosEntity entidad) {
        if ( entidad == null ) {
            return null;
        }

        tblProductosDto tblProductosDto = new tblProductosDto();

        tblProductosDto.setCantidad( entidad.getCantidad() );
        tblProductosDto.setCosto( entidad.getCosto() );
        tblProductosDto.setDescripcion( entidad.getDescripcion() );
        tblProductosDto.setIdProducto( entidad.getIdProducto() );
        tblProductosDto.setNombre( entidad.getNombre() );

        return tblProductosDto;
    }

    @Override
    public tblProductosEnviadosEntity tblProductosEnviadosDtoTotblProductosEnviadosEntity(tblProductosEnviadosDto Dto) {
        if ( Dto == null ) {
            return null;
        }

        tblProductosEnviadosEntity tblProductosEnviadosEntity = new tblProductosEnviadosEntity();

        tblProductosEnviadosEntity.setCosto( Dto.getCosto() );
        tblProductosEnviadosEntity.setDescripcion( Dto.getDescripcion() );
        tblProductosEnviadosEntity.setIdProductoEnviado( Dto.getIdProductoEnviado() );
        tblProductosEnviadosEntity.setNombre( Dto.getNombre() );

        return tblProductosEnviadosEntity;
    }

    @Override
    public tblProductosEnviadosDto tblProductosEnviadosEntityTotblProductosEnviadosDto(tblProductosEnviadosEntity entidad) {
        if ( entidad == null ) {
            return null;
        }

        tblProductosEnviadosDto tblProductosEnviadosDto = new tblProductosEnviadosDto();

        tblProductosEnviadosDto.setCosto( entidad.getCosto() );
        tblProductosEnviadosDto.setDescripcion( entidad.getDescripcion() );
        tblProductosEnviadosDto.setIdProductoEnviado( entidad.getIdProductoEnviado() );
        tblProductosEnviadosDto.setNombre( entidad.getNombre() );

        return tblProductosEnviadosDto;
    }

    @Override
    public tblCodigosPostalesDto tblCodigosPostalesEntityTotblCodigosPostalesDto(tblCodigosPostalesEntity entidad) {
        if ( entidad == null ) {
            return null;
        }

        tblCodigosPostalesDto tblCodigosPostalesDto = new tblCodigosPostalesDto();

        tblCodigosPostalesDto.setCodigoPostal( entidad.getCodigoPostal() );
        tblCodigosPostalesDto.setIdCodigoPostal( entidad.getIdCodigoPostal() );

        return tblCodigosPostalesDto;
    }

    @Override
    public tblCodigosPostalesEntity tblCodigosPostalesDtoTotblCodigosPostalesEntity(tblCodigosPostalesDto Dto) {
        if ( Dto == null ) {
            return null;
        }

        tblCodigosPostalesEntity tblCodigosPostalesEntity = new tblCodigosPostalesEntity();

        tblCodigosPostalesEntity.setCodigoPostal( Dto.getCodigoPostal() );
        tblCodigosPostalesEntity.setIdCodigoPostal( Dto.getIdCodigoPostal() );

        return tblCodigosPostalesEntity;
    }

    @Override
    public tblDireccionEnvioDto tblDireccionEnvioEntityTotblDireccionEnvioDto(tblDireccionEnvioEntity Entidad) {
        if ( Entidad == null ) {
            return null;
        }

        tblDireccionEnvioDto tblDireccionEnvioDto = new tblDireccionEnvioDto();

        tblDireccionEnvioDto.setCalle( Entidad.getCalle() );
        tblDireccionEnvioDto.setColonia( Entidad.getColonia() );
        tblDireccionEnvioDto.setDelegacion( Entidad.getDelegacion() );
        tblDireccionEnvioDto.setEstado( Entidad.getEstado() );
        tblDireccionEnvioDto.setIdDireccionEnvio( Entidad.getIdDireccionEnvio() );
        tblDireccionEnvioDto.setNumeroExterior( Entidad.getNumeroExterior() );
        tblDireccionEnvioDto.setNumeroInterior( Entidad.getNumeroInterior() );
        tblDireccionEnvioDto.setPais( Entidad.getPais() );

        return tblDireccionEnvioDto;
    }

    @Override
    public tblDireccionEnvioEntity tblDireccionEnvioDtoTotblDireccionEnvioEntity(tblDireccionEnvioDto Dto) {
        if ( Dto == null ) {
            return null;
        }

        tblDireccionEnvioEntity tblDireccionEnvioEntity = new tblDireccionEnvioEntity();

        tblDireccionEnvioEntity.setCalle( Dto.getCalle() );
        tblDireccionEnvioEntity.setColonia( Dto.getColonia() );
        tblDireccionEnvioEntity.setDelegacion( Dto.getDelegacion() );
        tblDireccionEnvioEntity.setEstado( Dto.getEstado() );
        tblDireccionEnvioEntity.setNumeroExterior( Dto.getNumeroExterior() );
        tblDireccionEnvioEntity.setNumeroInterior( Dto.getNumeroInterior() );
        tblDireccionEnvioEntity.setPais( Dto.getPais() );

        return tblDireccionEnvioEntity;
    }

    @Override
    public tblPersonaEntity tblPersonaDtoTotblPersonaEntity(tblPersonaDto Dto) {
        if ( Dto == null ) {
            return null;
        }

        tblPersonaEntity tblPersonaEntity = new tblPersonaEntity();

        tblPersonaEntity.setApellidoM( Dto.getApellidoM() );
        tblPersonaEntity.setApellidoP( Dto.getApellidoP() );
        tblPersonaEntity.setIdPersona( Dto.getIdPersona() );
        tblPersonaEntity.setNombre( Dto.getNombre() );

        return tblPersonaEntity;
    }

    @Override
    public tblPersonaDto tblPersonaEntityTotblPersonaDto(tblPersonaEntity Entidad) {
        if ( Entidad == null ) {
            return null;
        }

        tblPersonaDto tblPersonaDto = new tblPersonaDto();

        tblPersonaDto.setApellidoM( Entidad.getApellidoM() );
        tblPersonaDto.setApellidoP( Entidad.getApellidoP() );
        tblPersonaDto.setIdPersona( Entidad.getIdPersona() );
        tblPersonaDto.setNombre( Entidad.getNombre() );

        return tblPersonaDto;
    }

    @Override
    public tblContactosPersonaEntity tblContactosPersonaDtoTotblContactosPersonaEntity(tblContactosPersonaDto Dto) {
        if ( Dto == null ) {
            return null;
        }

        tblContactosPersonaEntity tblContactosPersonaEntity = new tblContactosPersonaEntity();

        tblContactosPersonaEntity.setContacto( Dto.getContacto() );
        tblContactosPersonaEntity.setIdContactoPersona( Dto.getIdContactoPersona() );

        return tblContactosPersonaEntity;
    }

    @Override
    public tblContactosPersonaDto tblContactosPersonaEntityTotblContactosPersonaDto(tblContactosPersonaEntity Entidad) {
        if ( Entidad == null ) {
            return null;
        }

        tblContactosPersonaDto tblContactosPersonaDto = new tblContactosPersonaDto();

        tblContactosPersonaDto.setContacto( Entidad.getContacto() );
        tblContactosPersonaDto.setIdContactoPersona( Entidad.getIdContactoPersona() );

        return tblContactosPersonaDto;
    }

    @Override
    public tblDireccionesPersonaDto tblDireccionesPersonaEntityTotblDireccionesPersonaDto(tblDireccionesPersonaEntity Entidad) {
        if ( Entidad == null ) {
            return null;
        }

        tblDireccionesPersonaDto tblDireccionesPersonaDto = new tblDireccionesPersonaDto();

        tblDireccionesPersonaDto.setCalle( Entidad.getCalle() );
        if ( Entidad.getCodigoPostal() != null ) {
            tblDireccionesPersonaDto.setCodigoPostal( Entidad.getCodigoPostal() );
        }
        tblDireccionesPersonaDto.setColonia( Entidad.getColonia() );
        tblDireccionesPersonaDto.setDelegacion( Entidad.getDelegacion() );
        tblDireccionesPersonaDto.setEstado( Entidad.getEstado() );
        tblDireccionesPersonaDto.setIdDireccionPersona( Entidad.getIdDireccionPersona() );
        if ( Entidad.getNumeroExterior() != null ) {
            tblDireccionesPersonaDto.setNumeroExterior( Entidad.getNumeroExterior() );
        }
        if ( Entidad.getNumeroInterior() != null ) {
            tblDireccionesPersonaDto.setNumeroInterior( Entidad.getNumeroInterior() );
        }
        tblDireccionesPersonaDto.setPais( Entidad.getPais() );

        return tblDireccionesPersonaDto;
    }

    @Override
    public tblDireccionesPersonaEntity tblDireccionesPersonaDtoTotblDireccionesPersonaEntity(tblDireccionesPersonaDto Dto) {
        if ( Dto == null ) {
            return null;
        }

        tblDireccionesPersonaEntity tblDireccionesPersonaEntity = new tblDireccionesPersonaEntity();

        tblDireccionesPersonaEntity.setCalle( Dto.getCalle() );
        tblDireccionesPersonaEntity.setCodigoPostal( Dto.getCodigoPostal() );
        tblDireccionesPersonaEntity.setColonia( Dto.getColonia() );
        tblDireccionesPersonaEntity.setDelegacion( Dto.getDelegacion() );
        tblDireccionesPersonaEntity.setEstado( Dto.getEstado() );
        tblDireccionesPersonaEntity.setIdDireccionPersona( Dto.getIdDireccionPersona() );
        tblDireccionesPersonaEntity.setNumeroExterior( Dto.getNumeroExterior() );
        tblDireccionesPersonaEntity.setNumeroInterior( Dto.getNumeroInterior() );
        tblDireccionesPersonaEntity.setPais( Dto.getPais() );

        return tblDireccionesPersonaEntity;
    }

    @Override
    public tblTamanoDto tblTamanoEntityTotblTamanoDto(tblTamanoEntity entidad) {
        if ( entidad == null ) {
            return null;
        }

        tblTamanoDto tblTamanoDto = new tblTamanoDto();

        tblTamanoDto.setIdTamano( entidad.getIdTamano() );
        tblTamanoDto.setTamano( entidad.getTamano() );

        return tblTamanoDto;
    }

    @Override
    public tblTamanoEntity tblTamanoDtoTotblTamanoEntity(tblTamanoDto Dto) {
        if ( Dto == null ) {
            return null;
        }

        tblTamanoEntity tblTamanoEntity = new tblTamanoEntity();

        tblTamanoEntity.setIdTamano( Dto.getIdTamano() );
        tblTamanoEntity.setTamano( Dto.getTamano() );

        return tblTamanoEntity;
    }

    @Override
    public tblMensajeroDto tblMensajeroEntityTotblMensajeroDto(tblMensajeroEntity Entidad) {
        if ( Entidad == null ) {
            return null;
        }

        tblMensajeroDto tblMensajeroDto = new tblMensajeroDto();

        tblMensajeroDto.setApellidoM( Entidad.getApellidoM() );
        tblMensajeroDto.setApellidoP( Entidad.getApellidoP() );
        tblMensajeroDto.setContrasena( Entidad.getContrasena() );
        tblMensajeroDto.setIdMensajero( Entidad.getIdMensajero() );
        tblMensajeroDto.setNombre( Entidad.getNombre() );
        tblMensajeroDto.setUsuario( Entidad.getUsuario() );

        return tblMensajeroDto;
    }

    @Override
    public tblMensajeroEntity tblMensajeroDtoTotblMensajeroEntity(tblMensajeroDto Dto) {
        if ( Dto == null ) {
            return null;
        }

        tblMensajeroEntity tblMensajeroEntity = new tblMensajeroEntity();

        tblMensajeroEntity.setApellidoM( Dto.getApellidoM() );
        tblMensajeroEntity.setApellidoP( Dto.getApellidoP() );
        tblMensajeroEntity.setContrasena( Dto.getContrasena() );
        tblMensajeroEntity.setIdMensajero( Dto.getIdMensajero() );
        tblMensajeroEntity.setNombre( Dto.getNombre() );
        tblMensajeroEntity.setUsuario( Dto.getUsuario() );

        return tblMensajeroEntity;
    }

    @Override
    public tblContactoMensajeroEntity tblContactoMensajeroDtoTotblContactoMensajeroEntity(tblContactoMensajeroDto Dto) {
        if ( Dto == null ) {
            return null;
        }

        tblContactoMensajeroEntity tblContactoMensajeroEntity = new tblContactoMensajeroEntity();

        tblContactoMensajeroEntity.setContacto( Dto.getContacto() );
        tblContactoMensajeroEntity.setIdContactoMensajero( Dto.getIdContactoMensajero() );

        return tblContactoMensajeroEntity;
    }

    @Override
    public tblContactoMensajeroDto tblContactoMensajeroEntityTotblContactoMensajeroDto(tblContactoMensajeroEntity Entidad) {
        if ( Entidad == null ) {
            return null;
        }

        tblContactoMensajeroDto tblContactoMensajeroDto = new tblContactoMensajeroDto();

        tblContactoMensajeroDto.setIdContactoMensajero( Entidad.getIdContactoMensajero() );
        tblContactoMensajeroDto.setContacto( Entidad.getContacto() );

        return tblContactoMensajeroDto;
    }

    @Override
    public tblEnvioDto tblEnvioEntityTotblEnvioDto(tblEnvioEntity entidad) {
        if ( entidad == null ) {
            return null;
        }

        tblEnvioDto tblEnvioDto = new tblEnvioDto();

        tblEnvioDto.setIdEnvio( entidad.getIdEnvio() );
        tblEnvioDto.setInstrucciones( entidad.getInstrucciones() );
        tblEnvioDto.setCodigoSeguimiento( entidad.getCodigoSeguimiento() );
        tblEnvioDto.setCodigoRecepcion( entidad.getCodigoRecepcion() );
        tblEnvioDto.setCodigoEnvio( entidad.getCodigoEnvio() );

        return tblEnvioDto;
    }

    @Override
    public tblEnvioEntity tblEnvioDtoTotblEnvioEntity(tblEnvioDto Dto) {
        if ( Dto == null ) {
            return null;
        }

        tblEnvioEntity tblEnvioEntity = new tblEnvioEntity();

        tblEnvioEntity.setCodigoEnvio( Dto.getCodigoEnvio() );
        tblEnvioEntity.setCodigoRecepcion( Dto.getCodigoRecepcion() );
        tblEnvioEntity.setCodigoSeguimiento( Dto.getCodigoSeguimiento() );
        tblEnvioEntity.setIdEnvio( Dto.getIdEnvio() );
        tblEnvioEntity.setInstrucciones( Dto.getInstrucciones() );

        return tblEnvioEntity;
    }
}
