package com.Beruon.PexDelivery.Mapper;

import org.mapstruct.Mapper;

import com.Beruon.PexDelivery.Entities.tblCodigosPostalesEntity;
import com.Beruon.PexDelivery.Entities.tblContactoMensajeroEntity;
import com.Beruon.PexDelivery.Entities.tblContactosPersonaEntity;
import com.Beruon.PexDelivery.Entities.tblContactosPymeEntity;
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
import com.Beruon.PexDelivery.Entities.tblDireccionEnvioEntity;
import com.Beruon.PexDelivery.Entities.tblDireccionesPersonaEntity;

@Mapper
public interface tblPymeMapper {

	tblContactosPymeDto tblContactosPymeEntityTotblContactosPymeDto(tblContactosPymeEntity entidad);

	tblContactosPymeEntity tblContactosPymeDtoTotblContactosPymeEntity(tblContactosPymeDto Dto);

	tblPymeDto tblPymeEntityTotblPymeDto(tblPymeEntity entidad);

	tblPymeEntity tblPymeDtoTotblPymeEntity(tblPymeDto Dto);

	tblStatusDto tblStatusEntityTotblStatusDto(tblStatusEntity entidad);

	tblStatusEntity tblStatusDtoTotblStatusEntity(tblStatusDto Dto);

	tblTipoContactoDto tblTipoContactoEntityTotblTipoContactoDto(tblTipoContactoEntity entidad);

	tblTipoContactoEntity tblTipoContactoDtoTotblTipoContactoEntity(tblTipoContactoDto Dto);

	tblEmpleadosPymeEntity tblEmpleadosPymeDtoTotblEmpleadosPymeEntity(tblEmpleadosPymeDto Dto);

	tblEmpleadosPymeDto tblEmpleadosPymeEntityTotblEmpleadosPymeDto(tblEmpleadosPymeEntity entidad);

	tblDireccionesPymeEntity tblDireccionesPymeDtoTotblDireccionesPymeEntity(tblDireccionesPymeDto Dto);

	tblDireccionesPymeDto tblDireccionesPymeEntityTotblDireccionesPymeDto(tblDireccionesPymeEntity entidad);

	tblProductosEntity tblProductosDtoTotblProductosEntity(tblProductosDto Dto);

	tblProductosDto tblProductosEntityTotblProcutosDto(tblProductosEntity entidad);

	tblProductosEnviadosEntity tblProductosEnviadosDtoTotblProductosEnviadosEntity(tblProductosEnviadosDto Dto);

	tblProductosEnviadosDto tblProductosEnviadosEntityTotblProductosEnviadosDto(tblProductosEnviadosEntity entidad);

	tblCodigosPostalesDto tblCodigosPostalesEntityTotblCodigosPostalesDto(tblCodigosPostalesEntity entidad);

	tblCodigosPostalesEntity tblCodigosPostalesDtoTotblCodigosPostalesEntity(tblCodigosPostalesDto Dto);

	tblDireccionEnvioDto tblDireccionEnvioEntityTotblDireccionEnvioDto(tblDireccionEnvioEntity Entidad);

	tblDireccionEnvioEntity tblDireccionEnvioDtoTotblDireccionEnvioEntity(tblDireccionEnvioDto Dto);

	tblPersonaEntity tblPersonaDtoTotblPersonaEntity(tblPersonaDto Dto);

	tblPersonaDto tblPersonaEntityTotblPersonaDto(tblPersonaEntity Entidad);

	tblContactosPersonaEntity tblContactosPersonaDtoTotblContactosPersonaEntity(tblContactosPersonaDto Dto);

	tblContactosPersonaDto tblContactosPersonaEntityTotblContactosPersonaDto(tblContactosPersonaEntity Entidad);

	tblDireccionesPersonaDto tblDireccionesPersonaEntityTotblDireccionesPersonaDto(tblDireccionesPersonaEntity Entidad);

	tblDireccionesPersonaEntity tblDireccionesPersonaDtoTotblDireccionesPersonaEntity(tblDireccionesPersonaDto Dto);

	tblTamanoDto tblTamanoEntityTotblTamanoDto(tblTamanoEntity entidad);

	tblTamanoEntity tblTamanoDtoTotblTamanoEntity(tblTamanoDto Dto);

	tblMensajeroDto tblMensajeroEntityTotblMensajeroDto(tblMensajeroEntity Entidad);

	tblMensajeroEntity tblMensajeroDtoTotblMensajeroEntity(tblMensajeroDto Dto);

	tblContactoMensajeroEntity tblContactoMensajeroDtoTotblContactoMensajeroEntity(tblContactoMensajeroDto Dto);

	tblContactoMensajeroDto tblContactoMensajeroEntityTotblContactoMensajeroDto(tblContactoMensajeroEntity Entidad);

	tblEnvioDto tblEnvioEntityTotblEnvioDto(tblEnvioEntity entidad);

	tblEnvioEntity tblEnvioDtoTotblEnvioEntity(tblEnvioDto Dto);

}
