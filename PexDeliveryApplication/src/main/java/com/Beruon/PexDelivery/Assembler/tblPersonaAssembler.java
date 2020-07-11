package com.Beruon.PexDelivery.Assembler;

import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import com.Beruon.PexDelivery.Entities.tblPersonaEntity;
import com.Beruon.PexDelivery.Mapper.tblPymeMapper;
import com.Beruon.PexDelivery.Resources.tblPersonaResource;
import com.Beruon.PexDelivery.dto.tblPersonaDto;

@Component
public class tblPersonaAssembler extends JaxRsResourceAssemblerSupport<tblPersonaEntity, tblPersonaDto>{

	private tblPymeMapper mapper = Mappers.getMapper(tblPymeMapper.class);

	public tblPersonaAssembler() {
		super(tblPersonaResource.class, tblPersonaDto.class);
	}

	@Override
	public tblPersonaDto toResource(tblPersonaEntity entity) {
		tblPersonaDto EmpleadosPyme = createResourceWithId(entity.getIdPersona(), entity);
		tblPersonaDto result = mapper.tblPersonaEntityTotblPersonaDto(entity);
		result.add(EmpleadosPyme.getLinks());
		return result;
	}
	
}
