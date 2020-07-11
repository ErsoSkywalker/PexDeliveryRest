package com.Beruon.PexDelivery.Assembler;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Beruon.PexDelivery.Entities.tblContactosPersonaEntity;
import com.Beruon.PexDelivery.Mapper.tblPymeMapper;
import com.Beruon.PexDelivery.Resources.tblContactosPersonaResource;
import com.Beruon.PexDelivery.dto.tblContactosPersonaDto;
import com.Beruon.PexDelivery.dto.tblPersonaDto;
import com.Beruon.PexDelivery.dto.tblStatusDto;
import com.Beruon.PexDelivery.dto.tblTipoContactoDto;


@Component
public class tblContactosPersonaAssembler extends JaxRsResourceAssemblerSupport<tblContactosPersonaEntity, tblContactosPersonaDto>{

	@Autowired
	private tblStatusAssembler StatusAssembler;
	@Autowired
	private tblTipoContactoAssembler TipoContactoAssembler;
	@Autowired
	private tblPersonaAssembler PersonaAssembler;
	
private tblPymeMapper mapper = Mappers.getMapper(tblPymeMapper.class);

	
	public tblContactosPersonaAssembler() {
		super(tblContactosPersonaResource.class, tblContactosPersonaDto.class);
	}


	@Override
	public tblContactosPersonaDto toResource(tblContactosPersonaEntity entity) {
		tblContactosPersonaDto ContactosPersona = createResourceWithId(entity.getIdContactoPersona(), entity);
		tblContactosPersonaDto result = mapper.tblContactosPersonaEntityTotblContactosPersonaDto(entity);
        tblStatusDto Status = StatusAssembler.toResource(entity.getStatusEntity());
        tblPersonaDto Persona = PersonaAssembler.toResource(entity.getPersonaEntity());
        tblTipoContactoDto TipoContacto = TipoContactoAssembler.toResource(entity.getTipoContactoEntity());
		result.add(ContactosPersona.getLinks());
		result.setStatusDto(Status);
		result.setPersonaDto(Persona);
		result.setTipoContactoDto(TipoContacto);
		return result;
	}
	
	
	
}
