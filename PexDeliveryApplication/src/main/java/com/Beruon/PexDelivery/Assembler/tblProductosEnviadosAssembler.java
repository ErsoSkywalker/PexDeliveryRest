package com.Beruon.PexDelivery.Assembler;

import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import com.Beruon.PexDelivery.Entities.tblProductosEnviadosEntity;
import com.Beruon.PexDelivery.Mapper.tblPymeMapper;
import com.Beruon.PexDelivery.Resources.tblProductosEnviadosResource;
import com.Beruon.PexDelivery.dto.tblProductosEnviadosDto;

@Component
public class tblProductosEnviadosAssembler
		extends JaxRsResourceAssemblerSupport<tblProductosEnviadosEntity, tblProductosEnviadosDto> {


	private tblPymeMapper mapper = Mappers.getMapper(tblPymeMapper.class);

	public tblProductosEnviadosAssembler() {
		super(tblProductosEnviadosResource.class, tblProductosEnviadosDto.class);
	}

	@Override
	public tblProductosEnviadosDto toResource(tblProductosEnviadosEntity entity) {
		tblProductosEnviadosDto Producto = createResourceWithId(entity.getIdProductoEnviado(), entity);
		tblProductosEnviadosDto result = mapper.tblProductosEnviadosEntityTotblProductosEnviadosDto(entity);
		result.add(Producto.getLinks());
		return result;
	}
}
