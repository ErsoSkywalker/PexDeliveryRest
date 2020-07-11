package com.Beruon.PexDelivery.Assembler;

import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import com.Beruon.PexDelivery.Entities.tblTipoContactoEntity;
import com.Beruon.PexDelivery.Mapper.tblPymeMapper;
import com.Beruon.PexDelivery.Resources.tblTipoContactoResource;
import com.Beruon.PexDelivery.dto.tblTipoContactoDto;

@Component
public class tblTipoContactoAssembler extends JaxRsResourceAssemblerSupport<tblTipoContactoEntity, tblTipoContactoDto> {

	private tblPymeMapper mapper = Mappers.getMapper(tblPymeMapper.class);

	public tblTipoContactoAssembler() {
		super(tblTipoContactoResource.class, tblTipoContactoDto.class);
	}

	@Override
	public tblTipoContactoDto toResource(tblTipoContactoEntity entity) {
		tblTipoContactoDto TipoContacto = createResourceWithId(entity.getIdTipoContacto(), entity);
		tblTipoContactoDto result = mapper.tblTipoContactoEntityTotblTipoContactoDto(entity);
		result.add(TipoContacto.getLinks());
		return result;
	}

	
}
