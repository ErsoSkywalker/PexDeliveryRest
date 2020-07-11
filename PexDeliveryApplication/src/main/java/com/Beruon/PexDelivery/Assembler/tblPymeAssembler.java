package com.Beruon.PexDelivery.Assembler;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Beruon.PexDelivery.Entities.tblPymeEntity;
import com.Beruon.PexDelivery.Mapper.tblPymeMapper;
import com.Beruon.PexDelivery.Resources.tblPymeResource;
import com.Beruon.PexDelivery.dto.tblPymeDto;
import com.Beruon.PexDelivery.dto.tblStatusDto;

/**
 * @author ChristianOntiveros
 *
 */
@Component
public class tblPymeAssembler extends JaxRsResourceAssemblerSupport<tblPymeEntity, tblPymeDto> {

	@Autowired
	private tblStatusAssembler StatusAssembler;
	
	private tblPymeMapper mapper = Mappers.getMapper(tblPymeMapper.class);

	public tblPymeAssembler() {
		super(tblPymeResource.class, tblPymeDto.class);
	}

	@Override
	public tblPymeDto toResource(tblPymeEntity entity) {
		tblPymeDto Pyme = createResourceWithId(entity.getIdPyme(), entity);
		tblPymeDto result = mapper.tblPymeEntityTotblPymeDto(entity);
        tblStatusDto Status = StatusAssembler.toResource(entity.getStatusEntity());
		result.add(Pyme.getLinks());
		result.setStatusDto(Status);
		return result;
	}
}
