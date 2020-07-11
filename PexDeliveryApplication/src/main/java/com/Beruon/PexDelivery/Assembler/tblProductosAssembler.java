package com.Beruon.PexDelivery.Assembler;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Beruon.PexDelivery.Entities.tblProductosEntity;
import com.Beruon.PexDelivery.Mapper.tblPymeMapper;
import com.Beruon.PexDelivery.Resources.tblProductosResource;
import com.Beruon.PexDelivery.dto.tblProductosDto;
import com.Beruon.PexDelivery.dto.tblPymeDto;
import com.Beruon.PexDelivery.dto.tblStatusDto;


@Component
public class tblProductosAssembler extends JaxRsResourceAssemblerSupport<tblProductosEntity, tblProductosDto> {

	@Autowired
	private tblStatusAssembler StatusAssembler;
	@Autowired
	private tblPymeAssembler PymeAssembler;
	
	private tblPymeMapper mapper = Mappers.getMapper(tblPymeMapper.class);

	public tblProductosAssembler() {
		super(tblProductosResource.class, tblProductosDto.class);
	}

	@Override
	public tblProductosDto toResource(tblProductosEntity entity) {
		tblProductosDto Producto = createResourceWithId(entity.getIdProducto(), entity);
		tblProductosDto result = mapper.tblProductosEntityTotblProcutosDto(entity);
        tblStatusDto Status = StatusAssembler.toResource(entity.getStatusEntity());
        tblPymeDto Pyme = PymeAssembler.toResource(entity.getPymeEntity());
		result.add(Producto.getLinks());
		result.setStatusDto(Status);
		result.setPymeDto(Pyme);
		return result;
	}

}
