package com.Beruon.PexDelivery.Assembler;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Beruon.PexDelivery.Entities.tblMensajeroEntity;
import com.Beruon.PexDelivery.Mapper.tblPymeMapper;
import com.Beruon.PexDelivery.Resources.tblMensajeroResource;
import com.Beruon.PexDelivery.dto.tblMensajeroDto;
import com.Beruon.PexDelivery.dto.tblTamanoDto;

@Component
public class tblMensajeroAssembler extends JaxRsResourceAssemblerSupport<tblMensajeroEntity, tblMensajeroDto>{

	@Autowired
	private tblTamanoAssembler TamanoAssembler;
	
	private tblPymeMapper mapper = Mappers.getMapper(tblPymeMapper.class);

	public tblMensajeroAssembler() {
		super(tblMensajeroResource.class, tblMensajeroDto.class);
	}

	@Override
	public tblMensajeroDto toResource(tblMensajeroEntity entity) {
		tblMensajeroDto Mensajero = createResourceWithId(entity.getIdMensajero(), entity);
		tblMensajeroDto result = mapper.tblMensajeroEntityTotblMensajeroDto(entity);
        tblTamanoDto Tamano = TamanoAssembler.toResource(entity.getTamanoEntity());
		result.add(Mensajero.getLinks());
		result.setTamanoDto(Tamano);
		return result;
	}
	
}
