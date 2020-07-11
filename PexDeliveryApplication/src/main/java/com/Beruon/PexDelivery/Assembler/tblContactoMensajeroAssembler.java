package com.Beruon.PexDelivery.Assembler;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Beruon.PexDelivery.Entities.tblContactoMensajeroEntity;
import com.Beruon.PexDelivery.Mapper.tblPymeMapper;
import com.Beruon.PexDelivery.Resources.tblContactoMensajeroResource;
import com.Beruon.PexDelivery.dto.tblContactoMensajeroDto;
import com.Beruon.PexDelivery.dto.tblMensajeroDto;
import com.Beruon.PexDelivery.dto.tblStatusDto;
import com.Beruon.PexDelivery.dto.tblTipoContactoDto;

@Component
public class tblContactoMensajeroAssembler extends JaxRsResourceAssemblerSupport<tblContactoMensajeroEntity, tblContactoMensajeroDto>{

	@Autowired
	private tblStatusAssembler StatusAssembler;
	@Autowired
	private tblTipoContactoAssembler TipoContactoAssembler;
	@Autowired
	private tblMensajeroAssembler MensajeroAssembler;
	
private tblPymeMapper mapper = Mappers.getMapper(tblPymeMapper.class);

	
	public tblContactoMensajeroAssembler() {
		super(tblContactoMensajeroResource.class, tblContactoMensajeroDto.class);
	}


	@Override
	public tblContactoMensajeroDto toResource(tblContactoMensajeroEntity entity) {
		tblContactoMensajeroDto ContactosPersona = createResourceWithId(entity.getIdContactoMensajero(), entity);
		tblContactoMensajeroDto result = mapper.tblContactoMensajeroEntityTotblContactoMensajeroDto(entity);
        tblStatusDto Status = StatusAssembler.toResource(entity.getStatusEntity());
        tblMensajeroDto Mensajero = MensajeroAssembler.toResource(entity.getMensajeroEntity());
        tblTipoContactoDto TipoContacto = TipoContactoAssembler.toResource(entity.getTipoContactoEntity());
		result.add(ContactosPersona.getLinks());
		result.setStatusDto(Status);
		result.setMensajeroDto(Mensajero);
		result.setTipoContactoDto(TipoContacto);
		return result;
	}
	
}
