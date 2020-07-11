package com.Beruon.PexDelivery.Assembler;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Beruon.PexDelivery.Entities.tblDireccionesPersonaEntity;
import com.Beruon.PexDelivery.Mapper.tblPymeMapper;
import com.Beruon.PexDelivery.Resources.tblDireccionesPersonaResource;
import com.Beruon.PexDelivery.dto.tblDireccionesPersonaDto;
import com.Beruon.PexDelivery.dto.tblPersonaDto;
import com.Beruon.PexDelivery.dto.tblStatusDto;

@Component
public class tblDireccionesPersonaAssembler extends JaxRsResourceAssemblerSupport<tblDireccionesPersonaEntity, tblDireccionesPersonaDto>{

	
	@Autowired
	private tblStatusAssembler StatusAssembler;
	@Autowired
	private tblPersonaAssembler PersonaAssembler;
	
	private tblPymeMapper mapper = Mappers.getMapper(tblPymeMapper.class);
	
	public tblDireccionesPersonaAssembler() {
		super(tblDireccionesPersonaResource.class, tblDireccionesPersonaDto.class);
	}

	@Override
	public tblDireccionesPersonaDto toResource(tblDireccionesPersonaEntity entity) {
		tblDireccionesPersonaDto DireccionesPersona = createResourceWithId(entity.getIdDireccionPersona(), entity);
		tblDireccionesPersonaDto result = mapper.tblDireccionesPersonaEntityTotblDireccionesPersonaDto(entity);
        tblStatusDto Status = StatusAssembler.toResource(entity.getStatusEntity());
        tblPersonaDto Persona = PersonaAssembler.toResource(entity.getPersonaEntity());
		result.add(DireccionesPersona.getLinks());
		result.setStatusDto(Status);
		result.setPersonaDto(Persona);
		return result;
	}

	
}
