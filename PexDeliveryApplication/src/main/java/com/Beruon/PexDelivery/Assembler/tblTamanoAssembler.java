package com.Beruon.PexDelivery.Assembler;

import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import com.Beruon.PexDelivery.Entities.tblTamanoEntity;
import com.Beruon.PexDelivery.Mapper.tblPymeMapper;
import com.Beruon.PexDelivery.Resources.tblTamanoResource;
import com.Beruon.PexDelivery.dto.tblTamanoDto;

@Component
public class tblTamanoAssembler extends JaxRsResourceAssemblerSupport<tblTamanoEntity, tblTamanoDto>{

	private tblPymeMapper mapper = Mappers.getMapper(tblPymeMapper.class);

	public tblTamanoAssembler() {
		super(tblTamanoResource.class, tblTamanoDto.class);
	}

	@Override
	public tblTamanoDto toResource(tblTamanoEntity entity) {
		tblTamanoDto Tamano = createResourceWithId(entity.getIdTamano(), entity);
		tblTamanoDto result = mapper.tblTamanoEntityTotblTamanoDto(entity);
		result.add(Tamano.getLinks());
		return result;
	}
	
}
