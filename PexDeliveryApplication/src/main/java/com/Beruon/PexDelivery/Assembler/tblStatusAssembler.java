package com.Beruon.PexDelivery.Assembler;

import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import com.Beruon.PexDelivery.Entities.tblStatusEntity;
import com.Beruon.PexDelivery.Mapper.tblPymeMapper;
import com.Beruon.PexDelivery.Resources.tblStatusResource;
import com.Beruon.PexDelivery.dto.tblStatusDto;

@Component
public class tblStatusAssembler extends JaxRsResourceAssemblerSupport<tblStatusEntity, tblStatusDto> {

	private tblPymeMapper mapper = Mappers.getMapper(tblPymeMapper.class);

	public tblStatusAssembler() {
		super(tblStatusResource.class, tblStatusDto.class);
	}

	

	@Override
	public tblStatusDto toResource(tblStatusEntity entity) {
		tblStatusDto Status = createResourceWithId(entity.getIdStatus(), entity);
		tblStatusDto result = mapper.tblStatusEntityTotblStatusDto(entity);
		result.add(Status.getLinks());
		return result;
	}
}
