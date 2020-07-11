package com.Beruon.PexDelivery.Assembler;

import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import com.Beruon.PexDelivery.Entities.tblCodigosPostalesEntity;
import com.Beruon.PexDelivery.Mapper.tblPymeMapper;
import com.Beruon.PexDelivery.Resources.tblCodigosPostalesResource;
import com.Beruon.PexDelivery.dto.tblCodigosPostalesDto;

@Component
public class tblCodigosPostalesAssembler extends JaxRsResourceAssemblerSupport<tblCodigosPostalesEntity, tblCodigosPostalesDto>{

	private tblPymeMapper mapper = Mappers.getMapper(tblPymeMapper.class);

	public tblCodigosPostalesAssembler() {
		super(tblCodigosPostalesResource.class, tblCodigosPostalesDto.class);
	}
	
	

	@Override
	public tblCodigosPostalesDto toResource(tblCodigosPostalesEntity entity) {
		tblCodigosPostalesDto CodigoPostal = createResourceWithId(entity.getIdCodigoPostal(), entity);
		tblCodigosPostalesDto result = mapper.tblCodigosPostalesEntityTotblCodigosPostalesDto(entity);
		result.add(CodigoPostal.getLinks());
		return result;
	}

}
