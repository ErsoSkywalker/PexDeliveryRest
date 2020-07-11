package com.Beruon.PexDelivery.Assembler;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Beruon.PexDelivery.Entities.tblDireccionesPymeEntity;
import com.Beruon.PexDelivery.Mapper.tblPymeMapper;
import com.Beruon.PexDelivery.Resources.tblDireccionesPymeResource;
import com.Beruon.PexDelivery.dto.tblDireccionesPymeDto;
import com.Beruon.PexDelivery.dto.tblPymeDto;
import com.Beruon.PexDelivery.dto.tblStatusDto;

@Component
public class tblDireccionesPymeAssembler extends JaxRsResourceAssemblerSupport<tblDireccionesPymeEntity, tblDireccionesPymeDto>{

	@Autowired
	private tblStatusAssembler StatusAssembler;
	@Autowired
	private tblPymeAssembler PymeAssembler;
	
	private tblPymeMapper mapper = Mappers.getMapper(tblPymeMapper.class);
	
	public tblDireccionesPymeAssembler() {
		super(tblDireccionesPymeResource.class, tblDireccionesPymeDto.class);
	}
	
	@Override
	public tblDireccionesPymeDto toResource(tblDireccionesPymeEntity entity) {

		tblDireccionesPymeDto DireccionesPyme = createResourceWithId(entity.getIdDireccionesPyme(), entity);
		tblDireccionesPymeDto result = mapper.tblDireccionesPymeEntityTotblDireccionesPymeDto(entity);
        tblStatusDto Status = StatusAssembler.toResource(entity.getStatusEntity());
        tblPymeDto Pyme = PymeAssembler.toResource(entity.getPymeEntity());
		result.add(DireccionesPyme.getLinks());
		result.setStatusDto(Status);
		result.setPymeDto(Pyme);
		return result;
	}

}
