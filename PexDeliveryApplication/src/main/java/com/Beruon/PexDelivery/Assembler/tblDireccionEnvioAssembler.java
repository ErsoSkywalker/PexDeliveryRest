package com.Beruon.PexDelivery.Assembler;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Beruon.PexDelivery.Entities.tblDireccionEnvioEntity;
import com.Beruon.PexDelivery.Mapper.tblPymeMapper;
import com.Beruon.PexDelivery.Resources.tblDireccionEnvioResource;
import com.Beruon.PexDelivery.dto.tblCodigosPostalesDto;
import com.Beruon.PexDelivery.dto.tblDireccionEnvioDto;


@Component
public class tblDireccionEnvioAssembler extends JaxRsResourceAssemblerSupport<tblDireccionEnvioEntity, tblDireccionEnvioDto>{

	
	@Autowired
	private tblCodigosPostalesAssembler CodigosPostales;
	
	private tblPymeMapper mapper = Mappers.getMapper(tblPymeMapper.class);
	
	public tblDireccionEnvioAssembler() {
		super(tblDireccionEnvioResource.class, tblDireccionEnvioDto.class);
	}

	@Override
	public tblDireccionEnvioDto toResource(tblDireccionEnvioEntity entity) {
		tblDireccionEnvioDto DireccionesEnvio = createResourceWithId(entity.getIdDireccionEnvio(), entity);
		tblDireccionEnvioDto result = mapper.tblDireccionEnvioEntityTotblDireccionEnvioDto(entity);
        tblCodigosPostalesDto Codigos = CodigosPostales.toResource(entity.getCodigosPostalesEntity());
		result.add(DireccionesEnvio.getLinks());
		result.setCodigosPostales(Codigos);
		return result;
	}
	
}
